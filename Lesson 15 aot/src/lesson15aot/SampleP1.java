package lesson15aot;

//練習問題①
//1から100までの整数をカンマで連結した以下のような文字列sを生成するコードを作成してください。
//
//1,2,3,4,5,6,7,…98,99,100
//
//また、完成した文字列sをカンマで分割し、String配列aに格納してください。

import static java.lang.System.*;

public class SampleP1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		StringBuilder s = new StringBuilder();
		
		int from = 1;
		int to = 100;
		
		for(int i=from; i<=to;i++)
		{
			s.append(i);
			
			
			if(i!=to)
			{
				s.append(",");
			}
		}
		
		String a = s.toString();
		
		out.println(a);

	}

}
