package lesson16;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample2 extends Frame //フレームクラスを拡張します
{
	private Label lb;

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		Sample2 sm = new Sample2(); //拡張したクラスからオブジェクトを作成します。

	}
	public Sample2()
	{
		super("サンプル"); //ウィンドウのタイトルを設定しています。
		
		lb = new Label("ようこそ"); //ラベルを作成します
		
		add(lb); //ラベルを追加します
		
		lb.setForeground(Color.blue); //文字色を設定します
		lb.setFont(new Font("Serif", Font.BOLD, 24)); //フォントを設定します
		
		
		addWindowListener(new SampleWindowListener());
		
		setSize(250, 200); //ウィンドウのサイズを設定します
		setVisible(true); //ウィンドウが表示されるようにします
	}
	
	class SampleWindowListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}

}
