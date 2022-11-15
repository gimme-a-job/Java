package lesson16aot;

import static java.lang.System.*;

import java.util.HashSet;
import java.util.Set;

public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Set<String> colors = new HashSet<String>();
		
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		
		out.println("色は" + colors.size() + "種類");

	}

}
