package leeson8;

import static java.lang.System.*;

public class Creature {

	protected String nm; // "name"より
	protected int vit; // "vitality"より
	
	public void setNm(String nm)
	{
		this.nm = nm;
	}
	
	public void setVit(int vit)
	{
		if(vit < 0)
		{
			out.println("生命値にマイナスは無ぇべから\"0\"にすんど");
			this.vit = 0;
		}
			else if(vit >= 0)
			{
				this.vit = vit;
			}
			else
			{
				out.println("You found a exception!");
				out.println("this.vit :" + this.vit);
				out.println("vit :" + vit);
			}
		
	}
	
	public String getNm()
	{
		return nm;
	}
	
	public int getVit()
	{
		return vit;
	}
	
	public void showNm()
	{
		out.println("名前：" + getNm());
	}
	
	public void showVit()
	{
		out.println("ライフ：" + getVit());
	}
	
	
}
