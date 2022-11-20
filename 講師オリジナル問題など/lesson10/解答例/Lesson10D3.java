package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lesson10D3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("テスト結果を入力する人数を入力してください。");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		TestResult[] tr = new TestResult[num];

		for (int i = 0; i <= tr.length - 1; i++) {

			System.out.println((i + 1) + "人目の名前を入力してください。");
			String str1 = br.readLine();

			System.out.println((i + 1) + "人目の英語の点数を入力してください。");
			String str2 = br.readLine();
			int num1 = Integer.parseInt(str2);

			System.out.println((i + 1) + "人目の数学の点数を入力してください。");
			String str3 = br.readLine();
			int num2 = Integer.parseInt(str3);

			tr[i] = new TestResult();

			tr[i].setName(str1);
			tr[i].setEnglishScore(num1);
			tr[i].setMathScore(num2);

		}

		for (int i = 0; i <= tr.length - 1; i++) {

			System.out.print(tr[i].getName() + "さんの");
			System.out.print("英語の点数は" + tr[i].getEnglishScore() + "点、");
			System.out.println("数学の点数は" + tr[i].getMathScore() + "点です。\n");

		}

	}

}
