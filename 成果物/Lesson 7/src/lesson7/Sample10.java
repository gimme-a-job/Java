package lesson7;

import static java.lang.System.*;

public class Sample10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		int[][] test = new int[2][5];
		int[][] test = { {80,60,22,50,75},{90,55,68,72,58} };
		
		for(int i=0; i<5; i++)
		{
			out.println((i+1) + "番目の人の国語の点数は" + test[0][i] + "です。");
			out.println((i+1) + "番目の人の国語の点数は" + test[1][i] + "です。");
		}
	}

}
