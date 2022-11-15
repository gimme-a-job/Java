package lesson14;

import static java.lang.System.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lesson14D1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		 // CSVに書き込む内容を記述
		readInput input = new readInput();
		
		out.println("ファイル名を入力してください");
		
		String filename = input.readInputStr();
		
		out.println("テスト結果を入力する人数を入力してください。");
		
		int count = input.readInputInt();
		
		String[] names = new String[count];
		
		int[][] scores = new int[count][2];
		
		for(int i=0; i<count; i++)
		{
			
			out.println((i+1) + "人目の名前を入力してください。");
			names[i] = input.readInputStr();
			
			out.println((i+1) + "人目の英語の点数を入力してください。");
			scores[i][0] = input.readInputInt();
			out.println((i+1) + "人目の数学の点数を入力してください。");
			scores[i][1] = input.readInputInt();
		}
		
		 // exportCsvクラスに渡す
        exportCsv(filename, names, scores);
		
	}
	
	
	public static void exportCsv(String filename,String[] names, int[][] score) //"https://style.potepan.com/articles/27434.html"より
	{
        try {
            // 出力ファイルの作成
            FileWriter fw = new FileWriter((filename + ".csv"), false);
            // PrintWriterクラスのオブジェクトを生成
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
 
            // ヘッダーの指定
            pw.print("名前");
            pw.print(",");
            pw.print("英語");
            pw.print(",");
            pw.print("数学");
            pw.println();
 
            // データを書き込む
            for(int i = 0; i < names.length; i++){
                pw.print(names[i]);
                pw.print(",");
                pw.print(score[i][0]);
                pw.print(",");
                pw.print(score[i][1]);
                pw.println();
            }
 
            // ファイルを閉じる
            pw.close();
 
            // 出力確認用のメッセージ
            System.out.println("csvファイルを出力しました");
 
        // 出力に失敗したときの処理
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
	
	

}
