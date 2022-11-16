package lesson7;

import static java.lang.System.*;

public class Lesson7B1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		char[] atoz = new char[8];
		
		final int consti = 0;
		int i = consti;
		
//		final int constuni = 41;
		final int constuni = 65;
		int uni = constuni;
		
		for(char c: atoz)
		{
			atoz[i] = (char)(constuni + i);
			out.println(i + "番目の要素：" + atoz[i]);
			i++;
		}

	}

}
