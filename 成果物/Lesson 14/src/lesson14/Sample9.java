package lesson14;

import static java.lang.System.*;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sample9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//test2.txtがどこにいるか分からないので追加
		try
		{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test2.txt")));
			
			pw.println(80);
			pw.println(68);
			pw.println(22);
			pw.println(33);
			pw.println(56);
			pw.println(78);
			pw.println(33);
			pw.println(56);
			out.println("ファイルに書き込みました。");
			
			pw.close();
			
		}
		catch(IOException e )
		{
			out.println("入出力エラーです。");
		}
		
		
		try
		{
			Scanner sc = new Scanner(new FileReader("test2.txt"));
			
			int[] test = new int[8];
//			String str;
			
			int i = 0;
			
			int max = 0;
			int min = 9999999;
			
			for(int k : test)
			{
				test[i] = Integer.parseInt(sc.nextLine());
				out.println(test[i]);
				max = Math.max(max, test[i]);
				min = Math.min(min, test[i]);
			}
			
			out.println("最高点は" + max + "です。");
			out.println("最高点は" + min + "です。");
			
		}
		catch(Exception e)
		{
			out.println("入出力エラーです。");
		}

	}

}
