package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("英字を入力してください。");
		
		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
		
		String str = sc.nextLine();
		
		String stru = str.toUpperCase();
		String strl = str.toLowerCase();
		
		out.println("大文字に変換すると" + stru + "です。");
		out.println("小文字に変換すると" + strl + "です。");
		
		sc.close();

	}

}
