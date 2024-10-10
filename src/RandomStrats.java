import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

// eat my ass
public class RandomStrats {

	public static void main(String[] args) throws FileNotFoundException {
		int x = 0;
		File words = new File("C:\\Users\\chloe\\Documents\\wordle\\ammendedWordies.txt");
		String[] sets = new String[12972];
		Scanner scan = new Scanner(words);
		for (int i = 0; i < 12972; i++) {
			sets[i] = scan.next();
		}
		Random rand = new Random();
		boolean boon = true;
		while (boon) {
			int a = rand.nextInt(12972);
			int b = rand.nextInt(12972);
			int c = rand.nextInt(12972);
			int d = rand.nextInt(12972);
			int e = rand.nextInt(12972);
			int o = uniqueNums(a, b, c, d, e, sets);
			if (o <= 5) {
				System.out.println(a + "," + b + "," + c + "," + d + "," + e + "," + o);
				System.out.println(sets[a] + "," + sets[b] + "," + sets[c] + "," + sets[d] + "," + sets[e] + "," + (25 - o));
				boon = false;
				System.out.println(x);
			}
			x++;
		}
	}
	
	public static int uniqueNums(int a, int b, int c, int d, int e, String[] w) {
		
		String s = w[a] + w[b] + w[c] + w[d] + w[e];
		int[] map = new int[26];
		for (int i = 0; i < s.length(); i++) {
			map[(int) s.charAt(i) - 97]++;
		}
		int numZeroes = 0;
		for (int i : map) {
			if (i == 0) {
				numZeroes++;
			}
		}
		return numZeroes;
		
	}
	
}
