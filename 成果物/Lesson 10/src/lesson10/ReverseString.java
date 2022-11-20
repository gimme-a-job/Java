package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

public class ReverseString
{
	private String inputstr;
	private String reversedinputstr;

	private StringBuilder strb;
	
	private Scanner sc = new Scanner(System.in);
	
	
	public void setInputString() //入力を促すメッセージを表示して、フィールド変数"inputstr"に格納するだけ
	{
		out.println("入力せぃ");

		this.inputstr = readInputString();

	}
	
	public void setInputString(String inputstr) //引数をフィールド変数"inputstr"に格納するだけ
	{
		this.inputstr = inputstr;

	}
	
	public void setReversedInputString(String inputstr) //引数をフィールド変数"inputstr"に格納してから、逆順にして、フィールド変数"reversedinputstr"にも格納
	{
		
		setInputString(inputstr);
		strb = new StringBuilder(inputstr);
		reversedinputstr = strb.reverse().toString();

	}
	
	public String getInputString() //フィールド変数"inputstr"を返すだけ
	{
		return this.inputstr;
	}
	
	public String getReversedInputString(String inputstr)
	{
		setReversedInputString(inputstr); //引数をフィールド変数"inputstr"に格納してから、逆順にして、フィールド変数"reversedinputstr"にも格納
		return this.reversedinputstr; //フィールド変数"reversedstr"を返す
	}

	public void showReversedString() //Lesson10B2
	{
		
		setInputString();
						
		out.println("入力した文章は\"" + getInputString() + "\"です。");
		out.println("入力した文章を逆から読むと");
		out.print("\"");
		out.print(getReversedInputString(getInputString()));
		out.println("\"");
	}
	
	public void showPalindrome() //Lesson10C2
	{
		setInputString();
				
		out.print("「" + getInputString() + "」は");
		
//		String tempinputstr = getInputString();  //フィールド変数"inputstr"を返すだけのメソッド
		boolean bl = getInputString().equals(getReversedInputString(getInputString()).toString()); //"https://tech.pjin.jp/blog/2016/06/29/%E7%B6%9A%E3%83%BB%E3%81%A8%E3%81%A3%E3%81%A6%E3%82%82%E3%82%8F%E3%81%8B%E3%82%8A%E3%82%84%E3%81%99%E3%81%84java%E3%80%80%E3%80%90%E3%82%B5%E3%83%B3%E3%83%97%E3%83%AB%E3%83%97%E3%83%AD%E3%82%B0-7/"より
		
//		if(tempinputstr == getReversedInputString(tempinputstr)) //参照型だからダメ！！
//		if(bl = true) //"="が足りん！！！
		if(bl == true)
		{
			out.println("回文です。");
//			out.println("tempinputstr:" + tempinputstr); //検証用
//			out.println("getInputString()：" + getInputString()); //検証用
//			out.println("getReversedInputString(tempinputstr):" + getReversedInputString(tempinputstr)); //検証用
//			out.println("getReversedInputString(getInputString())：" + getReversedInputString(getInputString())); //検証用
//			out.println("getReversedInputString(getInputString()).toString()：" + getReversedInputString(getInputString()).toString()); //検証用
		}
//		else if(tempinputstr != getReversedInputString(tempinputstr))
//		else if(bl = false)
		else if(bl == false)
		{
			out.println("回文ではありません。");
//			out.println("tempinputstr:" + tempinputstr); //検証用
//			out.println("getInputString()：" + getInputString()); //検証用
//			out.println("getReversedInputString(tempinputstr):" + getReversedInputString(tempinputstr)); //検証用
//			out.println("getReversedInputString(getInputString())：" + getReversedInputString(getInputString())); //検証用
//			out.println("getReversedInputString(getInputString()).toString()：" + getReversedInputString(getInputString()).toString()); //検証用
		}
		else
		{
			out.println();
			out.println("OMG, You found a exception!"); //検証用
//			out.println("tempinputstr:" + tempinputstr); //検証用
			out.println("getInputString()：" + getInputString()); //検証用
//			out.println("getReversedInputString(tempinputstr):" + getReversedInputString(tempinputstr)); //検証用
			out.println("getReversedInputString(getInputString())：" + getReversedInputString(getInputString())); //検証用
			out.println("getReversedInputString(getInputString()).toString()：" + getReversedInputString(getInputString()).toString()); //検証用
		}
	}
	
	public String readInputString() {
		return sc.next();
	}

	
}
