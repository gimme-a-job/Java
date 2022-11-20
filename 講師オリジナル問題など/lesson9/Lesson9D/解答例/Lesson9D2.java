package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lesson9D2 {

	static int age;
	static double height;
	static double weight;
	static double ansBMI;
	static String name;
	static String resultBMI;
	static boolean ageCheck;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//名前の入力と格納
		System.out.println("名前を入力してください。");
		String str1 = br.readLine();
		setInfo(str1);

		//年齢の入力と格納
		System.out.println("年齢を入力してください。(1以上100以下で入力)");
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str2);
		setInfo(num1);

		//入力が正常でない場合、処理を終了
		if (ageCheck == false) {

			System.out.println("年齢は1以上100以下の数字で入力してください。");
			System.out.println("処理を中断します。");
			return;

		}

		//身長・体重の入力と格納
		System.out.println("身長(単位[m])を入力してください。");
		String str3 = br.readLine();
		double num2 = Double.parseDouble(str3);

		System.out.println("体重を入力してください。");
		String str4 = br.readLine();
		double num3 = Double.parseDouble(str4);

		setInfo(num2, num3);

		//BMIを計算
		calculationBMI();

		//BMI結果に基づく体型を判定
		resultBMI();

		//結果を標準出力
		System.out.println(name + "さん(" + age + "歳)のBMIは" + ansBMI + "です。");
		System.out.println("あなたの体型は「" + resultBMI + "」です。");

	}


	//以下メソッド

	//名前のセッター
	static void setInfo(String str) {

		name = str;

	}

	//年齢のセッター
	static void setInfo(int n) {

		int a = 1;
		int b = 100;

		if (n >= a && n <= b) {

			age = n;
			ageCheck = true;

		} else {

			ageCheck = false;

		}

	}

	//身長と体重のセッター
	static void setInfo(double a, double b) {

		height = a;
		weight = b;

	}

	//BMI計算
	static void calculationBMI() {

		ansBMI = weight / (height * height);

	}

	//BMIの値に対応する体型の判定
	static void resultBMI() {

		resultBMI = null;
		double a = 18.5;
		double b = 25.0;

		if (ansBMI < a) {

			resultBMI = "瘦せ型";

		} else if (ansBMI >= a && ansBMI < b) {

			resultBMI = "普通体型";

		} else if (ansBMI > b) {

			resultBMI = "肥満体型";

		}

	}

}
