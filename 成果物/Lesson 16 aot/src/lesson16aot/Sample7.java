package lesson16aot;

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;

//class Hero{
//	public String name;
//}

public class Sample7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Hero h = new Hero();
//		h.name = "ミナト";
		h.setName("ミナト");
		
		List<Hero> list =  new ArrayList<Hero>();
		list.add(h);
		
//		h.name = "スガワラ";
		h.setName("スガワラ");
//		out.println(list.get(0).name);
		out.println(list.get(0).getName());
		

	}

}
