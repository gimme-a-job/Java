package lesson9;

import static java.lang.System.*;

import java.util.Scanner;

public class Lesson9D3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("ナンニン？数だけ入れろ～");
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
//		CalculationBMI calcbmis = new CalculationBMI[count];
				
		CalculationBMI calcbmi = new CalculationBMI();
		
		
		
		try {
		
			if(calcbmi.setInfo() == false)
			{
				System.exit(0);
			}
						
		
		}
		catch(Exception e)
		{
			out.println(e);
		}
//		catch(boolean false)
//		{
//			break;
//		}
		finally
		{
			calcbmi.getCalculatedBMI();
			calcbmi.scClose();
			sc.close();
		}
		
		

	}

}
