package lesson11;


import static java.lang.System.*;

public class Car 

{

	public static int sum = 0;
	
//	private int num;
//	private double gas;
//	private String name;
	protected int num;
	protected double gas;
	protected String name;

	
	public Car()
//	private Car() //p284
	{
		num = 0;
		gas = 0.0;
		name = "名無し";
		sum++;
		out.println("車を作成しました。");
	}
	
	
	public Car(int n, double g)
	{
//		this();
		num = n;
		gas = g;
		out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	
	int getNum()
	{
		out.println("ナンバーを調べました。");
		return num;
	}
	
	double getGas()
	{
		out.println("ガソリン量を調べました。");
		return gas;
	}
	
	void setNum(int n)
	{
		num = n;
		out.println("ナンバーを" + num + "にしました。");
	}
	
	void setGas(double g)
	{
		gas = g;
		out.println("ガソリン量を" + gas + "にしました。");
	}
	
	public void setNumGas(int n,double g)
	{
		if(g > 0 && g < 1000)
		{
		num = n;
		gas = g;
		out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
		}
		else
		{
			out.println(g + "は正しいガソリン量ではありません。");
			out.println("ガソリン量を変更できませんでした。");
		}
	}
	
	public void setCar(int n)
	{
		num = n;
		out.println("ナンバーを" + num + "にしました。");
		
	}
	
	public void setCar(double g)
	{
		gas = g;
		out.println("ガソリン量を" + gas + "にしました。");
	}
	
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public void setName(String nm)
	{
		name = nm;
		out.println("名前を" + name + "にしました。");
	}
	

	public String toString()
	{
		String str = "ナンバー:" + num + "ガソリン量:" + gas;
		return str;
	}
	
	public static void showSum()
	{
		out.println("車は全部で"  + sum + "台あります。");
	}
	
	void show()
	{
		out.println("車のナンバーは" + num + "です。");
		out.println("ガソリン量は" + gas + "です。");
		out.println("名前は" + name + "です。");
	}
	
	void showCar()
	{
		out.println("これから車の情報を表示します。");
		show();
	}
	
}
