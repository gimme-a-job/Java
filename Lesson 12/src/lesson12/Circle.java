package lesson12;

import static java.lang.System.*;

import java.util.Scanner;

public class Circle implements Shape

{

	//フィールド変数----------------------------------------------------------------------------------
//	private int radius;
	private double radius;
	private double circumference; //"円周"って意味らしい
	private double area; //"面積"って意味らしい
//	final double pi = 3.14; //今どきって何桁？？
	final double pi = Math.PI;

	private boolean flg;//使ったり使わなかったり

	Scanner sc = new Scanner(System.in);

	//コンストラクタ---------------------------------------------------------------------------------------------
	
	public Circle() //メッセージを表示して、半径の入力を促し、入力した半径をフィールド変数に格納するメソッド
	{
		setRadius();
	}
		
//	public Circle(int radius) //引数（受け取った値）をフィールド変数に格納するだけ
	public Circle(double radius) //引数（受け取った値）をフィールド変数に格納するだけ
	{
		setRadius(radius);
	}
	
	//以下メソッド--------------------------------------------------------------------------------------------
	
	public void setRadius()  //メッセージを表示して、半径の入力を促し、入力した半径をフィールド変数に格納するメソッド
	{
		out.println("半径を入力してください。");
//		this.radius = readInputInt();
		this.radius = readInputDouble();
	}

//	public void setRadius(int radius) //引数（受け取った値）をフィールド変数に格納するだけ
	public void setRadius(double radius) //引数（受け取った値）をフィールド変数に格納するだけ
	{
		this.radius = radius;
	}

	public void setCircumference() //（半径が入力されてる前提で）円周を計算してフィールド変数に格納する
	{
		this.circumference = 2 * getPI() * getRadius();
	}

	public void setArea() //（半径が入力されてる前提で）面積を計算してフィールド変数に格納する
	{
		this.area = getRadius() * getRadius() * getPI();
	}

//	public int getRadius() //フィールド変数に格納されてゐる半径を返すだけ
	public double getRadius() //フィールド変数に格納されてゐる半径を返すだけ
	{
		return this.radius;
	}

	public double getCircumference() //（半径が入力されてる前提で）円周を計算して、円周を返す
	{
		setCircumference();
		return this.circumference;
	}

	public double getArea() //（半径が入力されてる前提で）面積を計算して、円周を返す
	{
		setArea();
		return this.area;
	}

	public double getPI() //固定値の円周率を返すだけ
	{
		return this.pi;
	}

	public void showCircumference() //（半径が入力されてる前提で）円周を計算して、下の文を表示する
	{
		out.println("円周は" + getCircumference() + "です。");
	}

	public void showArea()  //（半径が入力されてる前提で）面積を計算して、下の文を表示する
	{
		out.println("円の面積は" + getArea() + "です。");
	}
	
	public void showAreaInDetail()  //（半径が入力されてる前提で）面積を計算して、下の文を表示する
	{
		out.print("半径" + getRadius() + "の");
		showArea();
	}

	public void showResult() //（半径が入力されてる前提で）円周と面積を計算して、解答メッセージを表示する。
	{
		out.println("半径" + getRadius() + "の円の円周と面積を計算します。");
		showCircumference(); //（半径が入力されてる前提で）円周を計算して、回答メッセージを表示する
		showArea();  //（半径が入力されてる前提で）面積を計算して、回答メッセージを表示する

	}

	public int readInputInt() //"Integer"型の入力をさせるメソッド⇒このぐれぇはその都度書いたら良いか？⇒いや入力値が"Int"型じゃなかった場合の処理とか書けるからやっぱアリだな
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

	//	public boolean AskWhether2ContinueOrNot()
	//	{
	//		out.println("計算を続ける場合は「0」を、処理を終了する場合は「1」を入力してください。");
	//		
	//		int res = readInputInt();
	//		
	//		if(res == 0)
	//		{
	//			return true;
	//		}
	//		else if(res == 1)
	//		{
	//			out.println("処理を中断します。");
	//			return false;
	//		}
	//		else
	//		{
	//			out.println("\"0\"か\"1\"で入力しろっていったろバカ");
	//			out.println("このまま続けるからなー");
	//			return true;
	//		}

	public void AskWhether2ContinueOrNot() //"0"か"1"の入力を待って、"0"だったらフィールド変数のフラグを"true"に、"1"だったら"false"、その他ならもう一度聞く
	{
		out.println("計算を続ける場合は「0」を、処理を終了する場合は「1」を入力してください。");

		int res = readInputInt(); //入力させる

		if (res == 0) //"0"ならフィールド変数の"flg"を"true"にして終わり
		{
			setFlg(true);
		} else if (res == 1) //"1"ならメッセージを表示し、フィールド変数の"flg"を"false"にして終わり
		{
			out.println("処理を中断します。");
			setFlg(false);
		} else //"0"も"1"も入力しない悪い子には文句を返し、このメソッド自身をコールして、最初から聞き直す
		{
			out.println("\"0\"か\"1\"で入力しろっていったろバカ");
			AskWhether2ContinueOrNot();
		}

	}

	public void setFlg(boolean bl) //引数(TrueかFalseか)を受け取ってフィールド変数に格納するだけ
	{
		this.flg = bl;
	}

	public boolean getFlg() //フィールド変数の"flg"を返すだけ
	{
		return this.flg;
	}

	@Override
	public double calcArea() //Lesson12B2
	{
		// TODO 自動生成されたメソッド・スタブ
		
		return getArea(); //（半径が入力されてる前提で）面積を計算して、円周を返す
		
	}

}
