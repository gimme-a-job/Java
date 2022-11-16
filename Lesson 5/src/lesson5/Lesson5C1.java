
package lesson5;

import static java.lang.System.*;

public class Lesson5C1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int fortune = (int) (Math.random() * 6) + 1; //p317

		switch (fortune) {
		case 1:
			out.println("あなたの運勢は大吉です。");
			break;
		case 2:
			out.println("あなたの運勢は中吉です。");
			break;
		case 3:
			out.println("あなたの運勢は小吉です。");
			break;
		case 4:
			out.println("あなたの運勢は吉です。");
			break;
		case 5:
			out.println("あなたの運勢は凶です。");
			break;
		case 6:
			out.println("あなたの運勢は大凶です。");
			break;
		default:
			out.println("You found a exception!");
			out.println("fortune is :" + fortune);
		}
	}

}
