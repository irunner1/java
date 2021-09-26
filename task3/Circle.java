package task3;

public class Circle {
    protected double radius;
    protected String color;
    protected double x;
    protected double y;

    public Circle() {
        x = 0;
        y = 0;
        color = "white";
        radius = 1;
    }
    public Circle(double radius) {
        x = 0;
        y = 0;
        color = "white";
        this.radius = radius;
    }
    public Circle(double radius, String color, double x, double y) {
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}