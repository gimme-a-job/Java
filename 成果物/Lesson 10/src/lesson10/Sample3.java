package lesson10;

import static java.lang.System.*;

import java.io.IOException;
import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("文字列を入力してください。");
		
		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
		
		String str1 = sc.nextLine();
		
		out.println("検索文字を入力してください。");
		
		String str2 = sc.nextLine();
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch);
		
		if(num != -1)
			out.println(str1 + "の" + (num+1) + "番目に「" + ch +"」がみつかりました。");
		
		else
			out.println(str1 + "に「" + ch + "」はありません。");
		
		sc.close();

	}

}
