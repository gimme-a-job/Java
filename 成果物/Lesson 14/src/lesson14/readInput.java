package lesson14;

import static java.lang.System.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class readInput //Lesson7よりコピー

{

	Scanner sc = new Scanner(System.in);

	int inputint;

	String inputstr;

	public void setInputInt() {

		try {
			//			out.println("数字を入力してください"); //検証用

			this.inputint = sc.nextInt();
		}

		catch (InputMismatchException e) {
			//			out.println(e); //検証用
			out.println("数値以外が入力された可能性があります。");
			out.println("もう一度入力してください");

			sc.next(); //"https://qiita.com/hiroki2525/items/00398e3b6921952faa8c"より

			setInputInt();

		}

	}

	public void setInputStr() {

		this.inputstr = sc.next();

	}

	public int getInputInt() {
		return this.inputint;
	}

	public String getInputStr() {
		return this.inputstr;
	}

	public int readInputInt() {
		setInputInt();
		return getInputInt();
	}

	public String readInputStr() {
		setInputStr();
		return getInputStr();
	}

}