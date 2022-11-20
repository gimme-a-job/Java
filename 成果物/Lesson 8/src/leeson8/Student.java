package leeson8;

import static java.lang.System.*;

public class Student {

	protected int Nat; //"Natinal Language"より
	protected int Mat; //"Math"より
	protected int Eng;
	protected int Sum;
	
	public void setNat(int nat)
	{
		this.Nat = nat;
	}
	
	public void setMat(int mat)
	{
		this.Mat = mat;
	}
	
	public void setEng(int eng)
	{
		this.Eng = eng;
	}
	
	public void setScore(int nat, int mat, int eng)
	{
		setNat(nat);
		setMat(mat);
		setEng(eng);
		out.println("各教科の点数をセットしました。");
	}
	
	public int getTotal()
	{
//		return (Nat + Mat + Eng); //"Sum"フィールド無いときはこっちを使おう
		this.Sum = Nat + Mat + Eng; //"Sum"フィールド消し飛ばしたら↑を使ってね
		return this.Sum;
	}
	
	
	public void showNat()
	{
		out.println("国語：" + Nat);
	}
	
	public void showMat()
	{
		out.println("数学：" + Mat);
	}
	
	public void showEng()
	{
		out.println("英語:" + Eng);
	}
	
	public void showTotal()
	{
//		out.println("合計:" + (Nat + Mat + Eng)); //初期版
		out.println("合計:" + getTotal()); //採用版
//		out.println("合計:" + Sum); //試験版
	}
	
	public void show()
	{
		showNat();
		showMat();
		showEng();
		showTotal();
	}
}
