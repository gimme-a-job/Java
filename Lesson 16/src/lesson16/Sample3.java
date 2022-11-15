package lesson16;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample3 extends Frame //フレームクラスを拡張します
{
	private Label lb;
	
	private Button bt;

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		Sample3 sm = new Sample3(); //拡張したクラスからオブジェクトを作成します。

	}
	public Sample3()
	{
		super("サンプル"); //ウィンドウのタイトルを設定しています。
		
		lb = new Label("ようこそ"); //ラベルを作成します（不可視）
				
		add(lb); //ラベルを追加します（不可視）
					
		lb.setForeground(Color.blue); //文字色を設定します（不可視）
		lb.setFont(new Font("Serif", Font.BOLD, 24)); //フォントを設定します（不可視）
		
		bt= new Button("ようこそ。"); //ボタンを作成します
		add(bt); //ボタンを追加します
		
		addWindowListener(new SampleWindowListener());
		bt.addActionListener(new SampleActionListener()); //イベントを受け取ることができるようにします
		
		setSize(250, 200); //ウィンドウのサイズを設定します
		setVisible(true); //ウィンドウが表示されるようにします
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

}
