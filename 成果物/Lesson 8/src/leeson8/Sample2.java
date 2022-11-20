package leeson8;

import static java.lang.System.*;

//車クラス
class Car2 //Sample1でCarクラスは定義済みのため名前変更
{
	int num;
	double gas;
	
	void show()
	{
		out.println("車のナンバーは" + num + "です。");
		out.println("ガソリン量は" + gas + "です。");
	}
}


public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Car2 car1;
		car1 = new Car2();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();

	}

}
