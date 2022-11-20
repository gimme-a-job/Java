
package lesson15aot;

import static java.lang.System.*;

public class Sample1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String[] s = {"スッキリJava" , "Java" , "java" };
		
		if(s[2-1].equals(s[3-1]))
		{
			out.println("s2とs3は等しい");
		}
		
		if(s[2-1].equalsIgnoreCase(s[3-1]))
		{
			out.println("s2とs3はケースを区別しなければ等しい");
		}
		
		out.println("s1の長さは" + s[1-1].length() + "です");
		
		if(s[1-1].isEmpty())
		{
			out.println("s1は空文字です");
		}

	}

}
