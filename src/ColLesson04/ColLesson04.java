package ColLesson04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColLesson04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		List<Word> words = new ArrayList<>();

		System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();
		int index = 0;
	try{
		while (!input.equals("e")) {
			String[] tmp = new String[2];
			tmp = input.split(" ");
			Word word1 = new Word(tmp[0],tmp[1]);
			words.add(word1);
			index++;
			System.out.println("次の単語 を入力して下さい。\"e\"で終 了します。");
			input = sc.nextLine();
		}
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
	}

		for (Word word1 : words) {
			System.out.println( word1);
		}
		System.out.println( index+"件,登録しました。");
	}
}