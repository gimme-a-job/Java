package lesson4;

import static java.lang.System.*;

public class SampleP2 {

	public static void main(String[] args)
	{
		out.println("0-4は" + (0-4) + "です。");
		out.println("3.14×2は" + (3.14*2) + "です。");
		out.println("5÷3は" + ((double)5/(double)3) + "です。");
//		out.println("5÷3は" + (double)(5/3) + "です。");
		out.println("30÷7のあまりの数は" + (30-(7*((int)30/7))) + "です。");
		out.println("(7+32)÷5は" + ((double)(7+32)/(double)5) + "です。");
	}
}
