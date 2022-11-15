package lesson15aot;

import static java.lang.System.*;

public class Sample8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Hero hero = new Hero();
		
		hero.name = "minato";
		hero.job = "hero";
		hero.gold = 280;
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		
		out.println(s);
		

	}

}
