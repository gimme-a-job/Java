package lesson10;

public class Lesson10D2 {

	public static void main(String[] args) {

		//TestResultクラス型の配列を作成
		TestResult[] tr = new TestResult[3];


		String[] names = new String[3];
		names[0] = "ポリテク太郎";
		names[1] = "ポリテク次郎";
		names[2] = "ポリテク三郎";


		int[] englishScores = new int[3];
		englishScores[0] = 70;
		englishScores[1] = 90;
		englishScores[2] = 60;


		int[] mathScores = new int[3];
		mathScores[0] = 85;
		mathScores[1] = 65;
		mathScores[2] = 95;


		for (int i = 0; i <= tr.length - 1; i++) {

			tr[i] = new TestResult();

			tr[i].setName(names[i]);
			tr[i].setEnglishScore(englishScores[i]);
			tr[i].setMathScore(mathScores[i]);

		}


		//配列の要素数の回数だけfor文をまわし、取得した値を使って標準出力
		for (int i = 0; i <= tr.length - 1; i++) {

			System.out.print(tr[i].getName() + "さんの");
			System.out.print("英語の点数は" + tr[i].getEnglishScore() + "点、");
			System.out.println("数学の点数は" + tr[i].getMathScore() + "点です。\n");

		}

	}

}
