package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

public class SampleP4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		out.println("整数を２つ入力してください。");

		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int ans = Math.min(num1, num2);

		out.println(num1 + "と" + num2 + "のうち小さいほうは" + ans + "です。");

		sc.close();

	}

}
