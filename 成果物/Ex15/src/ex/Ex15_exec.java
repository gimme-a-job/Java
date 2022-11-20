//前提条件 下記Classは全て指定されたパッケージで作成する事。 
//入力が発生する場合、いかなる場合でも予期し ない例外（スタックトレースなど）が出ないように例外処理を行うこと。 
//インデックスは０から始める事。例 ： ”０、１、２”で 個数３個 。
// 内部のデータはStringの配列で保持すること。
// この章では、「クラスを作る。それを使う。」を実践します。
// 継承なども使用します。 
//【概念図】 Ex 文字列動的配列クラスを作ろう！
// Ex15のClassは exパッケージとして作成する事。


package ex;

import static java.lang.System.*;

public class Ex15_exec extends Ex15_StrArray// 実行サンプルクラス

{
	
	public static void main(String[] args) {
	
	 // 以下の処理をEx15_StrArrayを使用して実行
	
	//Ex15_exec.java "aaa" を追加 "bbb" を追加 "ccc" を追加 "dd" を追加
	add("aaa");
	add("bbb");
	add("ccc");
	add("dd");

	
	//４個の要素を取得して表示
	final int consti = 0;
	int i = consti;
	
	for(String l : items)
	{
		out.println(get(i));
		i++;
	}
	
	i = consti;
	
	//すべてクリア "ee001"～"ee100" の100個追加
	clear();
	
	for(i=0; i<100; i++)
	{
		add(String.format("ee%1$03d", (i+1))); //"https://syunpon-java.com/programing/java/sample/numberformat.shtml#sample2_1"より
	}
	
	//76番目の要素を取得して表示
	int gettemp1 = 76;
//	out.println(get(76-1));
	out.println(get(gettemp1-1));
	
	//先頭(1番目)の要素を"a001"に上書き
	int settemp1 = 1;
//	set((1-1), String.format("a%1$03d", 1));
	set((settemp1-1), String.format("a%1$03d", settemp1));
	
	//最後(100番目)の要素を"z100"に上書き
	int settemp2 = 100;
//	set((100-1), String.format("z%1$03d", 100));
	set((settemp2-1), String.format("z%1$03d", settemp2));
	
	//先頭(1番目)の要素を取得して表示
	//out.println(get((1-1)));
	out.println(get((settemp1-1)));
	
	//最後(100番目)の要素を取得して表示
//	out.println(get((100-1)));
	out.println(get((settemp2-1)));
	
	
	}


}
