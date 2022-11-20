package lesson16aot;

//練習問題②
//次のようなHeroクラスがあります。
//
//public class Hero {
//	private String name;
//	public Hero (String name) {
//		this.name = name;
//}
//Public String getName() {
//	return this.name;
//}
//}
//
//2人の勇者(ポリテク太郎、ポリテク次郎)をHeroとしてインスタンス化してArrayListに格納し、1人ずつ順番に取り出して名前を表示するプログラムを作成してください。

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;

public class SampleP2 {

	public static void main(String[] args) {

		List<Hero> heroes = new ArrayList<Hero>();

		String[] names = { "ポリテク太郎", "ポリテク次郎" };

		for (int i = 0; i < names.length; i++) {
			heroes.add(new Hero());
			heroes.get(i).setName(names[i]);
			out.println(heroes.get(i).getName());
		}

	}

}
