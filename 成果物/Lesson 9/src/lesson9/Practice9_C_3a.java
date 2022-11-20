package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice9_C_3a {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice9_C_3 pc3 = new Practice9_C_3();

		System.out.println("3つの数字を入力");
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		String str2 = br.readLine();
		int num2 = Integer.parseInt(str2);
		String str3 = br.readLine();
		int num3 = Integer.parseInt(str3);

		if (num1 == 9) // 入力値1が設定値１と同じなら
		{

			// 2点
			pc3.first = 2; // 採点１個目に２点

			// } else if(num1 ==num2 || num1 ==num3){

			// pc3.first = 0;

		} else if (num1 == 2 || num1 == 5) // 入力値1が設定値２か３と同じなら
		{

			// 1点
			pc3.first = 1;

		} else {

			pc3.first = 0;
		}

		if (num2 == 2) 
		{

			pc3.second = 2;

			// } else if (num2 ==num1 || num2==num3){
			//
			// pc3.second = 0;

		} else if (num2 == 9 || num2 == 5) {

			pc3.second = 1;

		} else {

			pc3.second = 0;

		}

		if (num3 == 5) {

			pc3.third = 2;

			// } else if(num3 ==num1 ||num3 == num2){
			//
			// pc3.third = 0;
		} else if (num3 == 2 || num3 == 9) {

			pc3.third = 1;

		} else {
			pc3.third = 0;

		}

		pc3.showSum();

	}

}
