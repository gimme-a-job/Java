package lesson_3;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP5 {
	public static void main(String[] args)throws IOException{
		
		out.println("身長と体重を入力してください。");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		Double height = Double.parseDouble(str1);
		Double weight = Double.parseDouble(str2);
		
		out.println("身長は" + height + "センチです。");
		out.println("体重は" + weight + "キロです。");
	}
}
