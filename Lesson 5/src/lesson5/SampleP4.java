package lesson5;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP4 {

	public static void main(String[] args) throws IOException
	{
		out.println("0から10までの整数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int intval = Integer.parseInt(br.readLine());
		
		if(intval >= 0 && intval <= 10)
		{
			out.println("正解です。");
		}
		else
			out.println("まちがいです。");
	}

	}

