package lesson14;

import static java.lang.System.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SampleP3
{

	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ

		if(args.length !=1) //p468,Sample10より
		{
			out.println("ファイル名を正しく指定してください。");
			System.exit(1);
		}
		
		try //以下SampleP2から大部分流用
		{
			Scanner sc = new Scanner(args[0]); //↓にそのまま"args[0]"をぶっこんでも良かったらc
			
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(sc.next())));
								
			pw.println("A long time ago,");
			pw.println("There was a little girl.");
			out.println("ファイルに書き込みました。");
			
			sc.close();
			pw.close();
			
		}
		catch(IOException e )
		{
			out.println("入出力エラーです。");
		}

	}

}
