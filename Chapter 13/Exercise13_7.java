/*
 Author: Jan McNulty
 Date:7/27/22
 */
public class Exercise13_7 {

	public static void main(String[] args) {
		GeometricObject [] object = {new Triangle(11,12,13), new Triangle(6,7,8), 
				new Triangle(9,10,11),new Triangle(4,5,6), new Triangle(7,8,9)};

		for (int i = 0; i < object.length; i++) {
			System.out.println("\nTriangle #" + (i + 1));
			System.out.println("Area:" + object[i].getArea());
			System.out.println(((Triangle)object[i]).howToColor());
		}


	}

}
