package lesson9;

class Circle {

	int radius;
	double pi = 3.14;

	public void setRadius (int n) {

		radius = n;

	}

	public double calCircumference() {

		double ans = (2 * radius) * pi;
		return ans;

	}

	public double calCircleArea() {

		double ans = (radius * radius) * pi;
		return ans;

	}

}
