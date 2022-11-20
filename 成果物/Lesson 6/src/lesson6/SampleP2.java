package lesson6;

//いろいろめんどいので
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; //"https://www.sejuku.net/blog/13974"より

public class SampleP2 {

	public static void main(String[] args)throws IOException
	{
		out.println("テストの点数を入力してください。（0で終了）");

//おまじない
BufferedReader br =
new BufferedReader(new InputStreamReader(System.in));

//点数の可変長配列を宣言
ArrayList<Integer> score = new ArrayList<>(); //"https://www.sejuku.net/blog/13974"より

//繰り返し終了の判定のための変数を宣言、良い変数名が思いつかず
int temp = 0;

//0押されるまでscore配列に格納してく処理、ハマりながらも完成したがこれで良いのか
do
{
	temp = Integer.parseInt(br.readLine());
	score.add(temp);

}
while(temp != 0); //本当はdo until文を使いたかったが

//合計点数を格納する変数を宣言
int sum = 0;

//score配列の要素分、点数を足して処理
//for(int i=0; i<=score.size()-1;i++) //for文
for(int test:score) //拡張for文
{
//	sum += score.get(i); //for文
	sum += test; //拡張for文
}

//合計点数を表示
out.println("テストの合計点は" + sum + "点です。");




	}

}
