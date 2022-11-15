package lesson14;

import static java.lang.System.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try
		{
//			PrintWriter pw = new PrintWriter(new Scanner(new FileWriter("test1.txt")));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			out.println("ファイルに書き込みました。");
			
			pw.close();
			
		}
		catch(IOException e )
		{
			out.println("入出力エラーです。");
		}

	}

}
