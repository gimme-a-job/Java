package lesson5;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3 {

	public static void main(String[] args) throws IOException
	{
out.println("整数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if (res == 1) {
			out.println("１が入力されました。");
//			out.println("１が選択されました。");
		}
			else {
				out.println("１以外が入力されました。");
		}
		
		out.println("処理を終了します。");
	}

}
