package lesson15aot;

import static java.lang.System.*;

public class Sample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String[] s = {"Java programing"};
		
		out.println("文字列s1の4文字目以降は" + s[1-1].substring(3)); //⇒ a programing
		out.println("文字列s1の4~8文字目以降は" + s[1-1].substring(3,8)); //⇒a pro

	}

}
