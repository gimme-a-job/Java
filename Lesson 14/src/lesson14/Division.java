package lesson14;

import static java.lang.System.*;

public class Division extends readInput //Lesson10よりコピー

{
	
	private int dividend; //割られる数(被除数)といふ意味らc "https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q1030565545"より
	private int divisor; //割る数（除数）といふ意味らc
	private double quotient; //商といふ意味らcよ
	private int remainder; //"余り"という意味らしぃぜ Lesson14より追加
	
//	//おまじない
//	Scanner sc = new Scanner(System.in);  //Lesson10
	
	
	public void setDividend() //Lesson14
	{
		out.print("\"割られる\"数を入力してください。 ");
		this.dividend = readInputInt();
	}
	
	public void setDividend(int count) //Lesson10
	{
		out.print(count + "回目の\"割られる\"数を入力してください。 ");
		this.dividend = readInputInt();
	}
	
	public void setDividend(int count, int dividend) //(使わない)
	{
		this.dividend = dividend;
	}
	
	public void setDivisor()  //Lesson14
	{
		out.print("\"割る\"数を入力してください。 ");
		int tempdivisor = readInputInt();
		
		if(tempdivisor == 0)
		{
			out.println("0除算エラーです");
			out.print("もう一度");
			setDivisor();
		}
		else
		{
		this.divisor = tempdivisor;
		}
		
	}
	
	public void setDivisor(int count)  //Lesson10
	{
		out.print(count + "回目の\"割る\"数を入力してください。 ");
		this.divisor = readInputInt();
	}
	
	public void setDivisor(int count,int divisor) //(使わない)
	{
		this.divisor = divisor;
	}
	
	public void setQuotient()  //Lesson14
	{
		setDividend();
		out.print("では次に");
		setDivisor();
		this.quotient = (double)getDividend() / (double)getDivisor();
		setRemainder(); //Lesson14
	}
	
	public void setQuotient(int count)  //Lesson10
	{
		setDividend(count);
		out.print("では次に");
		setDivisor(count);
		this.quotient = (double)getDividend() / (double)getDivisor();
		setRemainder(); //Lesson14
	}
	
	public void setRemainder() //除数と被除数が入力済の前提、あまりを返すだけ
	{
//		try 
//		{
		this.remainder = getDividend() % getDivisor();
//		}
//		catch(ArithmeticException e)
//		{
//			out.println(e); //検証用
//			out.println("0除算エラーです");
//			out.print("もう一度");
//			sc.next();
//			setDivisor();
//			setRemainder();
//		}
		
	}
	
	public int getDividend()  //Lesson10
	{
		return this.dividend;
	}
	
	public int getDivisor()  //Lesson10
	{
		return this.divisor;
	}
	
	public double getQuotient()  //Lesson10
	{
		return this.quotient;
	}
	
	public int getRemainder() //Lesson14
	{
		return this.remainder;
	}
	
	public void showQuotient(int count)  //Lesson10 //"商"が求められてること前提
	{
		out.println(count + "回目の四捨五入前の商は:" + getDividend() + "÷" + getDivisor() + "＝" + getQuotient());
	}
	
	public void showRoundedQuotient(int count)  //Lesson10 //"商"が求められてること前提
	{
		out.println(count + "回目の四捨五入後の商は:" + getDividend() + "÷" + getDivisor() + "＝" + Rounding(getQuotient()));
	}
	
	public void showFlooredQuotientAndRemainder() //Lesson14
	{
		out.println(getDividend() + "÷" + getDivisor() + "の商は " + Flooring(getQuotient()) + ",余りは " + getRemainder() + "です。");
	}
	
	public void showResultforL10B1(int count)  //Lesson10
	{
		setQuotient(count);
		showQuotient(count);
		showRoundedQuotient(count);
		out.println();
	}
	
	public void showResultforL14B2()
	{
		setQuotient();
		showFlooredQuotientAndRemainder();
	}
	
	public int Flooring(double val)  //Lesson14 //小数点付きの数字を投げたら、切り捨てして返してくれるメソッド
	{
		return (int)(Math.round(val));
	}
	
	public int Rounding(double val)  //Lesson10 //小数点付きの数字を投げたら、四捨五入して返してくれるメソッド
	{
		return (int)(Math.round(val));
	}
	
//	public int readInputInt()  //Lesson10
//	{
////		return sc.nextInt();
//		return super.readInputInt();
//	}

}
