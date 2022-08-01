/*
 Author:Jan McNulty
 Date:7/13/22
 */

import java.util.Scanner;
public class Exercise13_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Triangle Triangle = new Triangle();
		

		System.out.println("Enter side 1 of the triangle");
		Triangle.setSide1(input.nextDouble());
		System.out.println("Enter side 2 of the triangle");
		Triangle.setSide2(input.nextDouble());
		System.out.println("Enter side 3 of the triangle");
		Triangle.setSide3(input.nextDouble());


		System.out.println("Enter a color for the triangle");
		Triangle.setColor(input.next());
		
		System.out.println("Indicate if the triangle is filled or not: True/False");
		String isFilledString = input.next();
		


		System.out.println(" A Triangle " + Triangle.toString());
		System.out.println("The color is " + Triangle.getColor());
		System.out.println("Is filled: " + Triangle.isFilled());
		System.out.println("The area is " + Triangle.getArea());
		System.out.println("The perimeter is " + Triangle.getPerimeter());
	

	}

}
