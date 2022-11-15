package lesson15;

import static java.lang.System.*;

import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		Company cmp = new Company();
		
		out.println("How many drivers do ya have?");
		
		Scanner sc = new Scanner(System.in);
		
		int counts = sc.nextInt();
		
		Driver[] drivers = new Driver[counts];
		
		final int consti = 0;
		int i = consti;
		
		for(Driver j:drivers) //"j"はシカトでok
		{
			drivers[i] = new Driver(cmp);
			drivers[i].start();
			i++;
		}

	}

}
