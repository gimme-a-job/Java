package leeson8;

import static java.lang.System.*;

import java.util.Scanner;

public class SampleHamano {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//ハマノにお伺いを立てる
		out.println("ハマノ、貴様は何台入力したいんぢゃ？");
		
		//おまじない
		Scanner sc = new Scanner(System.in);
		
		//ハマノが入力した台数を格納する変数を宣言
		int counts;
		
		//ハマノが入力した台数を検知して格納
		counts = sc.nextInt();
		
		//ハマノに台数分ナンバーとギャソリーン量の入力を促す
		out.println("OK," + counts + "台じゃな。");
		out.println(counts + "台分、ナンバーとガソリン量を入力するんぢゃな。");
		
		//ハマノが入力した台数分入るcars配列を宣言
		Car[] cars;
		cars = new Car[counts];
		
		//繰り返し用変更iを宣言
		int consti = 0;
		int i = consti;
		
		//ハマノにナンバーとギャソリーン量を入力させまくり、それらをcars配列に格納する処理
		for(Car j: cars) //拡張for文使いたかっただけなので"j"はシカトでOK
		{
			cars[i] = new Car(); //cars配列の初期化....じゃなくてインスタンスだかオブジェクトの宣言とか作成とかそんなん※重要
			out.println(i+1 + "台目のナンバーはなんぢゃ？"); //今なに入力するのか分かり易くするため。
			cars[i].num = sc.nextInt(); //入力されたナンバーを格納
			out.println(i+1 + "台目のギャソリーン量はいくつぢゃ？"); //今なに入力するのか分かり易くするため。
			cars[i].gas = sc.nextDouble(); //入力されたガソリン量を格納
			i++;
		}
		
		//一旦iを初期化
		i=consti;
		
				
		//ハマノに入力させたのを表示する繰り返し処理
		for(Car k: cars) //拡張for文使いたかっただけなので"j"はシカトでOK
		{
			out.println(i+1 + "台目のナンバーは　：　" + cars[i].num + "　、ガソリン量は　：　" + cars[i].gas + "　となっておるぞ。");
			
			i++;
			
		}
			
		//おまじない
		sc.close();

	}

}
