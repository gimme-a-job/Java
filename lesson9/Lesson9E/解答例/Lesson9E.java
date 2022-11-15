package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lesson9E {

	public static void main(String[] args) throws IOException {

		int radius;
		int height;
		double circumference;
		double circleArea;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Circle circle = new Circle();
		Cylinder cylinder = new Cylinder();

		System.out.println("半径を入力してください。");
		String str1 = br.readLine();
		radius = Integer.parseInt(str1);
		circle.setRadius(radius);

		System.out.println("");

		System.out.println("半径" + radius + "の円の円周と面積を計算します。\n");

		circumference = circle.calCircumference();
		System.out.println("円周は" + circumference + "です。");

		circleArea = circle.calCircleArea();
		System.out.println("円の面積は" + circleArea + "です。");

		System.out.println("\n計算を続ける場合は「0」を、処理を終了する場合は「1」を入力してください。");
		String str2 = br.readLine();
		int num = Integer.parseInt(str2);

		if ( num == 1 ) {

			System.out.println("処理を終了します。");
			return;

		}

		System.out.println("高さを入力してください。");
		String str3 = br.readLine();
		height = Integer.parseInt(str3);
		cylinder.setInfo(radius, height, circumference, circleArea);

		System.out.println("底面の半径" + radius + "、高さ" + height + "の円柱の表面積と体積を計算します。\n");

		double calSurfaceArea = cylinder.calSurfaceArea();
		System.out.println("表面積は" + calSurfaceArea + "です。");

		double volume = cylinder.calVolume();
		System.out.println("体積は" + volume + "です。");

	}

}
