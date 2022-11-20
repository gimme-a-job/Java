package lesson4;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample6 {

	public static void main(String[] args) throws IOException
	{
		out.println("整数を３つ入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int sum = 0;
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		
		out.println("３つの数の合計は" + sum + "です。");
	}
}
