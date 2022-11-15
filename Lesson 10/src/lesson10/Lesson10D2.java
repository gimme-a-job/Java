package lesson10;

import static java.lang.System.*;

public class Lesson10D2 {

	public static void main(String[] args) {

		//TestResultクラス型の配列を作成
		//Lesson10D1.javaの文を利用
		TestResult[] testresults = new TestResult[3];

		//String型の配列に名前を格納
		String[] names = new String[3];
		names[0] = "ポリテク太郎";
		names[1] = "ポリテク次郎";
		names[2] = "ポリテク三郎";

		//int型の配列に英語の点数を格納
		//以下にコーデイング
		int[] englishScore = new int[3];
		englishScore[0] = 70;
		englishScore[1] = 90;
		englishScore[2] = 60;


		//int型の配列に数学の点数を格納
		//以下にコーデイング
		int[] mathScore = new int[3];
		mathScore[0] = 85;
		mathScore[1] = 65;
		mathScore[2] = 95;


		//for文を使い、TestResultクラス型の配列に名前・英語の点数・数学の点数を格納
		//以下にコーデイング
		final int consti = 0;
		int i = consti;
		
		for(TestResult t: testresults)
		{
			testresults[i] = new TestResult(names[i],englishScore[i],mathScore[i]);
			
			i++;
		}


		//配列の要素数の回数だけfor文をまわし、取得した値を使って標準出力
		//Lesson10D1.javaのfor文を利用
		i = consti;
		
		for(TestResult r: testresults)
		{
			testresults[i].showTestResult();
			
			out.println();
			
			i++;
		}


	}

}
