package lesson4;

import static java.lang.System.*;

import java.io.IOException;

public class Sample2 {

	public static void main(String[] args) throws IOException {
	int num1 = 2;
	int num2 = 3;
	int sum = num1+num2;
	
	out.println("変数num1の値は" + num1 + "です。");
	out.println("変数num2の値は" + num2 + "です。");
	out.println("変数num1+num2の値は" + sum + "です。");

	num1 = num1+1;
	
	out.println("変数num1の値に1をたすと" + num1 + "です。");
	
	}
		
}
