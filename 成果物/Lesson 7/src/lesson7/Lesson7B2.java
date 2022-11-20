package lesson7;

import static java.lang.System.*;

public class Lesson7B2 {

//	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		int max = -2147483648; //int型の下限
		int min = 2147483647; //int型の上限
				
		
		final int count = 3;
		
		
		out.println(count + "回入力しなされ！");
		
		int[] inputvals = new int[count];
		
		final int consti = 0;
		int i = consti;
		
//		readInput input = new readInput();
		readInput[] input = new readInput[count];
		
		for(int v: inputvals)
		{
			out.print("では" + (i+1) + "回目の数値を入力しなされよ ");
//			inputvals[i] = readInputInt();
//			inputvals[i] = input.readInputInt();
			input[i] = new readInput();
			inputvals[i] = input[i].readInputInt();
			
			out.println("inputvals[i]" + inputvals[i]); //検証用
			max = Math.max(max, inputvals[i]);
			out.println("MAX: " + max); //検証用
			min = Math.min(min, inputvals[i]);
			out.println("MIN: " + min); //検証用
			
			i++;
		}
		
		out.println("最大値：" + max);
		out.println("最小値：" + min);
		
//		sc.close();

	}
	
//	public static int readInputInt()
//	{
//		int tempint = 0;
//		
//		try
//		{
//			out.println("あ"); //検証用
//			tempint = sc.nextInt();
//			out.println("い"); //検証用
//		}
//		catch(Exception e)
//		{
//			out.println(e); //検証用
//			out.println("数値以外が入力された可能性があります。");
//			out.println("もう一度入力してください");
//			sc.next(); //"https://qiita.com/hiroki2525/items/00398e3b6921952faa8c"より
////			tempint = sc.nextInt();
//			readInputInt();
//		}
////		finally
////		{
////			return tempint;
////		}
//		
//		return tempint;
//	}

}
