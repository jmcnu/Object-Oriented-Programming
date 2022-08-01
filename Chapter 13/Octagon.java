/*
 Author: Jan McNulty
 Date:7/27/22
 */


public class Octagon extends GeometricObject implements Cloneable {
	double side;

	public Octagon() {
		this(5);
	}

	public Octagon(double side) {
		this.side = side;
	}

	public Octagon(double side, String color, boolean filled) {
		this.side =side;
		setColor(color);
		setFilled(filled);
	}



	public double  getArea() {
		return (2 + 4 / Math.sqrt(2) * side *side);
	}

	public double getPerimeter() {
		return side * 8;
	}

	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		}
		catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return o;
	}

	public boolean equals(Object o) {
		return o instanceof Octagon && getArea() == ((Octagon)o).getArea();}

	public int compareTo (Object o) {
		return 0;
	}
}