package lesson6;

import static java.lang.System.*;

public class Sample8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
boolean bl = false;
for(int i=0; i<5; i++)
{
	for(int j=0; j<5; j++)
	{
		if(bl == false)
		{
			out.print("*");
			bl = true;
			
		}
		else
		{
			out.print("-");
			bl = false;
			
		}
	}
	out.print("\n");
}
	}

}
