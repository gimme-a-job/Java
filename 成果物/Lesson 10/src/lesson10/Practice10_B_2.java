package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice10_B_2 {

	public static void main(String[] args) throws IOException {

		System.out.println("文字列を入力");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();

		System.out.println("入力した文章は" + str1 + "です。");

		
		//岳さん型
//		char ch1 = str1.charAt(0);
//		char ch2 = str1.charAt(1);
//		char ch3 = str1.charAt(2);
//		char ch4 = str1.charAt(3);
//		char ch5 = str1.charAt(4);
//		char ch6 = str1.charAt(5);
		
		
		//繰り返しをしてみる
		String str2 = "";
		
		for(int i = (str1.length()-1); i >= 0; i--)
		{
			str2 += str1.charAt(i);
		}
		
		System.out.println("入力した文章を逆から読むと");
		
		//岳さん型
//		System.out.println("" + ch6 + ch5 + ch4 + ch3 + ch2 + ch1);
		
		//繰り返しをしてみたら
		System.out.println(str2);

	}

}
