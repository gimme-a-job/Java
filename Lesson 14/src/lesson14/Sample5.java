package lesson14;

import static java.lang.System.*;

public class Sample5 {

	public static void main(String[] args) throws CarException
	{
		// TODO 自動生成されたメソッド・スタブ
		
		Car car1 = new Car();
		
		try
		{
			car1.setCar(1234, -10.0);
		}
		catch(CarException e)
		{
			out.println(e + "が放出されました。");
		}
		
		car1.show();

	}

}
