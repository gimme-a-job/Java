package lesson14;

import static java.lang.System.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleP2 {

	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
		
		try
		{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
			
			pw.println("A long time ago,");
			pw.println("There was a little girl.");
			out.println("ファイルに書き込みました。");
			
			pw.close();
			
		}
		catch(IOException e )
		{
			out.println("入出力エラーです。");
		}

	}

}
