/*
 Author: Jan McNulty
 Date: 8/1/22
 */
public class Exercise13_11 {

	public static void main(String[] args) {
		Octagon oct1 = new Octagon(12);
		Octagon oct2 = (Octagon)oct1.clone();
		
		
		System.out.println("Octagon 1 compared to Octagon 2: " + (oct1.compareTo(oct2) == 0));
		System.out.println("equals: " + oct1 .equals(oct2));
		System.out.println("Do they have the same reference: " + (oct1 == oct2));

	}

}
