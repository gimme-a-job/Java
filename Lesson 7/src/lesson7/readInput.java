package lesson7;

import static java.lang.System.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class readInput

{

	Scanner sc = new Scanner(System.in);
	
	int inputint;
//	int tempint;

	@SuppressWarnings("null")
	public void setInputInt() {
						
//		boolean tmpflg = false;
		
		try {
			out.println("数字を入力してください"); //検証用
//			tempint = sc.nextInt();
			this.inputint = sc.nextInt();
		}
//		catch (Exception e)
		catch (InputMismatchException e)
		{
			out.println(e); //検証用
			out.println("数値以外が入力された可能性があります。");
			out.println("もう一度入力してください");
//			tempint = (Integer) null;
			sc.next(); //"https://qiita.com/hiroki2525/items/00398e3b6921952faa8c"より
			setInputInt();
//			tmpflg = true;
		}

		
//		if(tmpflg == false)
//		{
//			this.inputint = tempint;
//		}
//		else if (tmpflg == true)
//		{
//			tempint = 0;
//			setInputInt();
//		}
		

	}
	
	public int getInputInt()
	{
		return this.inputint;
	}
	
	public int readInputInt()
	{
		setInputInt();
		return getInputInt();
	}

}