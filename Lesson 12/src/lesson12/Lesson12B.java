package lesson12;

public class Lesson12B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		double radius = 5.0;
		Circle circle = new Circle(radius);
		
		double height = 7.0;
		double topside = 6.0;
		double bottomside = 9.0; 
		Trapezoid trapezoid = new Trapezoid(height, topside, bottomside);
		
		double verticalheight = 11.0;
		Pillar pillar;
		
		circle.showAreaInDetail();
		pillar = new Pillar(verticalheight, circle.getArea());
		pillar.showVolume("円");
		
		trapezoid.showAreaInDetail();
		pillar = new Pillar(verticalheight, trapezoid.getArea());
		pillar.showVolume("台形");

	}

}
