package lesson9;

import static java.lang.System.*;

import java.util.Scanner;

class MyPoint {

	//フィールド
	private int x;
	private int y;

	//コンストラクタ
	MyPoint() {
		setX(0);
		setY(0);
	}

	MyPoint(int px, int py) {
		setX(px);
		setY(py);
	}

	//メソッド

	//X座標を設定する
	public void setX(int px) {
		if (px >= 0 && px <= 100) //pxが0~100なら
		{
			x = px;
			out.println("X座標を" + getX() + "に設定しました。");
		} else if (px < 0 || px > 100) //pxが0未満か100より大きいなら
		{
			out.println("X座標は0~100でおなしゃーす。");
			out.println("現在のX座標は" + getX() + "でーす");
		}
		//else
//		{
//		例外	
//		}
	}

	//Y座標を設定する
	public void setY(int py) {
		if (py >= 0 && py <= 100) //pyが0~100なら
		{
			y = py;
			out.println("Y座標を" + getY() + "に設定しました。");
		} else if (py < 0 || py > 100) //pyが0未満か100より大きいなら
		{
			out.println("Y座標は0~100でおなしゃーす。");
			out.println("現在のY座標は" + getY() + "でーす");
		}
		//else
//		{
//		例外	
//		}
	}

	//X座標を得る
	public int getX() {
		return x;
	}

	//Y座標を得る
	public int getY() {
		return y;
	}

}

public class SampleP5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("X座標とY座標を入力するのぢゃな");
		
		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		MyPoint cie = new MyPoint(x,y);
		
////		cie.setX(sc.nextInt());
//		cie.setX(x);
////		cie.setY(sc.nextInt());
//		cie.setY(y);
		
		sc.close();

	}

}
