package shapes;
import java.out.color
public class Square {
	private double sideLength ;
	
	public Square() {
		this.sideLength = 1.0;
	}
	
	public Square(double sideLength) {
		if (sideLength <= 0.0) {
			
		}
		this.sideLength = sideLength;
		
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public double getArea() {
		return sideLength * sideLength ;
	}


}
