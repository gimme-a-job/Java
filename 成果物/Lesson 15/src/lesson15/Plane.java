package lesson15;

import static java.lang.System.*;

//飛行機クラス
public class Plane extends Vehicle implements iVehicle
{
	
	private int flight;
	
	public Plane(int f)
	{
		flight = f;
		out.println("便" + flight + "の飛行機を作成しました。");
	}
	
	public void show()
	{
		out.println("飛行機の便は" + flight + "です。");
		out.println("速度は" + speed + "です。");
	}
	
	public void vShow()
	{
		out.println("飛行機の便は" + flight + "です。");
		out.println("速度は" + speed + "です。");
	}

}
