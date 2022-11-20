package lesson5;

import static java.lang.System.*;

import java.util.Scanner; //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より

public class Lesson5B1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		out.println("西暦で入力するのぢゃ！");

		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
		int inputyear = sc.nextInt();

		if(inputyear%4 == 0) //4で割り切れるなら
		{
			if(inputyear%100 == 0) //4でも100でも割り切れるなら
			{
				if(inputyear%400 == 0) //4でも100でも400でも割り切れるなら
				{
					out.println(inputyear + "年はうるう年です。");
				}
				else //4でも100でも割り切れるが、400で割り切れないなら
				{
					out.println(inputyear + "年はうるう年ではありません。");
				}
			}
			else //4で割り切れ、100で割り切れないなら
			{
				out.println(inputyear + "年はうるう年です。");
			}
		}
		else //4で割り切れないなら
		{
			out.println(inputyear + "年はうるう年ではありません。");
		}
		
		
		sc.close();
	}

}
