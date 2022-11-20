package lesson9;

import static java.lang.System.*;

import java.util.Arrays;

public class Lesson9C3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] arrays = new int[100];
		
		final int consti = 0;
		int i = consti;
		final int constj = 0;
		int j = constj;
		
		out.println("ソート前");
		
		for(int a :arrays)
		{
			arrays[i] = (int) Math.floor(Math.random() * 998.99999) + 1;
			out.print(arrays[i] + "\t");
			
			if( (j+1)%10 == 0)
			{
				out.println();
			}
			
			i++;
			j++;
		}
		
		i = consti;
		j = constj;
		
		out.println("昇順ソート後");
		
		Arrays.sort(arrays);
		for(int b :arrays)
		{
			out.print(arrays[i] + "\t");
			
			if( (j+1)%10 == 0)
			{
				out.println();
			}
			
			i++;
			j++;
		}
		
		
		//"https://www.javadrive.jp/start/array/index14.html"より
		out.println("降順ソート後");
		
		for (i = 0, j = arrays.length - 1; i < j; i++, j--)
		{
			  int tempnm = arrays[i];
			  arrays[i]  = arrays[j];
			  arrays[j] = tempnm;
			  
		}
		
		i = consti;
		j = constj;
		
		for(int c :arrays)
		{
			out.print(arrays[i] + "\t");
			
			if( (j+1)%10 == 0)
			{
				out.println();
			}
			
			i++;
			j++;
		}

	}

}
