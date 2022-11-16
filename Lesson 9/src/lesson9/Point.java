package lesson9;

//[][j]に生成するオブジェクト
public class Point extends Mark //"InputVal"より変更、もっとマシな名前募集中
{
	protected int val; //入力値を格納
	protected int point = super.getNoMatchPoint(); //入力値に対する点数を格納、イギリス英語"https://3040english.info/score-point-grade-mark/"
	private boolean flg = false; //点数出たか
	

	
	public void setVal(int val)
	{
		this.val = val;
	}
	
	public void setPoint(int point)
	{
		this.point = point;
		setFlg(true); //点数出たのでフラグを立てる
	}
	
	private void setFlg(boolean flg) //"setPoint"されたらフラグを"true"に
	{
		this.flg = flg;
	}
	
	public int getConstValsLength() //
	{
		return super.getConstValSetLength();
	}
	
	public int getVal()
	{
		return this.val;
	}
	
	public int getPoint()
	{
		return this.point;
	}
	
	public boolean getFlg()
	{
		return this.flg;
	}
	
	

}
