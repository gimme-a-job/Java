package lesson15;


import static java.lang.System.*;

//車クラス
public class Car extends Vehicle implements iVehicle, iMaterial, Runnable

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
	
	
	public Car(int n, double g) throws CarException
	{
	
		if(g < 0)
		{
			CarException e = new CarException();
			throw e;
		}
		
		
	else 
	{
//		this();
		num = n;
		gas = g;
		out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
		
	}
	
	
	}
	
	public Car(String nm)
	{
		name = nm;
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
	
	void setGas(double g) throws CarException
	{
		
		if(g < 0)
		{
			CarException e = new CarException();
			throw e;
		}
		
	else
	{
		gas = g;
		out.println("ガソリン量を" + gas + "にしました。");
	}
	
	}
	
	public void setNumGas(int n,double g) throws CarException
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
			
			CarException e = new CarException();
			throw e;
			
		}
	}
	
	public void setCar(int n)
	{
		num = n;
		out.println("ナンバーを" + num + "にしました。");
		
	}
	
	public void setCar(double g) throws CarException
	{
		
		if(g < 0)
		{
			CarException e = new CarException();
			throw e;
		}
		
	else
	{
		gas = g;
		out.println("ガソリン量を" + gas + "にしました。");
	}
	
	}
	
	
	public void setCar(int n, double g) throws CarException
	{
		
		if(g < 0)
		{
			CarException e = new CarException();
			throw e;
		}
		
	else
	{
		num = n;
		gas = g;
		out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	}
	
//	public void setName(String nm) //"Thread"クラスのメソッドと名前が被ってゐる？
	public void setNm(String nm)
	{
		name = nm;
		out.println("名前を" + name + "にしました。");
	}
	

	public String toString()
	{
		String str = "ナンバー:" + num + "ガソリン量:" + gas;
		return str;
	}
	
	public void run()
	{
		for(int i=0; i<5; i++)
			try
		{
				sleep(1000);
				out.println(name+ "の処理をしています。");
		}
		catch(InterruptedException e) {}
	}
	
	public static void showSum()
	{
		out.println("車は全部で"  + sum + "台あります。");
	}
	
	public void show()
	{
		out.println("車のナンバーは" + num + "です。");
		out.println("ガソリン量は" + gas + "です。");
		out.println("名前は" + name + "です。");
	}
	
	public void vShow()
	{
		out.println("車のナンバーは" + num + "です。");
		out.println("ガソリン量は" + gas + "です。");
	}
	
	public void mShow()
	{
		out.println("車の材質は鉄です。");
	}
	
	void showCar()
	{
		out.println("これから車の情報を表示します。");
		show();
	}
	
}
