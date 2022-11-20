package lesson9;

public class CalculationBMI {

	private String name;
	private int age;
	private double height;
	private double weight;
	private double ans;

	//名前のセッター
	public void setInfo( String str ) {

		name = str;

	}

	//年齢のセッター
	public boolean setInfo( int n ) {

		boolean bl = true;
		int a = 1;
		int b = 100;

		if ( n >= a && n <= b ) {

			age = n;
			return bl;

		} else {

			bl = false;
			return bl;

		}

	}

	//身長と体重のセッター
	public void setInfo( double a, double b ) {

		height = a;
		weight = b;

	}

	//名前のゲッター
	public String getName() {

		return name;

	}

	//年齢のゲッター
	public int getAge() {

		return age;

	}

	//BMI計算
	public double calculationBMI() {

		ans = weight / ( height * height );

		return ans;

	}

	//BMIの値に対応する体型の判定
	public String resultBMI() {

		String result = null;
		double a = 18.5;
		double b = 25.0;

		if ( ans < a ) {

			result = "瘦せ型";

		} else if ( ans >= a && ans < b ) {

			result = "普通体型";

		} else if ( ans > b ) {

			result = "肥満体型";

		}

		return result;

	}

}
