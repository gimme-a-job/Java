package lesson4;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP3 {

	public static void main (String[] args)throws IOException
	{
		out.println("正方形の辺の長さを入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String side = br.readLine();
		
//		out.println("正方形の面積は" + Double.parseDouble(side)*Double.parseDouble(side) + "です。");
		out.println("正方形の面積は" + (int)(Double.parseDouble(side)*Double.parseDouble(side)) + "です。");
	}
}
