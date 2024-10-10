import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TEster {

	public static void main(String[] args) throws FileNotFoundException {
		
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\perfectTriples.txt");
		String words[] = new String[10041166];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 10; i++) {
			System.out.println(words[i]);
		}
		
		for (String i: words) {
			System.out.println(i);
		}
		
	}
	
}
