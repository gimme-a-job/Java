package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

public class Lesson10D3 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("テストの結果を入力する人数を入力してください。");
		
		int count = sc.nextInt();
		
		//TestResultクラス型の配列を作成
		//Lesson10D1.javaの文を利用
		TestResult[] testresults = new TestResult[count];
		
		final int consti = 0;
		int i = consti;
		
		//for文を使い、TestResultクラス型の配列に名前・英語の点数・数学の点数を格納
		//以下にコーデイング
		for(TestResult t: testresults)
		{
			testresults[i] = new TestResult(i);
			
			i++;
		}
		
		
		//配列の要素数の回数だけfor文をまわし、取得した値を使って標準出力
		//Lesson10D1.javaのfor文を利用
		i = consti;
		
		for(TestResult r: testresults)
		{
			out.println();
			
			testresults[i].showTestResult();
			
			
						
			i++;
		}


	}

}
