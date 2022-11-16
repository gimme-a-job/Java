package lesson6;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample4 {

	public static void main(String[] args)throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		out.println("いくつまでの合計を求めますか？");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int sum = 0;
		for(int i=1; i<=num; i++)
		{
			sum += i;
		}
		
		out.println("１から" + num + "までの合計は" + sum + "です。");
	}

}
