package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

class TestResult {

	private String name;
	private int englishScore;
	private int mathScore;
	
	private Scanner sc = new Scanner(System.in);

	public TestResult(int i) //Lesson10D3
	{
		String conststr = (i+1) + "人目の";
		
		out.print(conststr);
		setName();
		out.print(conststr);
		setEnglishScore();
		out.print(conststr);
		setMathScore();
	}
	
	public TestResult(String name,int englishScore,int mathScore)
	{
		setName(name);
		setEnglishScore(englishScore);
		setMathScore(mathScore);
	}
	
	public void setName()  //Lesson10D3
	{

		out.println("名前を入力してください");
		this.name = readInputString();

	}

	
	public void setName(String str) {

		name = str;

	}

	public void setEnglishScore()  //Lesson10D3
	{

		out.println("英語の点数を入力してください");
		this.englishScore = readInputInt();

	} 
	
	public void setEnglishScore(int n) {

		englishScore = n;

	}

	public void setMathScore()  //Lesson10D3
	{

		out.println("数学の点数を入力してください");
		this.mathScore = readInputInt();
	}
	
	public void setMathScore(int n) {

		mathScore = n;

	}

	public String getName() {

		return name;

	}

	public int getEnglishScore() {

		return englishScore;

	}

	public int getMathScore() {

		return mathScore;

	}
	
	public void showTestResult()
	{
		out.println(getName() + "さんの英語の点数は" + getEnglishScore() + "点、数学の点数は" + getMathScore() + "点です。");
	}
	
	public String readInputString()  //Lesson10D3
	{
		return sc.next();
	}
	
	public int readInputInt()  //Lesson10D3
	{
		return sc.nextInt();
	}
	
	public void scClose()  //Lesson10D3
	{
		sc.close();
	}

}
