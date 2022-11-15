package lesson15aot;

import static java.lang.System.*;

public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] s = {"Java and JavaScript"};
		
		if(s[1-1].contains("Java"))
		{
			out.println("文字列s1は、Javaを含んでいます");
		}
		
		if(s[1-1].endsWith("Java"))
		{
			out.println("文字列s1は、Javaが末尾にあります");
		}
		
		out.println("文字列s1で最初にJavaが登場する位置は" + s[1-1].indexOf("Java"));
		out.println("文字列s1で最後にJavaが登場する位置は" + s[1-1].lastIndexOf("Java"));
		
		
	}

}
