package lesson6;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample10 {

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		out.println("成績を入力してください。（１～５）");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res)
		{
		case 1:
		case 2:
			out.println("もう少しがんばりましょう。");
			break;
		case 3:
		case 4:
			out.println("この調子でがんばりましょう。");
			break;
		case 5:
			out.println("たいへん優秀です。");
			break;
			default:
				out.println("１～５までの成績を入力してください。");
				break;
		}
		

	}

}
