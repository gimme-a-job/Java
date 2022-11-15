package lesson16aot;

public class Hero {
	private String name;

	public Hero() //Sample7との互換性のため
	{
		
	}

	
	public Hero(String name) {
//		this.name = name;
		setName(name);
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) //Sample7との互換性のため
	{
		this.name = name;
	}
}

//2人の勇者(ポリテク太郎、ポリテク次郎)をHeroとしてインスタンス化してArrayListに格納し、1人ずつ順番に取り出して名前を表示するプログラムを作成してください。
