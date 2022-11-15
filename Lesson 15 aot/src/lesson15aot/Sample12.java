package lesson15aot;

import static java.lang.System.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample12 {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		//文字列からDateインスタンスを生成
		Date d = f.parse("2020/09/22 01:23:45");
		out.println(d);
		
		//Dateインスタンスから文字列を生成
		Date now = new Date();
		String s = f.format(now);
		out.println("現在は" + s + "です");
		

	}

}
