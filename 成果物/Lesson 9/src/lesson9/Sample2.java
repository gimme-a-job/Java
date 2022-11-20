package lesson9;

import static java.lang.System.*;

public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Car car1 = new Car();
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		
		out.println("正しくないガソリン量（-10.0）を指定してみます・・・。");
		
		car1.setNumGas(1234, -10.0);
		car1.show();
		
	}

}
