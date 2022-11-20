package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

public class SampleP3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
out.println("文字列を入力してください。");
		
		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
		
		StringBuffer sb = new StringBuffer(sc.nextLine()); //p312
		
		out.println("aの挿入位置を整数で入力してください。");
		
		out.println(sb.insert(Integer.parseInt(sc.nextLine()), 'a') + "になりました。");
		
		sc.close();


	}

}
