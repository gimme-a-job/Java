package lesson10;

import static java.lang.System.*;

import java.util.Scanner;

public class Replace 
{
	private String inputstr;
	private String replacedstr;
	final private String targetstr = "abc";
//	final private String replacer = "***";
	final private String replacer = "*";
//	private List<String> replacers = new ArrayList<String>();
	
	Scanner sc = new Scanner(System.in);
	
	public void setReplacedStr(String inputstr)
	{
		String replacers ="";
		
		for(int i = 0; i < this.targetstr.length(); i++)
		{
			replacers += this.replacer;
		}
			
//		this.replacedstr = inputstr.replace(this.targetstr, this.replacer);
		this.replacedstr = inputstr.replace(this.targetstr, replacers);
	}
	
	public String getInputStr()
	{
		return this.inputstr;
	}
	
	public String getReplacesStr(String inputstr)
	{
		setReplacedStr(inputstr);
		return this.replacedstr;
	}
	
	public String readInputString()
	{
		this.inputstr = sc.next();
		
//		return sc.next();
		return getInputStr();
	}
	
	
	
	public void showReplacedStr()
	{
		out.println("入力せぃ");
		
		String tempinputtsr = readInputString();
		
		out.print("変換前：" + tempinputtsr + "\t" + "変換後" + getReplacesStr(tempinputtsr));
	}

}
