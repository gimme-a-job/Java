package lesson16;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
//import javax.print.DocFlavor.URL;
import java.net.URL;

public class SampleP5 extends Frame implements Runnable//フレームクラスを拡張します
{
	
	
	//フィールド
	private Label lb; 
	
	private Button bt;
	
	Image im;
	Image p3im;
	
	int x = 10;
	int y = 10;
	
	int num;
	

	public static void main(String[] args) throws Exception
	{
		// TODO 自動生成されたメソッド・スタブ
		SampleP5 sm = new SampleP5(); //拡張したクラスからオブジェクトを作成します。

	}
	public SampleP5() throws MalformedURLException
	{
		super("サンプル"); //ウィンドウのタイトルを設定しています。
		
		lb = new Label("Hello"); //ラベルを作成します
				
		add(lb); //ラベルを追加します
					
		lb.setForeground(Color.blue); //文字色を設定します
		lb.setFont(new Font("Serif", Font.ITALIC, 32)); //フォントを設定します
		
		bt= new Button("ようこそ。"); //ボタンを作成します
//		add(bt); //ボタンを追加します
//		bt.setVisible(true);
		bt.setVisible(false); //検証のため追加
		
		Toolkit tk = getToolkit(); //ツールキットを取得して・・・・
		im = tk.getImage("Image.jpg"); //画像を取得します
//		p3im = tk.getImage("Image.jpg"); //LessonP4
//		p3im = tk.getImage("https://p1.sa123.cc/wwlsj_qsp/iJZDmWQGslfcSg9sl50Isl322IMzfUCXwrjml2DcOvFqyuslDRlo00cVyNhMbbskwslEDt0LmZiRcuAwaOVwp9nx2Fkg.jpg");
		URL url = new URL("https://p1.sa123.cc/wwlsj_qsp/iJZDmWQGslfcSg9sl50Isl322IMzfUCXwrjml2DcOvFqyuslDRlo00cVyNhMbbskwslEDt0LmZiRcuAwaOVwp9nx2Fkg.jpg"); //"https://stackoverflow.com/questions/10292792/getting-image-from-url-java"より
		p3im = tk.getImage(url);
		
		addWindowListener(new SampleWindowListener());
		addMouseListener(new SampleMouseAdapter());
//		addMouseListener(new SampleMouseListener()); //p512 SampleP4⇒しっぱい
		lb.addMouseListener(new SampleMouseListener()); //p512 SampleP4
		bt.addActionListener(new SampleActionListener()); //イベントを受け取ることができるようにします
		bt.addMouseListener(new SampleMouseListener());
		
		Thread th = new Thread(this); //新しいスレッドを開始します
		th.start();
		
		setSize(250, 200); //ウィンドウのサイズを設定します
		setVisible(true); //ウィンドウが表示されるようにします
	}
	
	public void run() //スレッドの処理です
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				num = i;
				x += i*10; //SapmleP5
//				y += i*10; //SapmleP5
//				lb.setLocation(x, y); //SapmleP5
				repaint(); //描画を
				Thread.sleep(1000); //１秒ごとに行うようにします
			}
			
		}catch(InterruptedException e) {}
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(im, 100,100,this);
		
		g.setColor(Color.RED); //図形を描画する処理を行います
		g.fillOval(x, y, 10, 10);
		
		String str = num + "です。";
		g.drawString(str, 100, 100); //文字が描画されるようにしておきます
		
		g.drawRect(50, 50, 100, 100); //p517
//		g.fillRect(50, 50, 100, 100); //p517 SampleP2
		
		g.drawImage(p3im, x,y,this);  //SampleP3
		
		lb.setLocation(x, y); //SapmleP5
		
	}
	
	class SampleWindowListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent e) //ウィンドウを閉じることができるようにします
		{
			System.exit(0);
		}
	}
	
	class SampleActionListener implements ActionListener //イベントを処理するリスナです
	{
		public void actionPerformed(ActionEvent e) //イベントが発生した際に呼び出されます
		{
			bt.setLabel("こんにちは。");
		}
	}
	
	class SampleMouseAdapter extends MouseAdapter
	{
		public void mousePressed(MouseEvent e) //マウスを押したときに・・・
		{
			x = e.getX(); //押した位置を取得します
			y = e.getY(); 
			repaint(); //図形が描画されるようにします
		}
	}
	
	class SampleMouseListener implements MouseListener
	{
		public void mouseClicked(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) 
		{
			bt.setLabel("いらっしゃいませ");
			
			lb.setText("こんにちは"); //SampleP4
			lb.setLocation(100, 100); //SampleP4
		}
		public void mouseExited(MouseEvent e)
		{
			bt.setLabel("ようこそ。");
			
			lb.setText("さようなら"); //SampleP4
			lb.setLocation(100, 100); //SampleP4
		}
	}

}
