import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// big strats
public class ExclusiveGenerator {

	public static char TEST_LET = 'j';
	
	public static void main(String args[]) throws IOException {
		
		noSpecGen();
		
	}
	
	public static void noSpecGen() throws IOException {
		
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\shorterList.txt");
		String[] words = new String[8322];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 8322; i++) {
			words[i] = scan.next();
		}
		File wordsq = new File("C:\\Users\\chloe\\Documents\\wordle\\big\\qs.txt");
		String[] wordsQ = new String[92];
		Scanner scan2 = new Scanner(wordsq);
		for (int i = 0; i < 92; i++) {
			wordsQ[i] = scan.next();
		}
		
		//ArrayList<String> 
		
	}
	
	public static void exclGen() throws IOException {
		
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\shorterList.txt");
		String[] words = new String[8322];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 8322; i++) {
			words[i] = scan.next();
		}
		
		FileWriter letterWriter = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\big\\js.txt", true);
		for (String i : words) {
			if (i.contains("" + TEST_LET)) letterWriter.write(i + "\n");
		}
		letterWriter.close();
		
	}
	
}
