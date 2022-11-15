package lesson11;

import static java.lang.System.*;

public class RacingCar extends Car 
{
	private int course;
	
		
	public RacingCar()
	{
		course = 0;
		out.println("レーシングカーを作成しました。");
	}
	
	public RacingCar(int n, double g,int c)
	{
		super(n,g);
		course = c;
		out.println("コース番号" + course + "のレーシングカーを作成しました。");
		
	}
	
	public void setCourse(int c)
	{
		course = c;
		out.println("コース番号を" + course + "にしました。");
	}
	
	public void newShow()
	{
		out.println("レーシングカーのナンバーは" + num + "です。");
		out.println("ガソリン量は" + gas + "です。");
		out.println("コース番号は" + course + "です。");
	}
	
	public void show()
	{
		out.println("レーシングカーのナンバーは" + num + "です。");
		out.println("ガソリン量は" + gas + "です。");
		out.println("コース番号は" + course + "です。");
	}

}
