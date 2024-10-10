import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Client {
	
	public static final long NUMBER_ATTEMPTS = 9223372036854775807L;

	public static void main(String[] args) throws IOException {
		
		// String bigliestBoy = "";
		String smallBoy = "";
		
		int inty = 1;
		
		// String banList = "";
		
		File bans = new File("C:\\Users\\chloe\\Documents\\wordle\\banList.txt");
		Scanner scann = new Scanner(bans);
		int[] banList = {scann.nextInt(), scann.nextInt(), scann.nextInt(), scann.nextInt(), scann.nextInt()};
		// System.out.println(banList);
		
		File file = new File("C:\\Users\\chloe\\Documents\\wordle\\ammendedWordies.txt");
		
		Scanner scan = new Scanner(file);
		
		String[] words = new String[12972];
		
		for (int i = 0; i < 12972; i++) {
			
			words[i] = scan.next();
			
		}
		
		int length = 0;
		
		for (int i1 = banList[0]; i1 < 12972; i1++) {
			
			for (int i2 = banList[1]; i2 < 12972; i2++) {
				
				for (int i3 = banList[2]; i3 < 12972; i3++) {
					
					for (int i4 = banList[3]; i4 < 12972; i4++) {
						
						for (int i5 = banList[4]; i5 < 12972; i5++) {
							
							String listy = i1 + ",  " + i2 + ",  " 
									+ i3 + ",  " + i4 + ",  " + i5;
							
							
							
							// if (!banList.contains(listy)) {
							
								length++;
								
								int co = uniqueNums(i1, i2, i3, i4, i5, words);
								
								if (co <= inty) {
									
									// inty = co;
									/*FileWriter myWriter = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\eatThis.txt", true);
									File bannny = new File("C:\\Users\\chloe\\Documents\\wordle\\eatThis.txt");
									myWriter.write(/*fileToString(bannny) + listy + ", " + co + "\n");
									myWriter.close();*/
									// // / // / // /  smallBoy += listy + ", " + co + "\n";
									System.out.println(listy + ", " + co);
									
								} else {

									/*FileWriter myWriter = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\banList.txt", true);
									File lmaoXD = new File("C:\\Users\\chloe\\Documents\\wordle\\banList.txt");
									String fuckMe = /*fileToString(lmaoXD) + listy + "\n";
									myWriter.write(fuckMe);
									//System.out.println("START>" + fuckMe + "<END");
									myWriter.close();*/
									// System.out.println("banned lol");
								
									// String bigliestBoy = i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5;
									
								}
								
								if (length % ((double) NUMBER_ATTEMPTS / 100) == 0) System.out.println((double) length / NUMBER_ATTEMPTS * 100 + "% done");
								// String s = (double) length / NUMBER_ATTEMPTS * 100 + "% done";
								// if (s.equals("1.0169406549492832E-10% done")) {System.out.println("oh my god"); return;}
								
								/*if (length >= NUMBER_ATTEMPTS) {
									
									FileWriter coWriter = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\eatThis.txt", true);
									coWriter.write(smallBoy);
									FileWriter myWriter = new FileWriter("C:\\Users\\chloe\\Documents\\wordle\\banList.txt");
									myWriter.write(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5);
									coWriter.close();
									myWriter.close();
									System.out.println("done");
									return;
								}*/
								
								
							
							// }
							
							// System.out.println(i1 + ",  " + i2 + ",  " + i3 + ",  " + i4 + ",  " + i5);
							
						}
						
					}
					
				}
				
			}
			
		}
		
		System.out.println("Test complete");
		
		// System.out.println(isCorrect(6396, 5416, 7617, 4194, 3236, words));
		
	}
	
	public static int isCorrect(int a, int b, int c, int d, int e, String[] w) {
		
		int screwAiden = 0;
		
		for (int uni = 97; uni <= 122; uni++) {
			
			if (!w[a].contains("" + (char) uni) && !w[b].contains("" + (char) uni) && 
					!w[c].contains("" + (char) uni) && !w[d].contains("" + (char) uni) 
					&& !w[e].contains("" + (char) uni)) {
				
				screwAiden++;
				
			}
		
		}
		
		return screwAiden;
		
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
	
	public static String fileToString(File f) throws FileNotFoundException {
		
		String fi = "";
		Scanner scann = new Scanner(f);
		while (scann.hasNextLine()) fi += scann.nextLine();
		return fi;
		
	}
	
}
