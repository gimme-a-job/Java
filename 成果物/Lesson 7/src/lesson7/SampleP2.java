package lesson7;

import static java.lang.System.*;

public class SampleP2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] test;
//		test = new int[5];
		test = new int[6];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		test[5] = 100;
		
//		for(int i=0; i<5; i++)
		for(int i=0; i<=5; i++)
		{
			out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
		}
		
	}

}
