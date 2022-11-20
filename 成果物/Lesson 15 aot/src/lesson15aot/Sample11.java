package lesson15aot;

import static java.lang.System.*;

import java.util.Calendar;
import java.util.Date;

public class Sample11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Calendar c = Calendar.getInstance();
		//6つのint値からDateインスタンスを生成
		c.set(2019,8,22,1,23,45);
//		c.set(Calendar.MONTH, 9); /* 月を9(10月)に変更 */
		c.set(Calendar.MONTH, (10-1)); /* 月を9(10月)に変更 */
		
		Date d = c.getTime();
		out.println(d);
		
		//Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		
		int y = c.get(Calendar.YEAR); /*年を取り出す*/
		out.println("今年は" + y + "年です");
		

	}

}
