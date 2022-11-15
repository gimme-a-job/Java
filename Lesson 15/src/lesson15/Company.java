package lesson15;

import static java.lang.System.*;

public class Company 
{
	private int sum = 0;
	
//	public void add(int a)
	public synchronized void add(int a)
	{
		int tmp = sum;
		out.println("現在、合計額は" + tmp + "円です。");
		out.println(a + "円稼ぎました。");
		tmp += a;
		out.println("合計額を" + tmp + "円にします。");
		sum = tmp;
	}

}
