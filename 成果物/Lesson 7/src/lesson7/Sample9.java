package lesson7;

import static java.lang.System.*;

import java.util.Scanner;

public class Sample9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
	    		
	    int[] test = new int[5];
	    out.println(test.length + "人の点数を入力してください。");
	    
	    for(int i=0; i<test.length; i++)
	    {
	    	test[i] = sc.nextInt(); //まずは入力順に格納してゐく（多分）
	    }
	    
	    for(int s=0; s<test.length-1; s++) //sは現在の値をみてる？
	    {
	    	for(int t=s+1; t<test.length; t++) //tは次の値をみてる？
	    	{
	    		if(test[t] > test[s]) //入れ替え処理本体の始まり、次の値が現在の値より大きければ行う（多分）
	    		{
	    			int tmp = test[t]; //tmpに次のtestの値を格納（多分）
	    			test[t] = test[s]; //次のテストの値に現在の値を格納（小さいほうを下に）
	    			test[s] = tmp; //空いた現在の値のとこに、tmpに退避した次のテストの値だったもの（つまり大きいほう）を格納
	    		}
	    	}
	    }
	    
	
	for(int j=0; j<test.length; j++)
	{
		out.println((j+1) + "番目の人の点数は" + test[j] + "です。");
	}
	
	sc.close();

}
	
}