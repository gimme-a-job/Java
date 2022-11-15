package lesson12;

import static java.lang.System.*;

public class Trapezoid implements Shape
{

	
	//フィールド変数---------------------------------------------------------------------------------------------------
//	private int height;
	private double height;
	
//	private int topside;
//	private int bottomside;
	private double topside;
	private double bottomside;
	
	private double area;
	
	
	//メソッド-----------------------------------------------------------------------------------------------------------------
//	public Trapezoid(int height, int topside, int bottomside)
	public Trapezoid(double height, double topside, double bottomside)
	{
		setArea(height, topside, bottomside);
	}
	
//	public void setHeight(int height)
	public void setHeight(double height)
	{
		this.height = height;
	}
	
//	public void setTopSide(int topside)
	public void setTopSide(double topside)
	{
		this.topside = topside;
	}
	
//	public void setBottomSide(int bottomside)
	public void setBottomSide(double bottomside)
	{
		this.bottomside = bottomside;
	}
	
	public void setArea()
	{
		this.area = (getTopSide() + getBottomSide()) * getHeight() / (double)2;
	}
	
//	public void setArea(int height, int topside, int bottomside)
	public void setArea(double height, double topside, double bottomside)
	{
		setHeight(height);
		setTopSide(topside);
		setBottomSide(bottomside);
		
		this.area = (getTopSide() + getBottomSide()) * getHeight() / (double)2;
	}
	
//	public int getHeight()
	public double getHeight()
	{
		return this.height;
	}
	
//	public int getTopSide()
	public double getTopSide()
	{
		return this.topside;
	}
	
//	public int getBottomSide()
	public double getBottomSide()
	{
		return this.bottomside;
	}
	
	public double getArea()
	{
		setArea();
		return this.area;
	}
	
	public void showArea()
	{
		out.println("台形の面積は" + getArea() + "です。");
	}
	
	public void showAreaInDetail()
	{
		out.print("上底" + getTopSide() + "、下底" + getBottomSide() + "、高さ" + getHeight() + "の");
		showArea();
	}
	
	@Override
	public double calcArea() 
	{
		// TODO 自動生成されたメソッド・スタブ
		return getArea();
		
	}
	
	

}
