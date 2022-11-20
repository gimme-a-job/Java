package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lesson9D3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CalculationBMI calBMI = new CalculationBMI();

		//名前の入力と格納
		System.out.println("名前を入力してください。");
		String str1 = br.readLine();
		calBMI.setInfo(str1);

		//年齢の入力と格納
		System.out.println("年齢を入力してください。(1以上100以下で入力)");
		String str2 = br.readLine();
		int age = Integer.parseInt(str2);
		boolean ageCheck =  calBMI.setInfo(age);

		//入力が正常出ない場合、処理を終了
		if ( ageCheck == false ) {

			System.out.println("年齢は1以上100以下の数字で入力してください。");
			System.out.println("処理を中断します。");
			return;

		}

		//身長・体重の入力と格納
		System.out.println("身長(単位[m])を入力してください。");
		String str3 = br.readLine();
		double height = Double.parseDouble(str3);

		System.out.println("体重を入力してください。");
		String str4 = br.readLine();
		double weight = Double.parseDouble(str4);

		calBMI.setInfo(height, weight);

		//BMIの計算結果を取得
		double ansBMI = calBMI.calculationBMI();

		//BMI結果に基づく体型を取得
		String resultBMI = calBMI.resultBMI();

		//結果を標準出力
		System.out.println(calBMI.getName() + "さん(" + calBMI.getAge()+ "歳)のBMIは" + ansBMI + "です。");
		System.out.println("あなたの体型は「" + resultBMI +"」です。");

	}

}
