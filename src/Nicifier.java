import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Nicifier {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\perfection.txt");
		String words[] = new String[210];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 210; i++) {
			words[i] = scan.next();
		}
		
		PrintStream myPrinter = new PrintStream(new File("C:\\Users\\chloe\\Documents\\wordle\\perfectPerfection.txt"));
		
		for (String i: words) {
			myPrinter.println(i.substring(0, 5) + ", " + i.substring(5, 10) + ", " + 
		i.substring(10, 15) + ", " + i.substring(15, 20) + ", " + i.substring(20));
		}
		
	}

}
