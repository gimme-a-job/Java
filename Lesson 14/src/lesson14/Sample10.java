package lesson14;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample10 {

//	public static void showTest1(String[] args)
//	{
//		main("test1.txt");
//		System.exit(0);
//	}
//	
//	private static void main(String args) {
//		// TODO 自動生成されたメソッド・スタブ
//		
//		if(args.length !=1)
//		{
//			out.println("ファイル名を正しく指定してください。");
//			System.exit(1);
//		}
//		try
//		{
//			Scanner sc = new Scanner(new FileReader(args[0]));
//			
//			String str;			
//			while((str = sc.nextLine()) != null)
//			{
//				out.println(str);
//			}
//			sc.close();
//		}
//		catch(Exception e)
//		{
//			out.println("入出力エラーです。");
//		}
//
//		
//	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		if(args.length !=1)
		{
			out.println("ファイル名を正しく指定してください。");
			System.exit(1);
		}
		try 
		{
			BufferedReader br =
					new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str = br.readLine()) != null)
			{
				out.println(str);
			}
			br.close();
		}
		catch(IOException e) //どちらでもエラー出ず
//		catch(Exception e) //どちらでもエラー出ず
		{
			out.println("入出力エラーです。");
		}
		
//		try
//		{
//			Scanner sc = new Scanner(new FileReader(args[0]));
//			
//			String str;			
//			while((str = sc.nextLine()) != null) //nullでは無い何かを返しているからエラー？
//			{
//				out.println(str);
//			}
//			sc.close();
//		}
//		catch(Exception e)
//		{
//			out.println("入出力エラーです。");
//			out.println(e); //検証のため
//		}

	}

}
