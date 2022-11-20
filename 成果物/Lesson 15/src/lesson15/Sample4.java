package lesson15;

import static java.lang.System.*;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("How many cars do ya have?");
		
		Scanner sc = new Scanner(System.in);
		
		int counts = sc.nextInt();
		
		Car[] cars = new Car[counts];
		
		final int consti = 0;
		int i = consti;
		
		for(Car j:cars) //"j"はシカトでOK
		{
			cars[i] = new Car((i+1) + "号車");
			cars[i].start();
			i++;
		}
		
				
		for(int k=0; k<5; k++)
		{
			try
			{
				Thread.sleep(1000);
			out.println("main()の処理をしています。");
			}
			catch(InterruptedException e) {}
		}
		
		sc.close();

	}

}
