package lesson6;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample11 {

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
out.println("何番目の処理を飛ばしますか？");

BufferedReader br = 
new BufferedReader(new InputStreamReader(System.in));

String str = br.readLine();
int res = Integer.parseInt(str);

for(int i=1; i<=10; i++)
{
	if(i == res)
		continue;
	out.println(i + "番目の処理です。");
}
	}

}
