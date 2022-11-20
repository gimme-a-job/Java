package lesson9;

import static java.lang.System.*;

import java.util.Scanner;

public class Lesson9C2_ {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("貴様は何回トライするのかの？");
		
		Scanner sc = new Scanner(System.in);
		
		int counts = sc.nextInt();
		
		Test[] tests = new Test[counts];
		
		final int consti = 0;
		int i = consti;
		final int constj = 0;
		int j = constj;
		
		for(Test l : tests) //"l"は拡張for文のためだけに設定、無視してOK
		{
			tests[i] = new Test(); //"tests"配列にインスタンスを生成してゐく
			i++;
		}
		
		//Debug用
//		try
//		{
//		out.println(tests[counts-1].getConstNmLength());
//		}
//		catch(Exception e)
//		{
//			out.println(e);
//		}
		
		int[][] inputNm = new int[counts][tests[counts-1].getConstNmLength()];
		
		
		i = consti;
		
		for(int[] AllayInputNm: inputNm) //"https://qiita.com/mako0104/items/54e8828722b648bbcc01"より
		{
			j = constj;
			
			for(int m: AllayInputNm) //"https://qiita.com/mako0104/items/54e8828722b648bbcc01"より
			{
				out.println((i+1) + "回目のトライの" + (j+1) + "個目を入力せぃ");
			inputNm[i][j] = sc.nextInt();
			j++;
			}
			
			
			
			i++;
		}
		
		i = consti;
		j = constj;
		
		
		for(int[] AllayInputNm: inputNm)
		{
			j = constj;
			
			for(int o: AllayInputNm)
			{
			out.println(inputNm[i][j]);
			j++;
			}
			
			
			i++;
		}
		
		
		
		sc.close();

	}

}
