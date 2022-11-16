package lesson7;

import static java.lang.System.*;

public class Sample11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[][] test = { {80,60,22,50},{90,55,68,72},{33,75,63} };
		
		for(int i=0; i<test.length; i++)
		{
			out.println((i+1) + "番目の配列要素の長さは" + test[i].length + "です。");
		}
		
	}

}
