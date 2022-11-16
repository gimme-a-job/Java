package lesson9;

import static java.lang.System.*;

import java.util.Scanner;

public class Lesson9C1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//聞く文章を表示
		out.println("クリーチャーは何体おんねん（↓に数だけ入れてや）");
		
		//おまじない
		Scanner sc = new Scanner(System.in);
		
		//クリーチャー数を格納する変数を宣言し、入力数を格納
		int counts = sc.nextInt();
		
		//Students配列を宣言
		Creature[] Creatures = new Creature[counts];
		
		//繰り返し用変数を宣言し、初期化
		int consti = 0;
		int i = consti;
		
		//クリーチャーの情報を聞きまくり、格納する処理
		for(Creature j:Creatures) //"j"は拡張for文したいがためにあるので無視してOK
		{
			Creatures[i] = new Creature(); //"Creatures"配列に"Creature"インスタンスを生成してゐく～！※大事
			
			//返答が(Yes)だったらインスタンス生成時そのまんまでイケるので聞いてる
			out.println((i+1) + "匹目はスライムか？(Y|N)");
			
			//レスポンスを格納する変数の宣言、および
			char res = sc.next().charAt(0);
			
			//スライムなら
			if(res == 'Y' || res == 'y')
			{
				//何もしない（インスタンス生成時のコンストラクタそのまんま)
			}
			//スライムじゃねぇなら
			else if(res == 'N' || res == 'n') //スライムじゃないなら従来通りの処理
			{
				
				if(i%2 == 1) //"i"が奇数なら"set～"メソッドで処理
				{
					out.println((i+1) + "匹目の名は何ぢゃ？");
				    Creatures[i].setNm(sc.next());; //クリーチャーの名前を聞いて、設定する
					
					out.println((i+1) + "匹目の生命力はいくつぢゃ？");
					Creatures[i].setVit(sc.nextInt());; //生命力を聞いて、設定する。
				}
				else if(i%2 == 0) //"i"が偶数なら引数ありコンストラクタで処理
				{
						out.println((i+1) + "匹目の名は何ぢゃ？");
						String nmTemp = sc.next(); //クリーチャーの名前を聞いて、一時的に変数に格納
					    						
						out.println((i+1) + "匹目の生命力はいくつぢゃ？");
						Creatures[i] = new Creature(nmTemp, sc.nextInt()); //生命力も聞いて、コンストラクタ設定する。（コンストラクタの使い方はこれで良いのかな？）
				
				}
			
			}
			//はいかいいえかちゃんと答えらんねぇならスライム
			else
			{
				out.println("(Y|N)の意味が分からんがかきさんは～");
				out.println((i+1) + "匹目はスライムにするからな～");
			}
			
			out.println(); //見やすい様に改行
			
			i++; //繰り返し用変数"i"のインクリメント
		}
		
		//一旦繰り返し用変数を初期化
		i = consti;
		
		//配列に格納された点数を表示しまくる処理
		for(Creature k:Creatures) //"k"は拡張for文したいがためにあるので無視してOK
		{
			out.println((i+1) + "番目のクリーチャーのステータスは");
			
			Creatures[i].showNm(); //"i"匹目の名前を表示する"showNm"メソッドをコール
			
			Creatures[i].showVit(); //"i"匹目の生命力を表示する"showVit"メソッドをコール
			
			out.println(); //見やすい様に改行
			
			i++; //繰り返し用変数"i"のインクリメント
		}
		
		//おまじない
		sc.close();

	}

}
