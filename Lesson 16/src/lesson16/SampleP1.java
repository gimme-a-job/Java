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

public class SampleP1 extends Frame implements Runnable//フレームクラスを拡張します
{
	
	
	//フィールド
	private Label lb; 
	
	private Button bt;
	
	Image im;
	
	int x = 10;
	int y = 10;
	
	int num;
	

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		SampleP1 sm = new SampleP1(); //拡張したクラスからオブジェクトを作成します。

	}
	public SampleP1()
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
//		im = tk.getImage("Image.jpg"); //画像を取得します
		
		addWindowListener(new SampleWindowListener());
		addMouseListener(new SampleMouseAdapter());
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
		}
		public void mouseExited(MouseEvent e)
		{
			bt.setLabel("ようこそ。");
		}
	}

}
