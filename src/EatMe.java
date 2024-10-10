import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EatMe {
	
	public static void main(String[] args) throws IOException {
		
		// imports q word lists
		File wordsF = new File("C:\\Users\\chloe\\Documents\\wordle\\big\\qs.txt");
		String[] words = new String[92];
		Scanner scan = new Scanner(wordsF);
		for (int i = 0; i < 92; i++) {
			words[i] = scan.next();
		}
		
		File wordsS = new File("C:\\Users\\chloe\\Documents\\wordle\\shorterList.txt");
		String[] wordsL = new String[8322];
		Scanner scann = new Scanner(wordsS);
		for (int i = 0; i < 8322; i++) {
			wordsL[i] = scann.next();
			// System.out.println(wordsL[i]);
		}
		
		FileWriter banner = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\big\\temp\\banList.txt", true);
		
		for (String prime: words) {
			// creates a new file of all words which don't share any letters with the prime word
			FileWriter priWrite = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\big\\temp\\pri.txt", true);
			int i1 = 0;
			for (int i = 0; i < 8322; i++) {
				if (!wordsL[i].contains("" + prime.charAt(0)) && !wordsL[i].contains("" + prime.charAt(2))
						&& !wordsL[i].contains("" + prime.charAt(3)) && !wordsL[i].contains("" + prime.charAt(4)) 
						&& !wordsL[i].contains("" + prime.charAt(1))) {
					priWrite.write(wordsL[i] + "\n");
					i1++;
				}
			}
			priWrite.close();
			File pri = new File("C:\\Users\\chloe\\Documents\\wordle\\big\\temp\\pri.txt");
			
			// turns it into an array
			String[] wordsP = new String[i1];
			Scanner scanP = new Scanner(pri);
			for (int i = 0; i < i1; i++) {
				wordsP[i] = scanP.next();
			}
			
			for (String sec: wordsP) {
				// System.out.println(sec);
				FileWriter secWrite = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\big\\temp\\sec.txt", true);
				int i2 = 0;
				for (int i = 0; i < i1; i++) {
					if (!wordsL[i].contains("" + sec.charAt(0)) && !wordsL[i].contains("" + sec.charAt(2))
							&& !wordsL[i].contains("" + sec.charAt(3)) && !wordsL[i].contains("" + sec.charAt(4)) 
							&& !wordsL[i].contains("" + sec.charAt(1))) {
						secWrite.write(wordsL[i] + "\n");
						i2++;
					}
				}
				secWrite.close();
				File secF = new File("C:\\Users\\chloe\\Documents\\wordle\\big\\temp\\sec.txt");
				
				String[] wordsSe = new String[i2];
				Scanner scanSe = new Scanner(secF);
				for (int i = 0; i < i2; i++) {
					wordsSe[i] = scanSe.next();
				}
				
				for (String tri: wordsSe) {
					
					FileWriter triWrite = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\big\\temp\\tri.txt", true);
					int i3 = 0;
					for (int i = 0; i < i2; i++) {
						if (!wordsL[i].contains("" + tri.charAt(0)) && !wordsL[i].contains("" + tri.charAt(2))
								&& !wordsL[i].contains("" + tri.charAt(3)) && !wordsL[i].contains("" + tri.charAt(4)) 
								&& !wordsL[i].contains("" + tri.charAt(1))) {
							triWrite.write(wordsL[i] + "\n");
							i3++;
						}
					}
					triWrite.close();
					File triF = new File("C:\\Users\\chloe\\Documents\\wordle\\big\\temp\\tri.txt");
					
					String[] wordsT = new String[i3];
					Scanner scanT = new Scanner(triF);
					for (int i = 0; i < i3; i++) {
						wordsT[i] = scanT.next();
					}
					// System.out.println(sec);
					for (String quad: wordsT) {
						
						FileWriter quadWrite = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\big\\temp\\quad.txt", true);
						int i4 = 0;
						for (int i = 0; i < i3; i++) {
							if (!wordsL[i].contains("" + quad.charAt(0)) && !wordsL[i].contains("" + quad.charAt(2))
									&& !wordsL[i].contains("" + quad.charAt(3)) && !wordsL[i].contains("" + quad.charAt(4)) 
									&& !wordsL[i].contains("" + quad.charAt(1))) {
								quadWrite.write(wordsL[i] + "\n");
								i4++;
							}
						}
						quadWrite.close();
						File quadF = new File("C:\\Users\\chloe\\Documents\\wordle\\big\\temp\\quad.txt");
						
						String[] wordsQ = new String[i4];
						Scanner scanQ = new Scanner(quadF);
						for (int i = 0; i < i4; i++) {
							wordsQ[i] = scanQ.next();
						}
						
						for (String qui: wordsL) {
							if (is25(prime, sec, tri, quad, qui)) {
								//System.out.println(sec);
								System.out.println(prime + ", " + sec + ", " + tri + ", " + quad + ", " + qui);
							}
						}
					}
				}
			}
			banner.write(prime);
			System.out.println("banned");
		}
		
		System.out.println("done");
		
	}
	
	public static boolean is25(String a, String b, String c, String d, String e) {
		
		String s = a + b + c + d + e;
		//System.out.println(s);
		// return false;
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
		
		return numZeroes <= 1;
		
	}

}
