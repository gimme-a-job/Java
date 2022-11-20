package lesson10;

public class Lesson10D1 {

	public static void main(String[] args) {

		//TestResultクラス型の配列を作成
		TestResult[] tr = new TestResult[3];

		//オブジェクトに格納する値を変数に代入
		String name1 = "ポリテク太郎";
		int englishScore1 = 70;
		int mathScore1 = 85;

		//TestResultクラス型の配列の添字[0]の要素にオブジェクトを作成し、値を格納
		tr[0] = new TestResult();
		tr[0].setName(name1);
		tr[0].setEnglishScore(englishScore1);
		tr[0].setMathScore(mathScore1);

		//オブジェクトに格納する値を変数に代入
		String name2 = "ポリテク次郎";
		int englishScore2 = 90;
		int mathScore2 = 65;

		//TestResultクラス型の配列の添字[1]の要素にオブジェクトを作成し、値を格納
		tr[1] = new TestResult();
		tr[1].setName(name2);
		tr[1].setEnglishScore(englishScore2);
		tr[1].setMathScore(mathScore2);

		//オブジェクトに格納する値を変数に代入
		String name3 = "ポリテク三郎";
		int englishScore3 = 60;
		int mathScore3 = 95;

		//TestResultクラス型の配列の添字[2]の要素にオブジェクトを作成し、値を格納
		tr[2] = new TestResult();
		tr[2].setName(name3);
		tr[2].setEnglishScore(englishScore3);
		tr[2].setMathScore(mathScore3);


		//配列の要素数の回数だけfor文をまわし、取得した値を使って標準出力
		for (int i = 0; i <= tr.length - 1; i++) {

			System.out.print(tr[i].getName() + "さんの");
			System.out.print("英語の点数は" + tr[i].getEnglishScore() + "点、");
			System.out.println("数学の点数は" + tr[i].getMathScore() + "点です。\n");

		}

	}

}
