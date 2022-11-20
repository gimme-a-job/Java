package lesson15aot;

import static java.lang.System.*;

public class Sample6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		
		for(int i=0;i<words.length;i++)
		{
			out.print(words[i] + "->");
		}

	}

}
