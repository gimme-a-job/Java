package lesson5;

import static java.lang.System.*;

import java.util.Scanner; //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より

public class Lesson5B2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		out.println("正解の整数を入力するのぢゃ！");

		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
		int inputnum = sc.nextInt();

		int constnum = 35;

		int diff = inputnum - constnum;

		//switchで無理っぽいのでやめ
//		switch (diff) {
//
//		case 
//		
//		case 0:
//			out.println("正解");
//			break;
//			
//		default:
//			out.println("You found a exception!");
//			out.println("inputnum is :" + inputnum);
//			out.println("constnum is :" + constnum);
//			out.println("diff is :" + diff);
//			break;

//		}
		
		if(diff >= 10)
		{
			out.println("大きい");
		}
		else if(diff < 10 && diff > 0)
		{
			out.println("少し大きい");
		}
		else if(diff == 0)
		{
			out.println("正解");
		}
		else if(diff <0 && diff > -10)
		{
			out.println("少し小さい");
		}
		else if(diff <= -10)
		{
			out.println("小さい");
					}
		else
		{
			out.println("You found a exception!");
			out.println("inputnum is :" + inputnum);
			out.println("constnum is :" + constnum);
			out.println("diff is :" + diff);
		}

		//debuよう
		out.println("inputnum is :" + inputnum);
		out.println("constnum is :" + constnum);
		out.println("diff is :" + diff);
		
		
		sc.close();

	}

}
