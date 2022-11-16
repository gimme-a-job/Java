package lesson9;

//[i]に生成するオブジェクト
public class Mark extends Duplicate  //"InputVals"とかよりはマシか,イギリス英語らしい"https://3040english.info/score-point-grade-mark/"より
{

//	protected int sum; //"Point"クラスのフィールド変数"val"の合計を格納→こんなもん要らんかったわ！
	protected int mark; //"Point"クラスのフィールド変数"point"の合計を格納
//	private boolean flg = false; //"Point"クラスのフィールド変数"flg"らが全部trueかどうか⇒ワイの能力じゃこれ活用できん
	
	
	
//	public void addSum()
//	{
//		
//	}
	
//	public void setSum()
//	{
//		
//	}
//	
	public void addPoint2Mark(int point)
	{
		this.mark += point;
	}
	
	
//	public void setMark()
//	{
//		
//	}
//	
//	public void setFlg()
//	{
//		
//	}
	
	public int getConstValSetLength() //こいつの"子"の"Point"クラスで使えないっぽかったので
	{
		return super.getConstValSetLength();
	}
	
//	public int getSum()
//	{
//		return this.sum;
//	}
	
	public int getMark()
	{
		return this.mark;
	}
	
//	public boolean getFlg()
//	{
//		return this.flg;
//	}
	
	
}
