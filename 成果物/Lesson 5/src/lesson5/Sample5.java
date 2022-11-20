package lesson5;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5 {

	public static void main(String[] args) throws IOException
	{
out.println("整数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res) {
		case 1:
			out.println("1が入力されました。");
			break;
		case 2:
			out.println("２が入力されました。");
			break;
		default:
			out.println("１か２を入力してください。");
			break;
		}
	}

	
}
