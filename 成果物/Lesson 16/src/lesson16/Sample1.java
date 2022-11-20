package lesson16;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample1 extends Frame //フレームクラスを拡張します
{

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		Sample1 sm = new Sample1(); //拡張したクラスからオブジェクトを作成します。

	}
	public Sample1()
	{
		super("サンプル"); //ウィンドウのタイトルを設定しています。
		
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
