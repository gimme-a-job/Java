package lesson11;

import static java.lang.System.*;

class A
{
	A()
	{
		out.println("Aの引数0のコンストラクタです。");
	}
	
	A(int a)
	{
		out.println("Aの引数1のコンストラクタです。");
	}
	
	}

class B extends A
{
	B()
	{
		out.println("Bの引数0のコンストラクタです。");
	}
	B(int b)
	{
		super(b);
		out.println("Bの引数1のコンストラクタです。");
	}
}

public class SampleP3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		B b1 = new B();
		B b2 = new B(10);
		

	}

}
