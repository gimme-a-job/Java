package lesson12;

import static java.lang.System.*;

public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Vehicle[] vc;
		vc = new Vehicle[2];
		
		vc[0] = new Car(1234,20.5);
		vc[1] = new Plane(232);
		
		for(int i=0; i<vc.length; i++)
		{
			if(vc[i] instanceof Car)
				out.println((i+1) + "番目のオブジェクトはCarクラスです。");
			else
				out.println((i+1) + "番目のオブジェクトはCarクラスではありません。");
		}

	}

}
