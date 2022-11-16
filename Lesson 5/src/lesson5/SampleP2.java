package lesson5;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP2 {

	public static void main(String[] args) throws IOException
{
		out.println("整数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

		//		out.println((Double.parseDouble(str)/2) + " " + (Integer.parseInt(str)/2) + " " + ((Double.parseDouble(str)/2)-(Integer.parseInt(str)/2)) );  //検証用

		double divdb = Double.parseDouble(str)/2;
		int divint =  Integer.parseInt(str)/2;
		double divdiff = divdb - divint	;	
		
if(divdiff == 0.0)
{
	out.println(str + "は偶数です。");
}
else if(divdiff == 0.5 || divdiff == -0.5)
//else if(divdiff == 0.5)
{
	out.println(str + "は奇数です。");
}
else
{
	out.println("You found a exception!" + " " + "Now str is " + str + ".");
	out.println("divdv : " + divdb);
	out.println("divint : " + divint);
	out.println("divdiff : " + divdiff);
}
}
}
