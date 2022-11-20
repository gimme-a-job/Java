package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("整数を２つ入力してください。");
		
		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.max(num1, num2);
		
		out.println(num1 + "と" + num2 + "のうち大きいほうは" + ans + "です。");
		
		sc.close();

	}

}
