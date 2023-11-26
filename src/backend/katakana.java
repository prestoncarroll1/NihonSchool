package backend;

import java.util.Random;

public class katakana {
	// Define the array containing Katakana characters
	public static char[] katakanaCharacters = { 'ア', 'イ', 'ウ', 'エ', 'オ', 'カ', 'キ', 'ク', 'ケ', 'コ', 'サ', 'シ', 'ス', 'セ',
			'ソ', 'タ', 'チ', 'ツ', 'テ', 'ト', 'ナ', 'ニ', 'ヌ', 'ネ', 'ノ', 'ハ', 'ヒ', 'フ', 'ヘ', 'ホ', 'マ', 'ミ', 'ム', 'メ', 'モ',
			'ヤ', 'ユ', 'ヨ', 'ラ', 'リ', 'ル', 'レ', 'ロ', 'ワ', 'ヲ', 'ン', 'ガ', 'ギ', 'グ', 'ゲ', 'ゴ', 'ザ', 'ジ', 'ズ', 'ゼ', 'ゾ',
			'ダ', 'ヂ', 'ヅ', 'デ', 'ド', 'バ', 'ビ', 'ブ', 'ベ', 'ボ', 'パ', 'ピ', 'プ', 'ペ', 'ポ',
//	            'キャ', 'キュ', 'キョ',
//	            'シャ', 'シュ', 'ショ',
//	            'チャ', 'チュ', 'チョ',
//	            'ニャ', 'ニュ', 'ニョ',
//	            'ヒャ', 'ヒュ', 'ヒョ',
//	            'ミャ', 'ミュ', 'ミョ',
//	            'リャ', 'リュ', 'リョ',
//	            'ギャ', 'ギュ', 'ギョ',
//	            'ジャ', 'ジュ', 'ジョ',
//	            'ビャ', 'ビュ', 'ビョ',
//	            'ピャ', 'ピュ', 'ピョ'
	};

	public static char getAllKatakanaChars() {

		for (char katakanaChar : katakanaCharacters) {
			System.out.println(katakanaChar);
		}
		return 0;
	};

	public static char getRandomHiraganaChar() {

		// Create a Random object
		Random random = new Random();

		// Generate a random index within the array's bounds
		int randomIndex = random.nextInt(katakanaCharacters.length);

		// Retrieve the random character from the array
		char randomChar = katakanaCharacters[randomIndex];
		System.out.println(randomChar);
		return randomChar;
	};
}
