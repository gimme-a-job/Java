package lesson13.sub;

import static java.lang.System.*;

abstract class Vehicle 
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		out.println("速度を" + speed + "にしました。");
	}
	
	abstract void show();

}
