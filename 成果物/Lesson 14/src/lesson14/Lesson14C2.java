package lesson14;

import static java.lang.System.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson14C2 {

	static int inputint;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			out.println("入力した値を2倍にすると" + inputIntNumber() + "です。");

		}

		catch (InputMismatchException e) {
			//			out.println(e); //検証用
			out.println("数値以外が入力された可能性があります。");
			out.print("もう一度");

			sc.next(); //"https://qiita.com/hiroki2525/items/00398e3b6921952faa8c"より

			main(args);

		}

	}

	public static int inputIntNumber() {
		return (readInputInt() * 2);
	}

	public static void setInputInt() {

		out.print("数値を入力してください ");

		inputint = sc.nextInt();

	}

	public static int getInputInt() {
		return inputint;
	}

	public static int readInputInt() {
		setInputInt();
		return getInputInt();
	}

}
