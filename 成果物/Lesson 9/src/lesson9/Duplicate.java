package lesson9;

import java.util.ArrayList;

public class Duplicate extends ConstValSet
{

	protected ArrayList<Integer> duplicates = new ArrayList<>(); //"https://www.sejuku.net/blog/13974"より
//	List<Integer> noduplicateconstvalset = new ArrayList<Integer>();
//	Set<Integer> tmpSet = new LinkedHashSet<Integer>(Arrays.sort(getConstValSet()));
//	protected int[] noduplicateconstvalset = new LinkedHashSet[]
	
	
	public void add2Duplicates(int val)
	{
		this.duplicates.add(val);
	}
	
	public int getConstValSetLength() //こいつの"子"の"Mark"クラスで使えないっぽかったので
	{
		return super.getConstValSetLength();
	}
	
	public int getDuplicates(int i)
	{
		return this.duplicates.get(i);
	}
	
	public ArrayList<Integer> getDuplicates() //可変長配列そのものを返す
	{
		return this.duplicates;
	}
	
	public int getgetDuplicatesSize() //可変長配列の長さを返す
	{
		return this.duplicates.size();
	}
}
