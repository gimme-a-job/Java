package lesson10;

import static java.lang.System.*;

public class Sample7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Car car1;
		out.println("car1を宣言しました。");
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		Car car2;
		out.println("car2を宣言しました。");
		
		car2 = car1;
		out.println("car2にcar1を代入しました。");
		
		out.print("car1がさす");
		car1.show();
		out.print("car2がさす");
		car2.show();
		
		out.println("car1がさす車に変更を加えます。");
		car1.setCar(2345, 30.5);
		
		out.print("car1がさす");
		car1.show();
		out.print("car2がさす");
		car2.show();

	}

}
