package leeson8;

import static java.lang.System.*;

import java.util.Scanner;

public class Lesson8B1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("貴様の犬は何体ぢゃ？");
		
		//おまじない
		Scanner sc = new Scanner(System.in);
		
		int counts = sc.nextInt();

		//dogs配列を宣言
		Dog[] dogs = new Dog[counts];
		
		//繰り返し用変数"i"を宣言
		int i = 0;
		
//		String nmTemp = ""; //検証のため
//		int ageTemp = 0; //検証のため
		
		for(Dog j : dogs)
		{
			dogs[i] = new Dog();
			out.println((i+1) + "体目の犬の名前は何じゃ？");
			
			dogs[i].setNm(sc.next());
//			dogs[i].setNm(sc.nextLine()); //動かない
			
//			nmTemp = sc.nextLine(); //検証のため
//			dogs[i].setNm(nmTemp); //検証のため
			
			
			
			out.println((i+1) + "体目の犬の年齢はいくつじゃ？");

			dogs[i].setAge(sc.nextInt());
			
//			ageTemp = sc.nextInt(); //検証のため
//			dogs[i].setAge(ageTemp); //同上
			
			
			i++;
		}
		
		
		//一旦繰り返し用変数"i"を初期化
		i = 0;
		
		for(Dog k : dogs) //拡張for文使いたいだけなのでkはシカトでok
		{
			dogs[i].showNm();
			dogs[i].showAge();
			i++;
		}
		
		sc.close();
	}

}
