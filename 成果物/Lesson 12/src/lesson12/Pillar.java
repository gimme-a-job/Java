package lesson12;

import static java.lang.System.*;

import java.util.Scanner;

public class Pillar {
	
	private double verticalheight;
	
	private double area;
	
	private double volume;
	
	private String shapename;
	
	private Scanner sc = new Scanner(System.in);
	
	//コンストラクタ------------------------------------------------------------------------------------------
		public Pillar(double verticalheight, double area)
		{
			setVolume(verticalheight,area); //引数を元に"体積"を計算してフィールド変数に代入
		}
		
		
		//以下メソッド---------------------------------------------------------------------------------------------
		
		//フィールド変数に値を設定
		public double setVerticalHeight() //メッセージを表示して高さの入力を促し、フィールド変数に代入、
		{
			out.println("高さを入力してください。");
			this.verticalheight = readInputInt(); //『入力待機＆読み取りメソッド』をコールして、代入
			return this.verticalheight;
		}
		
		public void setVerticalHeight(double verticalheight) //引数をフィールド変数"垂直方向の高さ"に格納するだけ
		{
			this.verticalheight = verticalheight;
		}
		
		
		public void setArea(double area) //引数をフィールド変数"面積"に代入するだけ
		{
			this.area = area;
		}
		
		public void setVolume() //フィールド変数から"体積"を計算してフィールド変数に代入
		{
			this.volume = getArea() * getVerticalHeight();
		}
		
		public void setVolume(double area) //（使わない）"面積"を受け取ったら、まず"高さ"を入力させ、それを元に"体積"を計算してフィールド変数に代入
		{
			setArea(area);
			this.volume = getArea() * setVerticalHeight();
		}
		
		public void setVolume(double verticalheight,double area) //"垂直方向の高さ"と"面積"を受け取ったら、それを元に"体積"を計算してフィールド変数に代入
		{
			setVerticalHeight(verticalheight);
			setArea(area);
			this.volume = getArea() * getVerticalHeight();
		}
		
		public void setShapeName(String shapename) //引数をフィールド変数"図形名"に格納するだけ
		{
			this.shapename = shapename;
		}
		
		//フィールド変数を返す
		public double getVerticalHeight() //フィールド変数の"垂直方向の高さ"を返すだけ
		{
			return this.verticalheight;
		}
		
		public double getArea() //フィールド変数の"面積"を返すだけ
		{
			return this.area;
		}
		
		public double getVolume() //(既に入力されてゐる前提)"高さ"と"面積"を使って"体積"を計算してフィールド変数に格納し、それを返す
		{
			setVolume();
			return this.volume;
		}
		
		public double getVolume(double area) //（使わない）"面積"を受け取ったら、まず"高さ"を入力させ、それを元に"体積"を計算してフィールド変数に代入し、値を返す
		{
			setVolume(area);
			return this.volume;
		}
		
		public String getShapeName()//フィールド変数の"図形名"を返すだけ
		{
			return this.shapename;
		}
		
		//その他メソッド
		public void showVolume(String shapename)
		{
			setShapeName(shapename); //一応引数をフィールド変数に格納してやる
			out.println("高さが" + getVerticalHeight() + "の上記" + getShapeName() + "の" + getShapeName() + "柱の体積は" + getVolume() + "です。");
		}
		
		
		//入力読み込みメソッド
		public int readInputInt() //(使わない)"Integer"型の入力をさせるメソッド⇒このぐれぇはその都度書いたら良いか？⇒いや入力値が"Int"型じゃなかった場合の処理とか書けるからやっぱアリだな
		{
			return sc.nextInt();
		}
		
		public double readInputDouble() //"Double"型の入力をさせるメソッド
		{
			return sc.nextDouble();
		}
		
		public void scClose() //おまじない
		{
			sc.close();
		}

}
