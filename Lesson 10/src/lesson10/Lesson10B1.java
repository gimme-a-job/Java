package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

public class Lesson10B1 {

	//おまじない
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("何回挑戦するかの？");
		
		int count = sc.nextInt();
		
		Division[] divisions = new Division[count];
		
		final int consti = 0;
		int i = consti;
		
		for(Division d: divisions)
		{
			divisions[i] = new Division();
					
			divisions[i].showResult(i + 1);
			
			i++;
		}

	}
	
		
	static int readInputInt() //このぐれぇはその都度書いたら良いか？⇒今回は使わないことに⇒やっぱ使う
	{
		return sc.nextInt();
	}

}