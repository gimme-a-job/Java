package lesson4;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP4 {
	
	public static void main(String[] args) throws IOException
	{
		out.println("三角形の高さと底辺を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		out.println("三角形の面積は" + (Double.parseDouble(str1) * Double.parseDouble(str2) / 2) + "です。");
		
	}
}
