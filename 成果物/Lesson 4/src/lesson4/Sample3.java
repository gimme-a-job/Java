package lesson4;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3 {
public static void main (String[] args ) throws IOException
{
	out.println("整数を２つ入力してください。");
	
	BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
	String str1 = br.readLine();
	String str2 = br.readLine();
	
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);

	out.println("たし算の結果は" + (num1 + num2) + "です。");
}
}
