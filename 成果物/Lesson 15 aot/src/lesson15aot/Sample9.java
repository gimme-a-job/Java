package lesson15aot;

import static java.lang.System.*;

public class Sample9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		long start = currentTimeMillis();
		//ここでなんらかの時間がかかる処理
		long end = currentTimeMillis();
		
		out.println("処理にかかった時間は..." + (end-start) + "ミリ秒でした");
		

	}

}
