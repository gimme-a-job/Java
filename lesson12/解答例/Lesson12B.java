package lesson12;

public class Lesson12B {

	public static void main(String[] args) {
		
		//柱体の高さ
		final double pillarHeight = 11.0;
		//まず円の面積を求める
		final double radius = 5.0;
		Circle cir = new Circle(radius); 
		
		System.out.println("半径" + radius + "の円の面積は" + cir.calcArea());
		//円柱の体積を求める、円柱の体積の求め方は円の面積*高さ
		Pillar pi1 = new Pillar(cir.calcArea(),pillarHeight);
		
		System.out.println("高さが" + pillarHeight + "の上記の円柱の体積は" + pi1.calcVolume());
		
		//台形の面積
		final double upperLength = 6.0;
		final double lowerLenggth = 9.0;
		final double heigth = 7.0;
		
		Trapezoid tr = new Trapezoid(upperLength,lowerLenggth,heigth ) ;
		System.out.println("上底" + upperLength + "下底" + lowerLenggth + "高さ" +lowerLenggth + "の");
		System.out.println("台形の面積は" + tr.calcArea());
		
		Pillar pi2 = new Pillar(tr.calcArea(),pillarHeight);
		
		System.out.println("高さが" + pillarHeight + "の上記の台形柱の体積は" + pi2.calcVolume());

	}

}
