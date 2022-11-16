package lesson9;

import static java.lang.System.*;

import java.util.Scanner;

public class Lesson9C2__ extends Point //今のところ"Point"クラスを拡張してる意味無し
{

	//	int constvalslength = getConstValsLength(); //"static"がどうとかうるせぇ

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//聞く
		out.println("貴様は何回トライするのかの？");

		//おまじない
		Scanner sc = new Scanner(System.in);

		//試行回数を格納する関数の宣言、および格納
		int counts = sc.nextInt();

		//定数というか答えというかの"ConstVals"を利用するため、オブジェクトを生成
		final ConstValSet constvalset = new ConstValSet();

		final int constvalsetlength = constvalset.getConstValSetLength();

		//"marks"配列を宣言
		Mark[] marks = new Mark[counts];

		//"points"配列を宣言
		Point[][] points = new Point[counts][constvalsetlength];

		//"繰り返し処理用変数を宣言
		final int constm = 0;
		int m = constm;
		final int consti = 0;
		int i = consti;
		final int constj = 0;
		int j = constj;
		final int constk = 0;
		int k = constj;

		//多次元配列に入力値を格納してゐく処理
		for (Mark v : marks) {

			marks[m] = new Mark(); //ここでやらなくても良いか？

			for (Point[] w : points) {
				j = constj; //ネストされた繰り返し処理が2回目以降も上手くいく様に初期化

				for (Point h : w) {
					out.println((i+1) + "回目の" + (j+1) + "個目の値を入力せぃ");
					points[i][j] = new Point(); //多次元配列"points"に対して"Point"型のインスタンスを生成
					points[i][j].setVal(sc.nextInt()); //多次元配列"points"の"val"に入力値を格納

					if (points[i][j].getVal() == constvalset.getConstValSet(j)) //入力値（正確には格納された値）と答えが位置も値も同じなら
					{
						points[i][j].setPoint(constvalset.exactmatchpoint);
						//						marks[i].addPoint2Mark(constvalset.exactmatchpoint); //後で集計したくないならここでやる。
					}

					j++;
				}
				
				i++;
			}

//			i++; //"i"をインクリメント⇒この位置だと上手くいかない？
			m++;
		}

		//↑で使った繰り返し処理用変数の初期化
		m = constm;
		i = consti; //↑で使ってるので取り敢えず初期化
		j = constj; //同上

		//上で完全一致は見てるので、位置違いで値のみ当ててるとこに点をつけてやる処理

		for (Mark o : marks) //|１|"marks"配列の個数分（つまり"m"回）繰り返し処理をする
		{

			//			if(marks[m].getFlg() == false) //要らねぇ？まぁそうだけど処理の順番変えるかもしれねぇじゃん？⇒現時点でムリ！
			//			{
			for (Point[] p : points) //|２|"points"配列の個数分（つまり"i"回）繰り返し処理をする
			{
				j = constj; //ネストされた繰り返し処理が2回目以降も上手くいく様に初期化

				for (Point q : p) //|３|"points[i]"配列の個数分（つまり"j"回）繰り返し処理をする 
				{
					k = constk;//ネストされた繰り返し処理が2回目以降も上手くいく様に初期化

					if (points[i][j].getFlg() == false) //|４|フラグが立ってれば（つまり↑で完全一致なってたら）採点せずスルー
						{

//						for (Point r : p) //|５|答えの個数分"k"回繰り返し処理（厳密には"points[i]"配列の個数分（つまり"j"回）繰り返し処理をしてゐる） 
						for (k = constk; k < constvalsetlength; k++)
						{

							if (points[i][j].getVal() == constvalset.getConstValSet(k)) //|６|入力値（正確には格納された値）と答えが位置も値も同じなら点つけちゃる
							{
								points[i][j].setPoint(constvalset.valmatchpoint);
								//							marks[m].addPoint2Mark(constvalset.valmatchpoint); //後で集計処理をしたくないならここでやる
								k = constvalsetlength - 1; //点数ついたならもう"k"回の繰り返しに用は無いので
							} //|６|半分正解なら加点のif文おわり
														
//							k++; //拡張for文やめたので

						} //|５|答えの個数分の"k"回の繰り返し処理終わり

					} //|４|if文終わり

					j++;

				} //|３|"j"個目の"points[i]"配列についての処理終わり

				i++;
				
			} //|２|"i"個目の"points"配列についての処理終わり

			m++; //"m"個目の"marks"配列についての処理が終わりなのでインクリメント

		} //|１|"m"個目の"marks"配列についての処理終わり

		//↑で使った繰り返し処理用変数の初期化
		m = constm;
				i = consti; //↑で使ってるので取り敢えず初期化
				j = constj; //同上
				k = constk;
				
		
		//点数の集計をして表示する処理(↑で既に加点してるとおかしくなるので注意）

				for (Mark s : marks) //|１|"marks"配列の個数分（つまり"i"回）繰り返し処理をする
				{
					
					j = constj; //ネストされた繰り返し処理が2回目以降も上手くいく様に初期化
					
					for (Point[] t : points) //|２|"points"配列の個数分（つまり"i"回）繰り返し処理をする
					{
						
						for (Point u : t) //|３|"points[i]"配列の個数分（つまり"j"回）繰り返し処理をする 
						{

							marks[m].addPoint2Mark(points[i][j].getPoint()); //点数をひたすら合計に加算してゐく
														
							j++; //拡張for文なのでインクリメント	
							
						} //|３|"j"個目の"points[i]"配列についての処理終わり
						
						i++; //"i"個目の"points"配列についての処理が終わりなのでインクリメント
						
					} //|２|"i"個目の"points"配列についての処理終わり
					
					out.println((m+1) + "回目の点数は" + marks[m].getMark() + "点です。");
					
					m++; //"m"個目の"marks"配列についての処理が終わりなのでインクリメント
					
				} //|１|"m"個目の"marks"配列についての処理終わり
				
				//↑で使った繰り返し処理用変数の初期化
				m = constm;
						i = consti; //↑で使ってるので取り敢えず初期化
						j = constj; //同上
				
		//おまじない
		sc.close();
	}

	//	public int getConstValsLength()  //"static"がどうとかうるせぇ
	//	{
	//		return super.getConstValsLength();
	//	}
	//	

}
