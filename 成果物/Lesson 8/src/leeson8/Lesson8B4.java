package leeson8;

import static java.lang.System.*;

import java.util.Scanner;

public class Lesson8B4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//聞く文章を表示
		out.println("ガキはナンニン？");
		
		//おまじない
		Scanner sc = new Scanner(System.in);
		
		//生徒数を格納する変数を宣言し、入力数を格納
		int counts = sc.nextInt();
		
		//Students配列を宣言
		Student[] Students = new Student[counts];
		
		//繰り返し用変数を宣言し、初期化
		int consti = 0;
		int i = consti;
		
		//生徒の点数を聞きまくり、格納する処理
		for(Student j:Students) //"j"は拡張for文したいがためにあるので無視してOK
		{
			Students[i] = new Student();
			
			out.println((i+1) + "匹目の国語の点数は何点ぢゃ？");
//		    Students[i].setNat(sc.nextInt());
			int tempNat = sc.nextInt(); //国語の点数を一時的に格納する変数を宣言し、いったん格納
			
			out.println((i+1) + "匹目の数学の点数は何点ぢゃ？");
//			Students[i].setMat(sc.nextInt());
			int tempMat = sc.nextInt(); //数学の点数を一時的に格納する変数を宣言し、いったん格納
			
			out.println((i+1) + "匹目の英語の点数は何点ぢゃ？");
//			Students[i].setEng(sc.nextInt());
			int tempEng = sc.nextInt(); //英語の点数を一時的に格納する変数を宣言し、いったん格納
			
			out.print((i + 1) + "匹目の");
			Students[i].setScore(tempNat, tempMat, tempEng); //↑で一時的に格納してゐた変数らを、"Students"クラスの"setScore"メソッドに投げる
			
			Students[i].getTotal(); //各点数の合計を"Students"クラスのフィールド"Sum"に格納する"getTotal"メソッドをコール、無くても動くよ
			
			out.println(); //見やすい様に改行
			
			i++; //繰り返し用変数"i"のインクリメント
		}
		
		//一旦繰り返し用変数を初期化
		i = consti;
		
		//配列に格納された点数を表示しまくる処理
		for(Student k:Students) //"k"は拡張for文したいがためにあるので無視してOK
		{
			out.println((i+1) + "番目の子の点数は");
			
//			Students[i].showNat();
//			
//			Students[i].showMat();
//			
//			Students[i].showEng();
			
//			Students[i].show(); //"Students"クラスの"show"メソッドをコール
			
			out.println("合計：" + Students[i].getTotal());
			
			out.println(); //見やすい様に改行
			
			i++; //繰り返し用変数"i"のインクリメント
		}
		
		//おまじない
		sc.close();

	}

}
