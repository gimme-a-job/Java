package lesson16aot;

import static java.lang.System.*;

import java.util.HashSet;
import java.util.Set;

public class Sample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Set<String> colors = new HashSet<String>();
		
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		
		for(String s :colors)
		{
			
//			if(s.equals(colors[colors.size()-1]))
//			{
//				
//			}
			out.print(s + "→");
		}

	}

}
