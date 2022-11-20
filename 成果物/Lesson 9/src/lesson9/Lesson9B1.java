package lesson9;

import static java.lang.System.*;

import java.util.Scanner;

public class Lesson9B1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("貴様の犬は何体ぢゃ？");
		
		//おまじない
		Scanner sc = new Scanner(System.in);
		
		int counts = sc.nextInt();

		//dogs配列を宣言
		Dog[] dogs = new Dog[counts];
		
		//繰り返し用変数"i"を宣言
		final int consti = 0;
		int i = consti;
		

		for(Dog j : dogs)
		{
			dogs[i] = new Dog();
			out.println((i+1) + "体目の犬は苗字持ちか？(Y|N)");
			char res = sc.next().charAt(0);
			
			if(res == 'Y' || res == 'y') //苗字持ちの御犬様の場合
			{
				out.println((i+1) + "体目の犬の苗字は何じゃ？");
				String sirnmTemp = sc.next();
				out.println((i+1) + "体目の犬の下の名前は何じゃ？");
				dogs[i].setNm(sirnmTemp,sc.next());
			}
			
			else if(res == 'N' || res == 'n') //従来通り
			{
			out.println((i+1) + "体目の犬の名前は何じゃ？");
			
			dogs[i].setNm(sc.next());
			}
			
			else //起きないであろう例外をキャッチしたら⇒日本語とか全角とかで普通にこっちに飛ぶか～
			{
//				out.println("You found a exception!");
//				out.println("res is : " + res);
				out.println("(Y|N)の意味が分からんがかきさんは～");
				out.println((i+1) + "体目は苗字ないもんとして扱うからな～");
				out.println((i+1) + "体目の犬の名前は何じゃ？");
				
				dogs[i].setNm(sc.next());
			}
			
			
			out.println((i+1) + "体目の犬の年齢はいくつじゃ？");

			dogs[i].setAge(sc.nextInt());
			
			
			
			i++;
		}
		
		
		//一旦繰り返し用変数"i"を初期化
		i = consti;
		
		for(Dog k : dogs) //拡張for文使いたいだけなのでkはシカトでok
		{
			dogs[i].showNm();
			dogs[i].showAge();
			i++;
		}
		
		sc.close();
	}

}
