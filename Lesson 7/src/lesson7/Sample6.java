package lesson7;

import static java.lang.System.*;

public class Sample6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] test1 = {80,60,22};
		out.println("test1を宣言しました。");
		out.println("配列要素を確保しました。");
		
		int[] test2 = test1;
		
		out.println("test2を宣言しました。");
		out.println("test2にtest1を代入しました。");
		
		for(int i=0; i<3; i++)
		{
			out.println("test1がさす" + (i+1) + "番目の人の点数は" + test1[i] + "です。");
		}
		
		for(int i=0; i<3; i++)
		{
			out.println("test2がさす" + (i+1) + "番目の人の点数は" + test2[i] + "です。");
		}
		
		test1[2] = 100;
		out.println("test1がさす3番目の人の点数を変更します。");
		
		
		for(int i=0; i<3; i++)
		{
			out.println("test1がさす" + (i+1) + "番目の人の点数は" + test1[i] + "です。");
		}
		
		for(int i=0; i<3; i++)
		{
			out.println("test2がさす" + (i+1) + "番目の人の点数は" + test2[i] + "です。");
		}
		
	}

}
