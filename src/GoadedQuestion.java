import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GoadedQuestion {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\shorterList.txt");
		String words[] = new String[8322];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 8322; i++) {
			words[i] = scan.next();
		}
		
		for (String i: words) {
			if (!hasVowels(i)) System.out.println(i);
		}
		
	}
	
	public static boolean hasVowels(String a) {
		
		return (a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u") || a.contains("y"));
		
	}

}
