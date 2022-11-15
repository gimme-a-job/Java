package lesson15aot;

import static java.lang.System.*;

public class Sample4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i < 10000;i++)
		{
			sb.append("Java");
		}
		
		String s = sb.toString();
		
		out.println(s);
		
		for(int i=0;i < 4*10000;i += 4)
		{
			
			out.println((i+1) + "番目から" + (i+3+1)  + "番目まで：" + sb.substring(i, (i+4)));
			
		}

	}

}
