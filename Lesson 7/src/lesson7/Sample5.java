package lesson7;

import static java.lang.System.*;

public class Sample5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] test1;
		test1 = new int[3];

		out.println("test1を宣言しました。");
		out.println("配列要素を確保しました。");
		
		test1[0] = 80;
		test1[1] = 60;
		test1[2] = 22;
		
		int[] test2;
		out.println("test2を宣言しました。");
		
		test2 = test1;
		out.println("test2にtest1を代入しました。");
		
		
		for(int i = 0; i<3; i++)
		{
			out.println("test1がさす" + (i+1) + "番目の人の点数は" + test1[i] + "です。");
		}
		
		
		for(int i = 0; i<3; i++)
		{
			out.println("test2がさす" + (i+1) + "番目の人の点数は" + test2[i] + "です。");
		}

	}

}
