package lesson6;


public class Matome6 {
	public static void main(String[] args) {
		//		for(int i = 1; i<=10; i++) {
		//			if(i%2 == 0) {
		//				System.out.println(i);
		//			}
		//		}
		//		Scanner scanner = new java.util.Scanner(System.in);
		//		int str1 = scanner.nextInt();
		//		int str2 = scanner.nextInt();
		//		int str3 = scanner.nextInt();
		//		int str4 = scanner.nextInt();
		//		int str5 = scanner.nextInt();
		//		int str6 = scanner.nextInt();
		//		scanner.close();
		//		//int sum = str1+str2+str3+str4+str5+str6;
		//		System.out.println(str1+str2+str3+str4+str5+str6);
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.print("\n");
		}
	}
}
