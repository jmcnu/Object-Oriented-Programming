/*
 Author: Jan McNulty
 Date: 6/7/22
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise12_15 {

	public static void main(String[] args) {
		File filename = new File("Exercise12_15.txt");
		if (!filename.exists()) {
			System.out.println(filename +"already exists");

			try(PrintWriter out = new PrintWriter(filename)) {
				

				for (int i = 0; i < 100; i++) {
					out.print((int)(Math.random()* 100) + " ");
				}
				System.out.println("Wrote to file...");

			}
			catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("Reading from file...");

		int [] list = new int[100];
		try {
			Scanner input = new Scanner(filename);
			for(int i=0; i < 100; i++) {
				list[i] = input.nextInt();
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		Arrays.sort(list);


		for (int i = 0; i < 100; i++) {
			System.out.print(list[i] + " ");
		}
	}



}


