package lesson15;

import static java.lang.System.*;

public class Sample1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Car car1 = new Car("１号車");
		car1.start();
		
		for(int i=0; i<5; i++)
		{
			out.println("main()の処理をしています。");
		}

	}

}
