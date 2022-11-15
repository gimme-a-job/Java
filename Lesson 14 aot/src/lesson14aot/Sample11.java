package lesson14aot;

import static java.lang.System.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample11 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test.csv")));
		
		pw.print("名前");
		pw.print(",");
		pw.print("英語");
		pw.print(",");
		pw.print("数学");
		pw.println();
		
		pw.print("ポリテク太郎");
		pw.print(",");
		pw.print("80");
		pw.print(",");
		pw.print("90");
		pw.println();

		pw.print("ポリテク次郎");
		pw.print(",");
		pw.print("85");
		pw.print(",");
		pw.print("95");
		pw.println();
		
		
		out.println("ファイルが作成されました。");
		pw.close();


	}

}
