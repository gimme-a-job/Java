package lesson16aot;

import static java.lang.System.*;

import java.util.ArrayList;

public class Sample1Upd1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Sample1の"main"メソッドを実行
		out.println("「Sample1の\"main\"メソッドを実行」");
		Sample1.main(args);
		
		out.println();
		
		//続いてSample1Updの"main"メソッドを実行
		out.println("「続いてSample1Updの\"main\"メソッドを実行」");
		
		ArrayList<Integer> points = new ArrayList<Integer>();
		
		points.add(10);
		points.add(80);
		points.add(75);
		
		for(int i:points)
		{
			out.println(i);
//			out.println(points.get(i));
			
		}
		
	}

}
