package lesson15aot;

import static java.lang.System.*;


//練習問題②
//フォルダ名が入っている変数folderと、ファイル名が入っている変数fileがあります。
//fileは必ず「readme.txt」のような形式をしていますが、folderは末尾に\記号がついている場合とついていない場合の両方がありえます。たとえば「c:\javadev」や「c:\\user\」のどちらもfolderの値として考えられます。
//　Folderとfileを連結して、「c:\javadev\ readme.txt」のような完全なファイル名としての文字列を完成させるメソッドを作成してください。



public class SampleP2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		String folder;
		folder = "c:" + "\\" + "javadev";
		folder = "c:" + "\\" + "user" + "\\";
		
		String file;
		file = "readme.txt";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(folder);
		
		if(folder.endsWith("\\"))
		{
			//何もしない
		}
		else
		{
			sb.append("\\");
		}
		
		sb.append(file);
		
		String path = sb.toString();
		
		out.println(path);

	}

}
