import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DoubleDouble {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\perfectPairsVow.txt");
		String words[] = new String[478157];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 478157; i++) {
			words[i] = scan.next();
		}
		
		PrintStream myPrinter = new PrintStream(new File("C:\\Users\\chloe\\Documents\\wordle\\perfectPairsPairsVow.txt"));
		
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < 478157; i++) {
			for (int j = 1; j < 478157; j++) {
				if (!set.contains(words[i]) && areUnique(words[i], words[j])) myPrinter.println(words[i] + words[j]);
			}
			set.add(words[i]);
			// System.out.println("grl");
		}
		
	}
	
	public static boolean areUnique(String a, String b) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (a.charAt(i) == b.charAt(j))
					return false;
			}
		}

		return true;

	}

}
