package lesson15;

import static java.lang.System.*;

abstract class Vehicle extends Thread
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		out.println("速度を" + speed + "にしました。");
	}
	
	abstract void show();

}
