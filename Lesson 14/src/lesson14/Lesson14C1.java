package lesson14;

import static java.lang.System.*;

public class Lesson14C1 {

	static readInput input = new readInput();
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
				
		out.print("数値を入力してください ");
		out.println("入力した値を2倍にすると" + inputIntNumber() + "です。");
		
	}
	
	public static int inputIntNumber()
	{
		return (input.readInputInt() * 2);
	}
	


}
