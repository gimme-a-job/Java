package lesson9;

import static java.lang.System.*;

public class Dog 
{

	protected String nm; //Lesson8まではこっち
	protected int age; //同上
//	public String nm; //検証のため⇒問題で指定⇒勘違い
//	public int age; //同上
	
	public void setNm(String nm)
	{
		this.nm = nm;
	}
	
	public void setNm(String sirNm,String nm)
	{
		this.nm = sirNm + " " + nm;
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
