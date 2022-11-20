package lesson_3;

import static java.lang.System.*;

import java.io.*;

public class SampleP3 {

	public static void main(String[] args)throws IOException{
		
		out.println("あなたは何歳ですか？");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		out.println("あなたは" + num + "歳です。");
	}
	
}
