package lesson9;

import static java.lang.System.*;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Lesson9C2 extends Point //今のところ"Point"クラスを拡張してる意味無し
{

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

		//位置違いの場合の処理をするのに"ConstValSet"のフラグも利用してやる必要が出てきたため。
		ConstValSet[] constvalsets = new ConstValSet[counts];

		//設定値の重複処理をするのに使用
		Duplicate[] duplicates = new Duplicate[counts];

		//"marks"配列を宣言
		Mark[] marks = new Mark[counts];

		//"points"配列を宣言
		Point[][] points = new Point[counts][constvalsetlength];

		//"繰り返し処理用変数を宣言
		final int consti = 0;
		int i = consti;
		final int constj = 0;
		int j = constj;
		final int constk = 0;
		int k = constj;

		//------------------------------------------------------------------------------------------------------

		//"constvalsets"を"ConstValSet"型のインスタンスを生成して,"false"で初期化してゐく
		for (ConstValSet c : constvalsets) {
			constvalsets[i] = new ConstValSet();

			j = constj; //ネストされた繰り返し処理が2回目以降も上手くいく様に初期化...するつもりだったが拡張for文やめたので意味なし

			for (j = 0; j < constvalsetlength; j++) //念のためフラグを"false"で初期化するのを繰り返してゐる
			{
				constvalsets[i].setFlg(j, false); //要らないか？
			}

			i++; //インクリメント
		}

		//↑で使った繰り返し処理用変数の初期化
		i = consti;
		j = constj;

		//------------------------------------------------------------------------------------------------------

		//"duplicates"を"Duplicate"型のインスタンスを生成してゐく
				for (Duplicate d : duplicates) {
					duplicates[i] = new Duplicate();

					
					i++; //インクリメント
				}
		
		
				//↑で使った繰り返し処理用変数の初期化
				i = consti;
				j = constj;
				
		//------------------------------------------------------------------------------------------------------
		
		//先に"marks"配列に"Mark"型のインスタンスを生成してゐく処理をしてみた
		for (Mark v : marks) {

			marks[i] = new Mark(); //ここでやらなくても良いか？

			i++;
		}

		//↑で使った繰り返し処理用変数の初期化
		i = consti;

		//------------------------------------------------------------------------------------------------------

		//多次元配列に入力値を格納してゐく処理

		for (Point[] h : points) {
			j = constj; //ネストされた繰り返し処理が2回目以降も上手くいく様に初期化

			for (Point o : h) {
				out.print((i + 1) + "回目の" + (j + 1) + "個目の値を入力せぃ　");
				points[i][j] = new Point(); //多次元配列"points"に対して"Point"型のインスタンスを生成
				points[i][j].setVal(sc.nextInt()); //多次元配列"points"の"val"に入力値を格納

				if (points[i][j].getVal() == constvalset.getConstValSet(j)) //入力値（正確には格納された値）と答えが位置も値も同じなら
				{
					points[i][j].setPoint(constvalset.getExactMatchPoint());
					//marks[i].addPoint2Mark(constvalset.getExactMatchPoint()); //後で集計したくないならここでやる。
					constvalsets[i].setFlg(j, true); //正解の方に発見済みフラグを立てる,設定値の重複排除処理ありきなら要らんかも
					duplicates[i].add2Duplicates(constvalset.getExactMatchPoint());
					
					out.println((i + 1) + "回目の" + (j + 1) + "個目に" + constvalset.exactmatchpoint + "点追加！"); //検証用
				}

				j++;
			}

			i++;
		}

		//↑で使った繰り返し処理用変数の初期化
		i = consti; //↑で使ってるので取り敢えず初期化
		j = constj; //同上

		//------------------------------------------------------------------------------------------------------

//		//設定値が重複してる場合はその位置のフラグをtrueに書き換える処理を入れてやれば良いと思った。⇒寝る前にやっつけで作成、詰めてないしデバッグもしてない⇒眠いからやりたいことコメントだけして寝る
//		
//		//・設定値の重複削除
		// LinkedHashSetオブジェクトを用意
	    Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(); //"https://techacademy.jp/magazine/22218"より
//		//・"constvalsets"配列にインスタンス生成し直す
//		//・"constvalsets"配列のフィールド"flgs"のフラグが"true"だったら、"duplicates"配列のフィールド"duplicates"に格納されてる数字について、"constvalsets"配列のフィールド"flgs"配列の同位置のフラグを"true"に
//		for (ConstValSet c : constvalsets) {
//			constvalsets[i] = new ConstValSet();
//
//			j = constj; //ネストされた繰り返し処理が2回目以降も上手くいく様に初期化...するつもりだったが拡張for文やめたので意味なし
//
//			for (j = 0; j < constvalsetlength; j++) //念のためフラグを"false"で初期化するのを繰り返してゐる
//			{
//				constvalsets[i].setFlg(j, false); //要らないか？
//			}
//
//			i++; //インクリメント
//		}
//		
//		
//		
//		//↑で使った繰り返し処理用変数の初期化
//				i = consti; //↑で使ってるので取り敢えず初期化
//				j = constj; //同上
//				k = constk;

		//------------------------------------------------------------------------------------------------------

		//上で完全一致は見てるので、位置違いで値のみ当ててるとこに点をつけてやる処理

		for (Point[] p : points) //|１|"points"配列の個数分（つまり"i"回）繰り返し処理をする
		{
			j = constj; //ネストされた繰り返し処理が2回目以降も上手くいく様に初期化

			for (Point q : p) //|２|"points[i]"配列の個数分（つまり"j"回）繰り返し処理をする 
			{
				k = constk;//ネストされた繰り返し処理が2回目以降も上手くいく様に初期化

				if (points[i][j].getFlg() == false) //|３|フラグが立ってれば（つまり↑で完全一致なってたら）採点せずスルー
				{

					//						for (Point r : p) //|４|答えの個数分"k"回繰り返し処理（厳密には"points[i]"配列の個数分（つまり"j"回）繰り返し処理をしてゐる） 
					for (k = constk; k < constvalsetlength; k++) {

						if (constvalsets[i].getFlg(k) == false) //|５|
						{

							if (points[i][j].getVal() == constvalset.getConstValSet(k)) //|６|入力値（正確には格納された値）と答えが位置も値も同じなら点つけちゃる
							{
								points[i][j].setPoint(constvalset.getValMatchPoint());
								//marks[i].addPoint2Mark(constvalset.getValMatchPoint()); //後で集計処理をしたくないならここでやる
								constvalsets[i].setFlg(k, true); //正解の方に発見済みフラグを立てる

								out.println((i + 1) + "回目の" + (j + 1) + "個目に" + constvalset.valmatchpoint + "点追加！"); //検証用

								k = constvalsetlength - 1; //点数ついたならもう"k"回の繰り返しに用は無いので
							} //|６|半分正解なら加点のif文おわり

						} //|５|

						//k++; //拡張for文やめたので

					} //|４|答えの個数分の"k"回の繰り返し処理終わり

				} //|３|if文終わり

				j++;

			} //|２|"j"個目の"points[i]"配列についての処理終わり

			i++;

		} //|１|"i"個目の"points"配列についての処理終わり

		//↑で使った繰り返し処理用変数の初期化
		i = consti; //↑で使ってるので取り敢えず初期化
		j = constj; //同上
		k = constk;

		//------------------------------------------------------------------------------------------------------

		//点数の集計する処理(↑で既に加点してるとおかしくなるので注意）

		for (Point[] t : points) //|１|"points"配列の個数分（つまり"i"回）繰り返し処理をする
		{

			j = constj; //ネストされた繰り返し処理が2回目以降も上手くいく様に初期化

			for (Point u : t) //|２|"points[i]"配列の個数分（つまり"j"回）繰り返し処理をする 
			{

				marks[i].addPoint2Mark(points[i][j].getPoint()); //点数をひたすら合計に加算してゐく

				j++; //拡張for文なのでインクリメント	

			} //|２|"j"個目の"points[i]"配列についての処理終わり

			out.println((i + 1) + "回目の点数は" + marks[i].getMark() + "点です。"); //繰り返し点数を表示

			i++; //"i"個目の"points"配列についての処理が終わりなのでインクリメント

		} //|１|"i"個目の"points"配列についての処理終わり

		//------------------------------------------------------------------------------------------------------

		//↑で使った繰り返し処理用変数の初期化
		i = consti; //↑で使ってるので取り敢えず初期化
		j = constj; //同上

		//おまじない
		sc.close();
	}

}
