package lesson12;

public class Trapezoid implements Shape {
	
	private double upperLength;//上底の長さ
	private double lowerLenggth;//下底の長さ
	private double heigth;//高さ
	
	//コンストラクタ
	public Trapezoid(double ue,double sita,double takasa) {
		upperLength = ue;
		lowerLenggth = sita;
		heigth = takasa;
	}

	@Override
	public double calcArea() {
		
		return (upperLength + lowerLenggth)*heigth/2.0;
	}

}
