package lesson10;

public class Lesson10B3 {

	public static void main(String[] args) throws Exception
	{
		// TODO 自動生成されたメソッド・スタブ
		
		//"https://techacademy.jp/magazine/31988"より
		
		//動かーん
//		 // 現在日時情報で初期化されたインスタンスの生成
//		 Date dateObj = new Date();
//		 SimpleDateFormat format = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
//		 // 日時情報を指定フォーマットの文字列で取得
//		 String display = format.format( dateObj );
//		 out.println( "=== Dateクラスを利用 ===" );
//		 out.println( display );
//		 
		//動ーく 
//		// 現在日時情報で初期化されたインスタンスの取得
//		 LocalDateTime nowDateTime = LocalDateTime.now(); 
//		 DateTimeFormatter L10B3Format = DateTimeFormatter.ofPattern("yyyy'年'MM'月'dd'日('E')' HH'時'mm'分'ss'秒'");
//		 // 日時情報を指定フォーマットの文字列で取得
//		 String L10B3Disp = nowDateTime.format( L10B3Format );
//		 out.println( "=== LocalDateTimeクラスを利用 ===" );
//		 out.println( L10B3Disp );
		
		DateTime datetime = new DateTime();
		
		datetime.showLocalDateTime();

	}

}
