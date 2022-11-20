package lesson5;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP3 {

	public static void main(String[] args)throws IOException
	{
	out.println("２つの整数を入力してください。");
	
	BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
	int int1 = Integer.parseInt(br.readLine());
	int int2 = Integer.parseInt(br.readLine());
	
	int intdiff = int1 - int2;
	
	if(intdiff == 0)
	{
		out.println("2つの数は同じ値です。");
	}
	else if (intdiff >= 0)
	{
		out.println(int1 + "より" + int2 + "のほうが小さい値です。");
	}
	else if (intdiff <= 0)
	{
		out.println(int1 + "より" + int2 + "のほうが大きい値です。");
	}
	else
	{
		out.println("You found a exception!");
	}

	
	}

}
