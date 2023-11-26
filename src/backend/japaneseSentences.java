package backend;

import java.util.Random;
import java.util.Scanner;

public class japaneseSentences {

	public static String[] japaneseSentencesLvl1 = { 
			"えきはどこですか",
			"こんにちは お元気ですか",
			"コンビニはどこですか",
			"ゼロ 一 二 三", "よん ご ろく",
			"なな はち きゅう じゅう "
			};

	public static String[] englishTranslatedLvl1 = { "where is the station?", "hello how are you?",
			"where is the convenience store?", "zero one two three", "four five six", "seven eight nine ten" };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			int randomIndex = random.nextInt(japaneseSentencesLvl1.length);

			String randomString = japaneseSentencesLvl1[randomIndex];
			String englishTranslatedString = englishTranslatedLvl1[randomIndex];

			System.out.println("What does this say?");
			System.out.println(randomString);

			System.out.print("Answer: ");
			String userAnswer = scanner.nextLine();

			if (userAnswer.equals(englishTranslatedString)) {
				System.out.println("Good job!!");

				// Continue to the next iteration of the loop
				continue;
			} else {
				System.out.println("Try again.");
			}

			System.out.print("Do you want to continue? (yes/no): ");
			String continueOption = scanner.nextLine();

			if (!continueOption.equalsIgnoreCase("yes")) {
				break; // Exit the loop if the user doesn't want to continue
			}
		}

		scanner.close();
	}
}
