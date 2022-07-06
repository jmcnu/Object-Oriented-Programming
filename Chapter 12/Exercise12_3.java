/*
 Author: Jan McNulty
 Date:7/6/2022
 */

import java.util.Scanner;
public class Exercise12_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		int[] array = new int[100];
		for(int i = 0; i < array.length; i++) {
			array [i] = (int)(Math.random()* 100);
		}

		System.out.println("Enter the index of the array:");

		try {
			int index = input.nextInt();
			
				System.out.println("Array[" + index +"]=" + array[index]);
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}



	}

}
