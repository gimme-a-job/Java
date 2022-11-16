package lesson_3;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample6 {
	public static void main(String[] args)
	{
	out.println("整数を2つ入力してください。");
	
	BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
	 try { //"https://atmarkit.itmedia.co.jp/ait/articles/0605/12/news129_2.html"より
		 String str1 = br.readLine();
		 String str2 = br.readLine();
		 
		 int num1 = Integer.parseInt(str1);
		 int num2 = Integer.parseInt(str2);
		 		 
		 out.println("最初に" + num1 + "が入力されました");
		 out.println("次に" + num2 + "が入力されました");
		 
	    } catch (java.io.IOException e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        in.close();
//	    	  out.close();
	      } catch (java.io.IOException e) {
	        e.printStackTrace();
	      }
	    }
	
//	 String str1 = br.readLine();
//	 String str2 = br.readLine();
//	 
//	 int num1 = Integer.parseInt(str1);
//	 int num2 = Integer.parseInt(str2);
//	 		 
//	 out.println("最初に" + num1 + "が入力されました");
//	 out.println("次に" + num2 + "が入力されました");	}
	}
	}
