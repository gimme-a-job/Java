package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("文字列を入力してください。");
		
		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
		
		String str1 = sc.nextLine();
		
		out.println("追加する文字列を入力してください。");
		
		String str2 = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		
		out.println(str1 + "に" + str2 + "を追加すると" + sb + "です。");
		
		sc.close();

		
		
	}

}
