package lesson9;

public class ConstValSet
{
//	protected final int[] constvalset = {9, 2, 5};
	protected final int[] constvalset = {9, 2, 5, 8, 7, 6, 4, 3, 1};
	protected final int exactmatchpoint = 2; //値も位置も一致した時の得点(いちいち名前が長ぇ？うるせぇ)
	protected final int valmatchpoint = 1; //位置は違うが値は一致した場合の得点
	protected final int nomatchpoint = 0; //値まったくかすってない時の得点
	protected boolean flg = false;
	protected boolean[] flgs = new boolean[getConstValSetLength()]; //問題勘違いしてたので追加

	
	public void setFlg(int i, boolean bl)
	{
		this.flgs[i] = bl;
		
		if(bl == true)
		{
			this.flg = true;
		}
	}
	
	
	public int getConstValSet(int i) //配列内の値の位置を指定させて、その値のみ返すメソッド
	{
		return this.constvalset[i];
	}
	
	public int[] getConstValSet() //配列ごと返すメソッド、↑と紛らわしいって？うるせー！
	{
		return this.constvalset;
	}
	
	public int getConstValSetLength() //配列の長さを返すメソッド
	{
		return this.constvalset.length;
	}
	
	public int getExactMatchPoint()
	{
		return this.exactmatchpoint;
	}
	
	public int getValMatchPoint()
	{
		return this.valmatchpoint;
	}
	
	public int getNoMatchPoint()
	{
		return this.nomatchpoint;
	}
	
	public boolean getFlg()
	{
		return this.flg;
	}
	
	public boolean getFlg(int i)
	{
		return this.flgs[i];
	}

}
