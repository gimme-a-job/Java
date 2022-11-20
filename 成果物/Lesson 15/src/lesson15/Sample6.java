package lesson15;

import static java.lang.System.*;

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("How many cars do ya have?");
		
		Scanner sc = new Scanner(System.in);
		
		int counts = sc.nextInt();
		
		Car[] cars = new Car[counts];
		
		Thread[] threads = new Thread[counts];
		
		final int consti = 0;
		int i = consti;
		
		for(Car j:cars) //"j"はシカトでOK
		{
			cars[i] = new Car((i+1) + "号車");
			threads[i] = new Thread(cars[i]);
//			cars[i].start();
			threads[i].start();
			i++;
		}
		
				
		for(int k=0; k<5; k++) //"counts"の数が多いと↑が終わる前にこれが終わって一番下まで飛んでしまう恐れ
		{
			try
			{
				Thread.sleep(1000);
			out.println("main()の処理をしています。");
			}
			catch(InterruptedException e) {}
		}
		
		try
		{
//			cars[cars.length-1].join();
			threads[threads.length-1].join();
		}
		catch(InterruptedException e) {}
		finally
		{
			sc.close();
			out.println("main()の処理を終わります。");
		}
		
//		sc.close();
		
//		out.println("main()の処理を終わります。");

	}

}
