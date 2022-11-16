package lesson5;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample6 {

	public static void main(String[] args) throws IOException
	{

		out.println("aかbを入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char res = str.charAt(0);
		
		switch(res) {
		case 'a':
			out.println("aが入力されました。");
			break;
		case 'b':
			out.println("bが入力されました。");
			break;
		default:
			out.println("aかbを入力してください。");
			break;
		}
	}

}
