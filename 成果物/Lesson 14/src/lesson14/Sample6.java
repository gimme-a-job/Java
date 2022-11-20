package lesson14;

import static java.lang.System.*;

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("文字列を入力してください。");
		
		try
		{
		Scanner sc = new Scanner(System.in);
		
		out.println(sc.nextLine() + "が入力されました。");
		}
		catch(Exception e)
		{
			out.println("入出力エラーです。");
		}
		
		

	}

}
