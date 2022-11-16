package lesson4;

import static java.lang.System.*;

public class Sample5 {

	public static void main (String[] args)
	{
		int a = 0;
		int b = 0;
		
		b = a++;
		
		out.println("代入後にインクリメントしたのでbの値は" + b + "です。");
		
	}
}
