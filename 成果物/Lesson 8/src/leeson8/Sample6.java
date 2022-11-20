package leeson8;

import static java.lang.System.*;

public class Sample6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Car car1 = new Car();
		
		car1.setNumGas(1234, 20.5);
		
		int number = car1.getNum();
		double gasoline = car1.getGas();
		
		out.println("サンプルから車を調べたところ");
		out.println("ナンバーは" + number + "ガソリン量は" + gasoline + "でした。");
		
	}

}
