package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return (2*length) + (2*width);
    }

    public double calculateArea() {
        return length * width;
    }
}

