import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpecLetChecker {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\shorterList.txt");
		String[] words = new String[8322];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 8322; i++) {
			words[i] = scan.next();
		}
		File wordsL = new File("C:\\Users\\chloe\\Documents\\wordle\\big\\qs.txt");
		String[] wordsl = new String[92];
		Scanner scan2 = new Scanner(wordsL);
		for (int i = 0; i < 92; i++) {
			wordsl[i] = scan.next();
		}
		
		
	}

}
