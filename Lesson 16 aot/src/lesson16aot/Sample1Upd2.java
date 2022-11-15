package lesson16aot;

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample1Upd2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Sample1,Sample1Upd1の"main"メソッドを実行
		Sample1Upd1.main(args);
		
		out.println();

		//続いてSample1Upd2の"main"メソッドを実行
		out.println("続いてSample1Upd2の\"main\"メソッドを実行");

		ArrayList<Integer> points = new ArrayList<Integer>();

		points.add(10);
		points.add(80);
		points.add(75);
		
		Iterator<Integer> it = points.iterator();
		
		while(it.hasNext())
		{
			int i = it.next();
			out.println(i);
		}

	}

}
