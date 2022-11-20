package leeson8;

import static java.lang.System.*;

import java.util.Scanner;

public class Lesson8B2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		out.println("ガキはナンニン？");
		
		Scanner sc = new Scanner(System.in);
		
		int counts = sc.nextInt();
		
		Student[] Students = new Student[counts];
		
		int i = 0;
		
		for(Student j:Students)
		{
			Students[i] = new Student();
			
			out.println((i+1) + "匹目の国語の点数は何点ぢゃ？");
			Students[i].setNat(sc.nextInt());
			
			out.println((i+1) + "匹目の数学の点数は何点ぢゃ？");
			Students[i].setMat(sc.nextInt());
			
			out.println((i+1) + "匹目の英語の点数は何点ぢゃ？");
			Students[i].setEng(sc.nextInt());
			
			Students[i].getTotal(); //各点数の合計を"Students"クラスのフィールド"Sum"に格納する"getTotal"メソッドをコール、無くても動くよ
			
			i++;
		}
		
		i = 0;
		
		for(Student k:Students)
		{
			out.println((i+1) + "番目の子の点数は");
			
			Students[i].showNat();
			
			Students[i].showMat();
			
			Students[i].showEng();
			
			out.println();
			
			i++;
		}
		
		
		sc.close();

	}

}
