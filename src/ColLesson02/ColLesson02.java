package ColLesson02;

import java.util.Scanner;

public class ColLesson02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Word[] words = new Word[10];
		System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();


		int index = 0;

		while (!input.equals("e")) {
			String[] tmp = new String[2];
			tmp = input.split(" ");
			Word word1 = new Word(tmp[0],tmp[1]);

			words[index] = word1;
			index++;
			System.out.println("次の単語 を入力して下さい。\"e\"で終 了します。");
			input = sc.nextLine();
		}
		System.out.println("プログラムを終了します。");

		for (int i= 0; i< index; i++) {
			System.out.println( words[i]);
		};
		System.out.println( index+"件,登録しました。");
	}
}