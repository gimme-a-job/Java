package leeson8;

import static java.lang.System.*;

public class Dog 
{

	protected String nm;
	protected int age;
//	public String nm; //検証のため
//	public int age; //同上
	
	public void setNm(String nm)
	{
		this.nm = nm;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void showNm()
	{
		out.println("犬の名前は" + nm + "です。");
	}
	
	public void showAge()
	{
		out.println("犬の年齢は" + age + "です。");
	}
}
