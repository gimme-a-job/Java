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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample5 extends Frame //フレームクラスを拡張します
{
	
	
	//フィールド
	private Label lb; //(不可視)
	
	private Button bt;
	
	Image im;
	
	

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		Sample5 sm = new Sample5(); //拡張したクラスからオブジェクトを作成します。

	}
	public Sample5()
	{
		super("サンプル"); //ウィンドウのタイトルを設定しています。
		
		lb = new Label("ようこそ"); //ラベルを作成します（不可視）
				
		add(lb); //ラベルを追加します（不可視）
					
		lb.setForeground(Color.blue); //文字色を設定します（不可視）
		lb.setFont(new Font("Serif", Font.BOLD, 24)); //フォントを設定します（不可視）
		
		bt= new Button("ようこそ。"); //ボタンを作成します
		add(bt); //ボタンを追加します
		bt.setVisible(false); //検証のため追加
		
		Toolkit tk = getToolkit(); //ツールキットを取得して・・・・
		im = tk.getImage("Image.jpg"); //画像を取得します
		
		addWindowListener(new SampleWindowListener());
		bt.addActionListener(new SampleActionListener()); //イベントを受け取ることができるようにします
		bt.addMouseListener(new SampleMouseListener());
		
		setSize(250, 200); //ウィンドウのサイズを設定します
		setVisible(true); //ウィンドウが表示されるようにします
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(im, 100,100,this);
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
