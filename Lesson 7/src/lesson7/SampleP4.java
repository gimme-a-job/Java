package lesson7;

import static java.lang.System.*;

import java.util.Scanner;

public class SampleP4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("5人のテストの点数を入力してください。");
		
		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
	    int[] score = new int[5];
	    
	    //現時点の最高点を格納する変数を宣言
	    int tmp = 0;
	    
	    //入力されたスコアをscore配列に格納してゐく処理
	    for(int i=0; i<score.length; i++)
	    {
	    	score[i] = sc.nextInt();
	    	
	    	if(tmp < score[i]) //現時点の最高点だったら格納
	    	{
	    		tmp = score[i];
	    	}
	    	
	    }
	    
	    //score配列に格納された値を順番に表示
	    for(int j=0; j<score.length; j++)
//	    for(int num : score)
	    {
	    	out.println(j+1 +"番目の人の点数は" + score[j] + "です。");
//	    	out.println(j+1 +"番目の人の点数は" + String.valueOf(score) + "です。");
	    }
	    
	    //最高点を表示	
	    out.println("最高点は" + tmp + "点です。");
	    
	    sc.close();
	    
	}

}
