/*
 Author: Jan McNulty
 Date: 6/8/22
 */

public class Exercise9_1 {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle(4,40);
		System.out.println("The width of the retangle is" + rectangle1.width);
		System.out.println("The height of the retangle is" + rectangle1.height);
		System.out.println("The area of the retangle is" + rectangle1.getArea());
		System.out.println("The Perimeter of the retangle is" + rectangle1.getPerimeter());
		
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		System.out.println("The width of the retangle is" + rectangle2.width);
		System.out.println("The height of the retangle is" + rectangle2.height);
		System.out.println("The area of the retangle is" + rectangle2.getArea());
		System.out.println("The Perimeter of the retangle is" + rectangle2.getPerimeter());
	}


	public static class Rectangle {
		double width = 1;
		double height = 1;

		Rectangle () {

		}


		Rectangle(double newWidth, double newHeight) {
			width= newWidth;
			height = newHeight;
		}
		double getArea() {
			return width * height;
		}
		double getPerimeter() {
			return 2 * (width + height);
		}
		void setWidth (double newWidth) {
			width = newWidth;
		}
		void setHeight (double newHeight) {
			height= newHeight;
		}
	}

}
