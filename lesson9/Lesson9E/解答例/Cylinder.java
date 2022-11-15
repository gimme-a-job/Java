package lesson9;

class Cylinder {

	int radius;
	int height;
	double circumference;
	double circleArea;

	public void setInfo(int n, int m, double a, double b) {

		radius = n;
		height = m;
		circumference = a;
		circleArea = b;

	}

	public double calSurfaceArea() {

		double ans = (circleArea * 2) + (circumference * height);
		return ans;

	}

	public double calVolume() {

		double ans = circleArea * height;
		return ans;

	}

}
