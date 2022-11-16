package lesson6;

//いろいろめんどいので
import static java.lang.System.*;

public class SampleP4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//変数jの宣言
		int j = 1;
		
		for(int i=1; i<=5; i++) //p149
		{
			
			j=1; //変数jの初期化
			
			do
			{
			out.print("*");
			j++;
			}while(j <= i);
			
			out.println();
		}
		
	}

}
