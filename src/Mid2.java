import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Mid2 {

	public static void main(String[] args) throws FileNotFoundException {

		// File f = new File("C:\\Users\\chloe\\Documents\\wordle\\perfectPairs.txt");
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\perfectPairs.txt");
		String words[] = new String[10041166];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 10041166; i++) {
			words[i] = scan.next();
		}
		System.out.println("pairs stored");
		File wordsFL = new File("C:\\Users\\chloe\\Documents\\wordle\\shorterList.txt");
		String[] wordsL = new String[8322];
		Scanner scanL = new Scanner(wordsFL);
		for (int i = 0; i < 8322; i++) {
			wordsL[i] = scanL.next();
		}
		System.out.println("list stored");
		PrintStream myPrinter = new PrintStream(new File("C:\\Users\\chloe\\Documents\\wordle\\perfectTriples.txt"));

		for (int i = 0; i < 8322; i++) {
			for (int j = 0; j < 10041166; j++) {
				if (areUnique(wordsL[i], words[j])) myPrinter.println(wordsL[i] + words[j]);
			}
			// System.out.println("grl");
		}

		// System.out.println(areUnique("abcde", "kljoa"));

	}

	public static boolean areUnique(String a, String b) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (a.charAt(i) == b.charAt(j))
					return false;
			}
		}

		return true;

	}

}
