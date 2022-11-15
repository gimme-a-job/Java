package lesson12;



public class Circle implements Shape{
	
	private double radius;
	
	
	//コンストラクタ	
	public Circle(double radius) {
		this.radius = radius;
	}
	//円の計算
	@Override
	public double calcArea() {
		// TODO 自動生成されたメソッド・スタブ
		return radius * radius * Math.PI;
	}

}
