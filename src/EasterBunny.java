import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class EasterBunny {
	static Scanner keyboard = new Scanner(System.in);
	static String MAGIC_WORD = "castle";

	public void victory() {
		out.println("Congratulations, you win! I will now reveal the location of the chocolate bunnies!");
		out.println("They are in mom and dad's closet. I hope they didn't find them first!");
	}

	public void printRandomString() {
		final String[] bunnyRejections = { "That's a solid nope!", "Keep guessing!", "Don't give up!",
				"You call that a magic word?", "Puh-leez!", "I don't have time for this!", "Ha! As if!", "Nice try!",
				"Where did you learn magic words?", "How long is this going to take?", "I grow weary of this...",
				"Haha, get wrecked!" };
		Random random = new Random();
		int index = random.nextInt(bunnyRejections.length);
		System.out.println(bunnyRejections[index]);
	}

	public void printRandomScold() {
		final String[] scoldings = { "Don't you talk that way!", "How dare you?!", "Such disrespect!",
				"Hey, I'm telling your mom!", "Not nice! Not nice!", "Alright, I'm taking away screen time!",
				"Watch your mouth!" };
		Random random = new Random();
		int index = random.nextInt(scoldings.length);
		System.out.println(scoldings[index]);
	}

	public void printHint() {
		final String[] hint = { "Starts with letter ((3/4 * 12) divided by 3) of the alphabet", "Motte and Bailey",
				"noun", "___ made of sand melts into the sea, eventually", "two syllables" };
		Random random = new Random();
		int index = random.nextInt(hint.length);
		System.out.println(hint[index]);
	}

	public void run() {
		out.println("Hi guys, sorry I missed you. I guess you were sleeping when I arrived early this morning!");
		out.println("If you say the magic word, I will tell you the location of the chocolate bunnies.");
		String magicWordGuess = null;
		do {
			magicWordGuess = keyboard.nextLine();
			boolean badLanguage = false;
			if (magicWordGuess.equals("stupid") || magicWordGuess.equals("dumb") || magicWordGuess.equals("hate")
					|| magicWordGuess.equals("idiot") || magicWordGuess.equals("die") || magicWordGuess.equals("poop")
					|| magicWordGuess.equals("fart") || magicWordGuess.equals("butt")) {
				badLanguage = true;
				printRandomScold();
			}
			boolean niceLanguage = false;
			if (magicWordGuess.equals("chocolate") || magicWordGuess.equals("scrabble")
					|| magicWordGuess.equals("computer") || magicWordGuess.equals("bunny")
					|| magicWordGuess.equalsIgnoreCase("autumn") || magicWordGuess.equalsIgnoreCase("alex")
					|| magicWordGuess.equalsIgnoreCase("william") || magicWordGuess.equalsIgnoreCase("mommy")
					|| magicWordGuess.equalsIgnoreCase("daddy")) {
				niceLanguage = true;
				out.println("Love it! But not the magic word.");
			}
			if (magicWordGuess.equals("hint")) {
				printHint();
			} else if ((!magicWordGuess.equals(MAGIC_WORD)) && (!badLanguage) && (!niceLanguage)) {
				printRandomString();
			}
		} while (!magicWordGuess.equals(MAGIC_WORD));
		victory();
	}

	public static void main(String[] args) {
		EasterBunny eb = new EasterBunny();
		eb.run();
	}

}
