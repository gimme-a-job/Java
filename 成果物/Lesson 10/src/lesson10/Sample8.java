package lesson10;



public class Sample8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Car car1;
		car1 = new Car();
		
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1号車";
		
		car1.setCar(number, gasoline);
		car1.setName(str);
		
		car1.show();
		

	}

}
