import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Teensifier {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\shorterList.txt");
		String words[] = new String[8322];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 8322; i++) {
			words[i] = scan.next();
		}
		
		PrintStream myPrinter = new PrintStream(new File("C:\\Users\\chloe\\Documents\\wordle\\noVowelList.txt"));
		
		for (String i: words) {
			if (hasDoubleVowels(i)) myPrinter.println(i);
		}
		
	}
	
	public static boolean hasDoubleVowels(String s) {
		
		return !((s.contains("a") && s.contains("e") || s.contains("a") && s.contains("i") || s.contains("a") && s.contains("o")
				|| s.contains("a") && s.contains("u") || s.contains("e") && s.contains("i") || s.contains("e") && s.contains("o")
				|| s.contains("e") && s.contains("u") || s.contains("i") && s.contains("o") || s.contains("i") && s.contains("u")
				|| s.contains("o") && s.contains("u")) || (s.contains("a") && s.contains("e") || s.contains("a") && s.contains("i") || s.contains("a") && s.contains("o")
						|| s.contains("a") && s.contains("u") || s.contains("e") && s.contains("i") || s.contains("e") && s.contains("o")
						|| s.contains("e") && s.contains("u") || s.contains("i") && s.contains("o") || s.contains("i") && s.contains("u")
						|| s.contains("o") && s.contains("u")));
		
	}

}
