package lesson4;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP5 {

	public static void main(String[] args) throws IOException
	{
		out.println("科目１～５の点数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();
		
		int sum = Integer.parseInt(str1) + Integer.parseInt(str2)
		+ Integer.parseInt(str3) + Integer.parseInt(str4) + Integer.parseInt(str5);
		
		out.println("５科目の合計点は" + sum + "点です。");
			
		out.println("５科目の平均点は" + ((double)sum / (double)5) + "点です。");
		
	}
	
	
}
