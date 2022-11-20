package lesson4;

import static java.lang.System.*;
		
public class Sample9 {
public static void main(String[] args)
{
	double dnum = 160.5;
	
	out.println("身長は" + dnum + "センチです。");
	
	out.println("int型の変数に代入します。");
//	int inum = dnum;
	int inum = (int)dnum;
	
	out.println("身長は" + inum + "センチです。");
}
}
