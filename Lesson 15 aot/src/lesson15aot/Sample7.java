package lesson15aot;

import static java.lang.System.*;

public class Sample7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		out.println(w); //aXc,dXf:gXi

	}

}
