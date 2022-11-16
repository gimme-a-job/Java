package lesson9;

import static java.lang.System.*;

public class Sample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Car car1 = new Car();
		
		car1.setCar(1234, 20.5);
		car1.show();
		
		out.println("車のナンバーだけ変更します。");
		car1.setCar(2345);
		car1.show();
		
		out.println("ガソリン量だけ変更します。");
		car1.setCar(30.5);
		car1.show();
		
	}

}
