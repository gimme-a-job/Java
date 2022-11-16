package lesson_3;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP4 {
	public static void main(String[] args)throws IOException{
		
		out.println("円周率の値はいくつですか？");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		Double val = Double.parseDouble(str);
		
		out.println("円周率の値は" + val + "です。");
	}

}
