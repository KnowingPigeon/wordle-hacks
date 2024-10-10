import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class MidStrats {
	
	public static void main(String[] args) throws IOException {
		
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\noVowelList.txt");
		String words[] = new String[8322];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 2580; i++) {
			words[i] = scan.next();
		}
		
		File comboSpots = new File("C:\\Users\\chloe\\Documents\\wordle\\gross.txt");
		
		// FileWriter myWriter = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\perfectPairs.txt", true);
		PrintStream myPrinter = new PrintStream(new File("C:\\Users\\chloe\\Documents\\wordle\\perfectPairsVow.txt"));
		
		/* for (int i = 0; i < 8322; i++) {
			for (int j = 1; j < 8322; j++) {
				if (areUnique(words[i], words[j])) myPrinter.println(words[i] + words[j]);
			}
			// System.out.println("grl");
		}*/
		
		Scanner agh = new Scanner(comboSpots);
		while (agh.hasNextLine()) {
			int i = agh.nextInt();
			int j = agh.nextInt();
			if (areUnique(words[i], words[j])) myPrinter.println(words[i] + words[j]);
		}
		
		
		// System.out.println(areUnique("abcde", "kljoa"));
		
	}
	
	public static boolean areUnique(String a, String b) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a.charAt(i) == b.charAt(j)) return false;
			}
		}
		
		return true;
		
	}

}
