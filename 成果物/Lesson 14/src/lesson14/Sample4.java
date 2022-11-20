package lesson14;

import static java.lang.System.*;

public class Sample4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try
		{
		int[] test = new int[5];
		out.println("test[10]に値を代入します。");
		
		test[10] = 80;
		out.println("test[10]に80を代入しました。");
		
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			out.println("配列の要素をこえています。");
			out.println(e + "という例外が発生しました。");
			
		}
		finally
		{
			out.println("最後に必ずこの処理をします。");
		}
		
		out.println("無事終了しました。");


	}

}
