
package lesson_3;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample4 {
	public static void main(String[] args)
	{
	out.println("文字列を入力してください。");
	
	BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
	 try { //"https://atmarkit.itmedia.co.jp/ait/articles/0605/12/news129_2.html"より
		 String str = br.readLine();
		 out.println(str + "が入力されました");
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
	
//	String str = br.readLine();
	
//	out.println(str + "が入力されました");
	}
}
