package lesson16aot;

//練習問題③
//練習問題②の2人の勇者をインスタンス化し、それぞれの勇者が倒した敵の数(3、7)と勇者をペアでコレクションに格納してください。次に1つずつ取り出し、次のような画面表示を行ってください(表示準は不問)
//
//ポリテク太郎が倒した敵＝3
//ポリテク次郎が倒した敵＝7


import static java.lang.System.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleP3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		SampleP2.main(args);
		List<Hero> heroes = new ArrayList<Hero>();

		String[] names = { "ポリテク太郎", "ポリテク次郎" };

		for (int i = 0; i < names.length; i++) {
			heroes.add(new Hero());
			heroes.get(i).setName(names[i]);
			out.println(heroes.get(i).getName());
		}
		
		
		out.println();
		
//		Map<String, int[]> defeated = new HashMap<String, int[]>();
		Map<String, Integer> defeated = new HashMap<String, Integer>();
		
		int[] killstreaks = {3,7};
		
		for(int i=0;i<heroes.size(); i++)
		{
			
			String tempname = heroes.get(i).getName();
			defeated.put(tempname, killstreaks[i]);
			out.println(tempname + "が倒した敵＝" + defeated.get(tempname));
		}

	}

}
