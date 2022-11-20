package ex;

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.List;

public class Ex15_StrArray // 文字列動的配列クラス
{
	
	 protected static List<String> items = new ArrayList<String>(); // 文字列を保持する
	 
	// 最下行に要素を追加
	 public static void add(String data)
	 {
		 items.add(data);
	 } 
	
	 // 指定インデックスの要素を上書き（指定インデックスが無い場合エラー）
	 public static void set(int index, String data)
	 {
		 items.set(index, data);
	 }
	 
	 // 指定インデックスの要素を取得（指定インデックスが無い場合エラー）
	 public static String get(int index)
	 {
		 return items.get(index);
	 } 
	
	 // 全ての要素をクリア
	 public static void clear()
	 {
		 items.clear();
		 out.println("要素全てをクリアしました。");
	 }



}
