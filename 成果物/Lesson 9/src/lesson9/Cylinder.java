package lesson9;

import static java.lang.System.*;

public class Cylinder extends Circle
{
//	private int radius;
	private int height;
//	private double circumference; //"円周"って意味らしい
//	private double area; //"面積"って意味らしい
	private double sidearea; //"側面積"って意味らしい 
	private double surfacearea; //"表面積"って意味らしい
	private double volume; //"体積"って意味らしい
		
//	final double pi = 3.14; //今どきって何桁？？
	
	public int setHeight() //メッセージを表示して高さの入力を促し、フィールド変数に代入、
	{
		out.println("高さを入力してください。");
		this.height = super.readInputInt(); //"Circle"ママが持ってる、『入力待機＆読み取りメソッド』をコールして、代入
		return this.height;
	}
	
		
	public double setSideArea(double circumference) //（使わない）"円周"を受け取ったら、まず"高さ"を入力させ、それを元に"側面積"を計算してフィールド変数に代入
	{
		this.sidearea = circumference * setHeight();
		return this.sidearea;
	}
	
	public double setVolume(double area) //（使わない）"面積"を受け取ったら、まず"高さ"を入力させ、それを元に"体積"を計算してフィールド変数に代入
	{
		this.volume = area * setHeight();
		return this.volume;
	}
	
	public void setResult(int radius) //"半径"を受け取ったら、まず"高さ"を入力させ、それらを元に"表面積"、"体積"を計算してフィールド変数に代入、その後解答メッセージを表示
	{
		this.surfacearea = 2 * super.getPI() * radius * (setHeight() + radius);
		this.volume = super.getPI() * radius * radius * getHeight();
		out.println("表面積は" + getSurfaceArea() + "です。");
		out.println("体積は" + getVolume() + "です。");
	}
	
	public int getHeight() //フィールド変数の"高さ"を返すだけ
	{
		return this.height;
	}
	
	public double getSurfaceArea() //フィールド変数の"表面積"を返すだけ
	{
		return this.surfacearea;
	}
	
	public double getVolume() //フィールド変数の"体積"を返すだけ
	{
		return this.volume;
	}

}
