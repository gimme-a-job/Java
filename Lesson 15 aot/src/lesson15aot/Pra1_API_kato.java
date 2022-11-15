package lesson15aot;

import java.util.Arrays;

public class Pra1_API_kato {
	//	static String a;
//	static String s;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		StringBuilder s = new StringBuilder();
		//
		//		for (int i = 1; i < 101; i++) {
		//		
		//			s.append(i).append(",");
		//			 
		//		
		//		}
		//		
		//		System.out.println(s);
		//		
		//		String c = s.toString();
		//		String[] a = c.split(",");
		//		
		//		System.out.println(Arrays.toString(a));
		//	}
		//}

		String s = "";
		
//		for (int i = 1; i < 100; i++) {
		for (int i = 1; i <= 100; i++) {

//			Integer b = Integer.valueOf(i);
			//			String s = b.toString();
//			s = b.toString();
			s += String.valueOf(i);
			
//			s = s + ",";
			

//			if (i >= 99) {
//
//				s = s + 100;
//
//			}
			
			if(i != 100)
			{
				s += ",";
			}

			
		}
		
		System.out.println("sを表示します");
		System.out.print(s);

		
		System.out.println("\n"); //いったん改行
		
		String c = s.toString();
		String[] a = c.split(",");

		System.out.println("Arrays.toString(a)を表示します");
		System.out.print(Arrays.toString(a));
		
		System.out.println("\n"); //いったん改行
		
		System.out.println("a[]を繰り返しで表示します");
		for(int i=(1-1); i<100;i++)
		{
			System.out.print(a[i]);
			if(i != 99)
			{
				System.out.print(",");
			}
		}


	}
}
