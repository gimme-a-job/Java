package lesson4;

import static java.lang.System.*;

public class Sample11 {

	public static void main(String[] args)
	{
		int num1 = 5;
		int num2 = 4;
		
//		double div = num1 / num2;
		double div = (double)num1 / (double)num2;
		
		out.println("5/4は" + div + "です。");
	}
}
