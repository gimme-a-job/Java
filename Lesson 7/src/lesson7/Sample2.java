package lesson7;

import static java.lang.System.*;

//import java.io.*;
import java.util.Scanner; //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より


public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		out.println("テストの受験者数を入力してください。");
		
//		BufferedReader br =
//				new BufferedReader(new Input)
		
		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
	    int num = sc.nextInt();
//	    sc.close(); //ここに入れると上手くいかない
	    
	    int[] test = new int[num];
	    
	    out.println("人数分の点数を入力してください。");
	    
	    for(int i=0; i<num; i++)
	    {
	    	int tmp = sc.nextInt(); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
	    	test[i] = tmp;
//	    	sc.close(); //ここに入れてもやはり上手くいかない
	    }
	    
	    for(int i=0; i<num; i++)
	    {
	    	out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
	    }
	 
	    sc.close(); //これを入れる位置が分からん、これより上に入れるとうんちっぽい
	    
	}

}
