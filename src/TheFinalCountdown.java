import java.io.*;
import java.util.*;

public class TheFinalCountdown {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\perfectPairsPairsVow.txt");
		String words[] = new String[3092969];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 3092969; i++) {
			words[i] = scan.next();
		}
		
		File wordsS = new File("C:\\Users\\chloe\\Documents\\wordle\\noVowelList.txt");
		String[] words1 = new String[2580];
		Scanner scann = new Scanner(wordsS);
		for (int i = 0; i < 2580; i++) {
			words1[i] = scann.next();
		}
		
		PrintStream myPrinter = new PrintStream(new File("C:\\Users\\chloe\\Documents\\wordle\\perfection.txt"));
		
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < 3092969; i++) {
			for (int j = 1; j < 2580; j++) {
				if (!set.contains(words[i]) && areUnique(words[i], words1[j])) myPrinter.println(words[i] + words1[j]);
			}
			set.add(words[i]);
			// System.out.println("grl");
		}
		
		// System.out.println(areUnique("qwertyuiopasdfghjklz", "xcgbn"));
		
	}
	
	public static boolean areUnique(String a, String b) {

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 5; j++) {
				if (a.charAt(i) == b.charAt(j))
					return false;
			}
		}

		return true;

	}

}
