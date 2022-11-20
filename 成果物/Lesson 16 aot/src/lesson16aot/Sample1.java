package lesson16aot;


import static java.lang.System.*;

import java.util.ArrayList;

public class Sample1 {

	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		ArrayList<Integer> points = new ArrayList<Integer>();
		
		points.add(10);
		points.add(80);
		points.add(75);
		
		for(int i=0;i<points.size();i++)
		{
//			out.println(i);
			out.println(points.get(i));
		}

	}

}
