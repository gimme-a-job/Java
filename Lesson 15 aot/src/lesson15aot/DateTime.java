package lesson15aot;

import static java.lang.System.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime extends Thread
{
	// 現在日時情報で"https://techacademy.jp/magazine/31988"より
	LocalDateTime nowDateTime;
	DateTimeFormatter L10B3Format = DateTimeFormatter.ofPattern("yyyy'年'MM'月'dd'日('E')' HH'時'mm'分'ss'秒'");
	// 日時情報を
	String L10B3Disp;
	
	DateTimeFormatter L15aotSP4Format = DateTimeFormatter.ofPattern("yyyy'年'MM'月'dd'日('E')' HH'時'mm'分'ss'秒'");
	// 日時情報を
	String L15aotSP4Disp;

	public void showLocalDateTime() throws Exception
	{
		// 現在日時情報で初期化されたインスタンスの取得
		this.nowDateTime = LocalDateTime.now();

		// 日時情報を指定フォーマットの文字列で取得
		this.L10B3Disp = this.nowDateTime.format(this.L10B3Format);
		out.println("=== LocalDateTimeクラスを利用 ===");
		out.println(this.L10B3Disp);
		
		Thread.sleep(1000);
		
		showLocalDateTime();
	}
	
	public void showLocalDateTime_L15aotSP4() throws Exception
	{
		// 現在日時情報で初期化されたインスタンスの取得
		this.nowDateTime = LocalDateTime.now().plusDays(100) ; //"https://blog.java-reference.com/java-localdatetime-plus-minus/"より

		// 日時情報を指定フォーマットの文字列で取得
		this.L15aotSP4Disp = this.nowDateTime.format(this.L15aotSP4Format);
		out.println("=== LocalDateTimeクラスを利用 ===");
		out.println(this.L15aotSP4Disp);
		
		Thread.sleep(1000);
		
		showLocalDateTime_L15aotSP4();
	}


}
