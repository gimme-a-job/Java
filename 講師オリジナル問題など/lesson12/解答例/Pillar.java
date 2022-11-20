package lesson12;

public class Pillar {
	
	private double shape;
	private double height;
	
	public Pillar(double shape,double height) {
		this.shape = shape;
		this.height = height;
	}
	public double calcVolume(){
		return shape * height;
		
	}

}
