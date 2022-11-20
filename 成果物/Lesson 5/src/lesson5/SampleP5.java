package lesson5;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP5 {

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ

		out.println("成績を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		double grade = Double.parseDouble(br.readLine());
		
		switch((int)grade)
		{
		case 5:
			out.println("たいへん優秀です。");
			break;
		case 4:
			out.println("たいへんよくできました。");
			break;
		case 3:
			out.println("さらに上をめざしましょう。");
			break;
		case 2:
			out.println("もう少しがんばりましょう。");
			break;
		case 1:
			out.println("もっとがんばりましょう。");
			break;
		default:
			out.println("1から5まで！処理面倒だから5.xは通してるけどー");
			break;
		}
	}

}
