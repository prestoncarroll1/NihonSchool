package backend;

import java.util.Random;

public class hiragana {

	public static char[] hiraganaCharacters = { 'あ', 'い', 'う', 'え', 'お', 'か', 'き', 'く', 'け', 'こ', 'さ', 'し', 'す', 'せ',
			'そ', 'た', 'ち', 'つ', 'て', 'と', 'な', 'に', 'ぬ', 'ね', 'の', 'は', 'ひ', 'ふ', 'へ', 'ほ', 'ま', 'み', 'む', 'め', 'も',
			'や', 'ゆ', 'よ', 'ら', 'り', 'る', 'れ', 'ろ', 'わ', 'を', 'ん' };

	public static char getAllHiraganaChars() {

		for (char hiraganaChar : hiraganaCharacters) {
			System.out.println(hiraganaChar);
		}
		return 0;
	};

	public static char getRandomHiraganaChar() {

		// Create a Random object
		Random random = new Random();

		// Generate a random index within the array's bounds
		int randomIndex = random.nextInt(hiraganaCharacters.length);

		// Retrieve the random character from the array
		char randomChar = hiraganaCharacters[randomIndex];
		System.out.println(randomChar);
		return randomChar;
	};
}
