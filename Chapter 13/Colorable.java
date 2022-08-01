/*
 Author: Jan McNulty
 Date:7/27/22
 */
public interface Colorable {
	
	abstract class GeometricObject {
		
	}
	
	 class Triangle extends GeometricObject implements Colorable {
		public String howToColor() {
			return "Color all three sides";
		}
	}
}
