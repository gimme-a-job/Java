package lesson9;

import static java.lang.System.*;

class A
{
	A()
	{
	out.println("引数0のコンストラクタです。");
	}
	
	A(int a)
	{
		this();
		out.println("引数1のコンストラクタです。");
	}
	
}



public class SampleP4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		A a1 = new A();
		A a2 = new A(10);

	}

}
