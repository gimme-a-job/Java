package lesson14;

import static java.lang.System.*;

import java.io.FileReader;
import java.util.Scanner;

public class Sample8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try
		{
			Scanner sc = new Scanner(new FileReader("test1.txt"));
			
			String[] str = new String[2];
			
			int i = 0;
			
			for(String k: str) //これで良いのか拡張for文
			{
//				k = sc.nextLine();
				str[i] = sc.nextLine();
				i++;
			}
			
//			str[0] = sc.nextLine(); //拡張for文を使わない場合
//			str[1] = sc.nextLine();
			
			out.println("ファイルに書き込まれている2つの文字列は");
			
			for(String j: str) //拡張for文
			{
				out.println(j + "です。");
			}
			
//			out.println(str[0] + "です。"); //拡張for文を使わない場合
//			out.println(str[1] + "です。");
//			
			
			
			sc.close();
		}
		catch(Exception e)
		{
			out.println("入出力エラーです。");
		}

	}

}
