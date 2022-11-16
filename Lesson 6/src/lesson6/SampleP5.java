package lesson6;

//いろいろめんどいので
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP5 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		out.println("2以上の整数を入力してください。");

		//おまじない
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//変数numの宣言
		int num = Integer.parseInt((br.readLine()));

		//変数divnumの宣言
//		double divnum = 0;

		//繰り返し処理用変数iの宣言
//		int i = 2;
		int i = 0;
		
//		int isquared = i * i;
		
		
		//------------------------------------------------------------------
		
		//for文だと上手くいかないのでコメントアウト
////		for (i = 2; num <= i * i; i++) //p149 //これだとi*iがずっと2*2で固定されるか
////		for (int i = 2; i*i >= num; i++) //p149
//		for (i = 2; num <= isquared; i++) //未検証
//		{
//			divnum = num % i;
//			
//			//debug用
//			out.println("現在iの値は:" + i);
//			out.println("現在i*iの値は:" + i*i);
//			out.println("現在numの値は:" + num);
//			out.println("現在divnumの値は:" + divnum);
//
//			if (divnum == 0) //p115
//			{
//				out.println(num + "は素数ではありません。");
//				System.exit(0);
//			}
//
//		isquared = i * i; //未検証
		
//		}
		
		////---------------------------------------------------------------------------
		
//		//do~whileで挙動が違ったので光明が
//		do
//		{
//			divnum = num % i;
//			
//			//debug用
//			out.println("現在iの値は:" + i);
//			out.println("現在i*iの値は:" + i*i);
//			out.println("現在isquaredの値は:" + isquared);
//			out.println("現在numの値は:" + num);
//			out.println("現在divnumの値は:" + divnum);
//			
//			if (divnum == 0) //p115
//				{
//					out.println(num + "は素数ではありません。");
//					System.exit(0);
//				}
//			
//			i++;
//			isquared = i * i;
//			
//		}while(num <= isquared); //(i*i)とかっこでくくっても上手くいかず⇒isquaredに
		
		//---------------------------------------------------------------------
		
		//for文と同じっぽい結果に
//		while(isquared >= num)
//		{
//			divnum = num % i;
//			
//			//debug用
//			out.println("現在iの値は:" + i);
//			out.println("現在i*iの値は:" + i*i);
//			out.println("現在isquaredの値は:" + isquared);
//			out.println("現在numの値は:" + num);
//			out.println("現在divnumの値は:" + divnum);
//			
//			if (divnum == 0) //p115
//				{
//					out.println(num + "は素数ではありません。");
//					System.exit(0);
//				}
//			
//			i++;
//			isquared = i * i;
//			
//		}
		
		//--------------------------------------------------------
		
		
//		//debug用
//				out.println("現在iの値は:" + i);
//				out.println("現在i*iの値は:" + i*i);
//				out.println("現在isquaredの値は:" + isquared);
//				out.println("現在numの値は:" + num);
//				out.println("現在divnumの値は:" + divnum);
//				
//				out.println(num + "は素数です。.");
		
		
		//--------------------------------------
		
		
		
		if (num < 2) { //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
			      System.out.println(num + "は素数ではありません。");
			      return;
			    }
		if (num == 2) { //"2を素数ではないと判定しやがるため自分で追加"
		      System.out.println(num + "は素数です。");
		      return;
		    }
			    if (num % 2 == 0) { // 偶数は先にリターン //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
			      System.out.println(num + "は素数ではありません。");
			      return;
			    }

			    for (i = 3; i <= Math.sqrt(num); i+=2) { //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
			      if (num % i == 0) {
			        System.out.println(num + "は素数ではありません。");
			        return;
			      }
			    }

			    System.out.println(num + "は素数です。");

	}

}
