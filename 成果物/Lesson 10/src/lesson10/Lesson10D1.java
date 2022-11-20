package lesson10;

public class Lesson10D1 {

	public static void main(String[] args) {

		//TestResultクラス型の配列を作成
		//以下にコーデイング
		TestResult[] testresults = new TestResult[3];


		//オブジェクトに格納する値を変数に代入
		String name1 = "ポリテク太郎";
		int englishScore1 = 70;
		int mathScore1 = 85;

		//TestResultクラス型の配列の添字[0]の要素にオブジェクトを作成し、値を格納
		//以下にコーデイング
		testresults[0] = new TestResult(name1,englishScore1,mathScore1);
		

		//オブジェクトに格納する値を変数に代入
		String name2 = "ポリテク次郎";
		int englishScore2 = 90;
		int mathScore2 = 65;

		//TestResultクラス型の配列の添字[1]の要素にオブジェクトを作成し、値を格納
		//以下にコーデイング
		testresults[1] = new TestResult(name2,englishScore2,mathScore2);


		//オブジェクトに格納する値を変数に代入
		String name3 = "ポリテク三郎";
		int englishScore3 = 60;
		int mathScore3 = 95;

		//TestResultクラス型の配列の添字[2]の要素にオブジェクトを作成し、値を格納
		//以下にコーデイング
		testresults[2] = new TestResult(name3,englishScore3,mathScore3);
		

		//配列の要素数の回数だけfor文をまわし、取得した値を使って標準出力
		//以下にコーデイング
		final int consti = 0;
		int i = consti;
		
		for(TestResult t: testresults)
		{
			testresults[i].showTestResult();
			
			i++;
		}
		


	}

}
