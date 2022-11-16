package lesson9;

public class Lesson9E {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Circle circle = new Circle(); //"Circle"型の"circle"変数を定義し、オブジェクトを生成
		
		Cylinder cylinder = new Cylinder(); //"Cylinder"型の"cylinder"変数を定義し、オブジェクトを生成
		
		circle.setRadius(); //メッセージを表示して、半径の入力を促し、入力した半径をフィールド変数に格納するメソッド
		
		circle.showResult(); //（半径が入力されてる前提で）円周と面積を計算して、解答メッセージを表示する。
		
//		boolean tempbl = circle.AskWhether2ContinueOrNot();
		circle.AskWhether2ContinueOrNot(); //"0"か"1"の入力を促す、それによって"circle"のフィールド変数"flg"が"true"か"false"になる
		
//		if(tempbl == true)
		if(circle.getFlg() == true) //上で聞いた結果"0"が返ってきてゐて、フィールド変数"flg"が"true"になってゐたら
		{
			//何もしない、このまま下に進む
		}
//		else if(tempbl == false)
		else if(circle.getFlg() == false) //↑↑で聞いた結果"1"が返ってきており、フィールド変数"flg"が"false"となってゐたら
		{
			System.exit(0); //処理終了！下の処理も完全シカト！
		}
		
		cylinder.setResult(circle.getRadius()); //まず"高さ"を入力させ、上で出た"半径"も使い、"表面積"、"体積"を計算してフィールド変数に代入、その後解答メッセージを表示

	}

}
