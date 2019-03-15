import java.util.Scanner;
import java.io.*;
import java.awt.datatransfer.*;
import java.awt.Toolkit;




public class Scrambler {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner reader = new Scanner(new File("wild table.txt"));
		String[] effects = new String[100];

		for (int i=0; i<100; i++)
		{
			effects[i] = reader.nextLine();
		}

		String temp = "";
		for (int i=0; i<100; i++) {
			int randIndex = (int)(Math.random()*100);
			temp = effects[randIndex];
			effects[randIndex] = effects[i];
			effects[i] = temp;
		}


	}
}