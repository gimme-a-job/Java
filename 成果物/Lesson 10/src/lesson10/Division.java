package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

public class Division 

{
	
	private int dividend; //割られる数(被除数)といふ意味らc "https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q1030565545"より
	private int divisor; //割る数（除数）といふ意味らc
	private double quotient; //商といふ意味らcよ
	
	//おまじない
	Scanner sc = new Scanner(System.in);
	
	
	public void setDividend(int count)
	{
		out.print(count + "回目の\"割られる\"数を入力してください。 ");
		this.dividend = readInputInt();
	}
	
	public void setDividend(int count, int dividend) //(使わない)
	{
		this.dividend = dividend;
	}
	
	public void setDivisor(int count)
	{
		out.print(count + "回目の\"割る\"数を入力してください。 ");
		this.divisor = readInputInt();
	}
	
	public void setDivisor(int count,int divisor) //(使わない)
	{
		this.divisor = divisor;
	}
	
	public void setQuotient(int count)
	{
		setDividend(count);
		out.print("では次に");
		setDivisor(count);
		this.quotient = (double)getDividend() / (double)getDivisor();
	}
	
	public int getDividend()
	{
		return this.dividend;
	}
	
	public int getDivisor()
	{
		return this.divisor;
	}
	
	public double getQuotient()
	{
		return this.quotient;
	}
	
	public void showQuotient(int count) //"商"が求められてること前提
	{
		out.println(count + "回目の四捨五入前の商は:" + getDividend() + "÷" + getDivisor() + "＝" + getQuotient());
	}
	
	public void showRoundedQuotient(int count) //"商"が求められてること前提
	{
		out.println(count + "回目の四捨五入後の商は:" + getDividend() + "÷" + getDivisor() + "＝" + Rounding(getQuotient()));
	}
	
	public void showResult(int count)
	{
		setQuotient(count);
		showQuotient(count);
		showRoundedQuotient(count);
		out.println();
	}
	
	public int Rounding(double val) //小数点付きの数字を投げたら、四捨五入して返してくれるメソッド
	{
		return (int)(Math.round(val));
	}
	
	public int readInputInt()
	{
		return sc.nextInt();
	}

}
