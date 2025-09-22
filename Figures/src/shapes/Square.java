package shapes;

public class Square {
    private double sideLength;

    // Default constructor
    public Square() {
        this(1.0); // calls the other constructor
    }

    // Constructor with parameter
    public Square(double sideLength) {
        if (sideLength < 0.0) {
            throw new IllegalArgumentException("sideLength must be >= 0");
        }
        this.sideLength = sideLength;
    }

    // Getter
    public double getSideLength() {
        return sideLength;
    }

    // Setter (optional, lets you change the side later)
    public void setSideLength(double sideLength) {
        if (sideLength < 0.0) {
            throw new IllegalArgumentException("sideLength must be >= 0");
        }
        this.sideLength = sideLength;
    }

    // Area method
    public double getArea() {
        return sideLength * sideLength;
    }
}
