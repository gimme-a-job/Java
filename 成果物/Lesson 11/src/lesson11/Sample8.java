package lesson11;

import static java.lang.System.*;

public class Sample8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		Car car3;
		car3 = car1;
		
		boolean bl1 = car1.equals(car2);
		boolean bl2 = car1.equals(car3);
		
		out.println("car1とcar2が同じか調べたところ" + bl1 + "でした。");
		out.println("car1とcar3が同じか調べたところ" + bl2 + "でした。");
		

	}

}
