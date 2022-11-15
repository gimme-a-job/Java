package lesson11;

import static java.lang.System.*;

public class Sample9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Car[] cars = new Car[2];
		
		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		for(int i=0; i<cars.length; i++)
		{
			Class cl = cars[i].getClass();
			out.println((i+1) + "番目のオブジェクトのクラスは" + cl + "です。");
		}

	}

}
