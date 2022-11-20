package lesson5;

import static java.lang.System.*;

import java.util.Scanner; //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より

public class Lesson5B3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		out.println("身長と体重を入力するのじゃな");
		
		Scanner sc = new Scanner(System.in); //"https://qiita.com/nanaco/items/fa14f5595a8ae18a3992"より
	    	    
	    double height = sc.nextInt();
	    double weight = sc.nextInt();
	    
	    double bmi = weight/(height/100*height/100);
	    
	    if(bmi <= 18.5)
	    {
	    	out.println("やせてます");
	    }
	    else if(bmi > 18.5&& bmi < 25)
	    {
	    	out.println("正常です");
	    }
	    else if(bmi >= 25 && bmi < 30)
	    {
	    	out.println("太ってます");
	    }
	    else if(bmi >= 30)
	    {
	    	out.println("肥満");
	    }
	    else
	    {
	    	out.println("You found a exception!");
	    	out.println("height is :" + height);
			out.println("weight is :" + weight);
			out.println("bmi is :" + bmi);
	    }
	    
	    //debugよう
	    out.println("You found a exception!");
    	out.println("height is :" + height);
		out.println("weight is :" + weight);
		out.println("bmi is :" + bmi);
	    
		sc.close();
	}

}
