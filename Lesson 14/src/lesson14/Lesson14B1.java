package lesson14;

import static java.lang.System.*;

public class Lesson14B1 {

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int max = -2147483648; //int型の下限
		int min = 2147483647; //int型の上限
				
		
		final int count = 3;
		
		
		out.println(count + "回入力しなされ！");
		
		int[] inputvals = new int[count];
		
		final int consti = 0;
		int i = consti;
		
		readInput[] input = new readInput[count];
		
		for(int v: inputvals)
		{
			out.print("では" + (i+1) + "回目の数値を入力しなされよ ");

			input[i] = new readInput();
			inputvals[i] = input[i].readInputInt();
			
//			out.println("inputvals[i]" + inputvals[i]); //検証用
			max = Math.max(max, inputvals[i]);
//			out.println("MAX: " + max); //検証用
			min = Math.min(min, inputvals[i]);
//			out.println("MIN: " + min); //検証用
			
			i++;
		}
		
		out.println("最大値：" + max);
		out.println("最小値：" + min);
		


	}
	

}
