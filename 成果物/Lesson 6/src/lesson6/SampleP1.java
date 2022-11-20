package lesson6;

import static java.lang.System.*;

import java.io.IOException;

public class SampleP1 {

	public static void main(String[] args)throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
out.println("１～１０までの偶数を出力します。");

for(int i=1; i<=10; i++)
{
	if(i%2 == 0)
	{
		out.println(i);
	}
	
	else if (i%2 == 1)
	{
		continue;
	}
	else
	{
		out.println("a exception is detected.");
	}
	
	}
	
	
}
	}
