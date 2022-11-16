package lesson9;

import static java.lang.System.*;

import java.util.Scanner;

public class CalculationBMI {

	
	//フィールド変数
	private String name = null;
	private int age = 0;
	private double height = 0.0;
	private double weight = 0.0;
	private double ansBMI = 0.0;
	private String resultBMI = null;
	
	private int min = 1;
	private int max = 100;
	
	Scanner sc = new Scanner(System.in);

	
	public void setName()
	{
		out.println("名前を入力してください。");
		
//		Scanner sc = new Scanner(System.in);
		
		this.name = readInputString();
//		this.name = sc.next();
//		
//		sc.close();
	}
	
	public void setName(String name)
	{
		out.println("名前を入力してください。");
		this.name = name;
	}
	
	public boolean setAge()
	{
		out.println("年齢を入力してください。(1以上100以下で入力)");
//		Scanner sc = new Scanner(System.in);
		
		int tempnum = readInputInt();
//		int tempnum = sc.nextInt();
//		
//		sc.close();
		
		if(tempnum >= min && tempnum <= max)
		{
			this.age = tempnum;
			return true;
		}
		else 
		{
			out.println("年齢は１以上１００以下の数字で入力してください。");
			out.println("処理を中断します。");
			return false;
		}
		
		
	}
	
	public boolean setAge(int age)
	{
		out.println("年齢を入力してください。(1以上100以下で入力)");
		int tempnum = age;
		
		if(tempnum >= min && tempnum <= max)
		{
			this.age = tempnum;
			return true;
		}
		else 
		{
			out.println("年齢は１以上１００以下の数字で入力してください。");
			out.println("処理を中断します。");
			System.exit(0);
			return false;
		}
	}
	
	public void setHeight()
	{
		out.println("身長（単位「ｍ」）を入力してください。");
		
//		Scanner sc = new Scanner(System.in);
		
		this.height = readInputDouble();
//		this.height = sc.nextDouble();
		
//		sc.close();
	}
	
	public void setHeight(double height)
	{
		out.println("身長（単位「ｍ」）を入力してください。");
		this.height = height;
	}
	
	public void setWeight()
	{
		out.println("体重を入力してください。");
		
//		Scanner sc = new Scanner(System.in);
		
		this.weight = readInputDouble();
//		this.weight = sc.nextDouble();
		
//		sc.close();
	}
	
	public void setWeight(double weight)
	{
		out.println("体重を入力してください。");
		this.weight = weight;
	}
	
	public boolean setInfo()
	{
		setName();
		boolean tempbl = setAge();
		
		if(tempbl == true)
		{
		setHeight();
		setWeight();
		}
		
		return tempbl;
	}
	
	public boolean setInfo(String name, int age, double height, double weight) //自分では使わないかも
	{
		setName(name);
		boolean tempbl = setAge(age);
		setHeight(height);
		setWeight(weight);
		
		return tempbl;
	}
	
	public void setAnsBMI()
	{
		this.ansBMI = (this.weight / ( this.height * this.height ));
	}
	
	public void setResultBMI()
	{
		double tempansBMI = getAnsBMI();
		
		if(tempansBMI < 18.5)
		{
			this.resultBMI = "やせ型";
		}
		else if(tempansBMI >= 18.5 && tempansBMI < 25)
		{
			this.resultBMI = "普通体型";
		}
		else if(tempansBMI >= 25)
		{
			this.resultBMI = "肥満体型";
		}
		else
		{
			//気が向いたら作るかもかも
		}
	}
	
	public String readInputString()
	{
//		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		sc.close();
		return str;
	}
	
	public int readInputInt()
	{
//		Scanner sc = new Scanner(System.in);
		int intval = sc.nextInt();
//		sc.close();
		return intval;
	}
	
	public double readInputDouble()
	{
//		Scanner sc = new Scanner(System.in);
		double doubleval = sc.nextDouble();
//		sc.close();
		return doubleval;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public double getAnsBMI()
	{
		setAnsBMI();
		return this.ansBMI;
	}
	
	public String getResultBMI()
	{
		setResultBMI();
		return this.resultBMI;
	}
	
	public void getCalculatedBMI() //良いネーミング募集中
	{
		out.println(getName() + "さん（" + getAge() + "歳)のBMIは" + getAnsBMI() + "です。");
		out.println("あなたの体型は「" + getResultBMI() + "」です。");
	}
	
	public void scClose()
	{
		sc.close();
	}
}
