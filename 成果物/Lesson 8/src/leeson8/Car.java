package leeson8;

import static java.lang.System.*;

public class Car 

{

	int num;
	double gas;
	
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
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	void show()
	{
		out.println("車のナンバーは" + num + "です。");
		out.println("ガソリン量は" + gas + "です。");
	}
	
	void showCar()
	{
		out.println("これから車の情報を表示します。");
		show();
	}
	
}
