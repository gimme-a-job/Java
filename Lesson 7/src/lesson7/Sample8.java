package lesson7;

import static java.lang.System.*;

public class Sample8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] test = {80,60,22,50,75};
		
		for(int i=0; i<test.length; i++)
		{
			out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
		}
		
		out.println("テストの受験者は" + test.length + "人です。");
		
		
	}

}
