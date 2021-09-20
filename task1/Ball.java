package task1;

public class Ball {
    private double x;
    private double y;

    public Ball() {
        x = 0;
        y = 0;
    }
    public Ball(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public void setX(double _x) {
        x = _x;
    }
    public void setY(double _y) {
        y = _y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setXY(double _x, double _y) {
        x = _x;
        y = _y;
    }
    public void setXYSpeed() {}

    public void move(double xDisp, double yDisp) {
        x+=xDisp;
        y+=yDisp;
    }

    public String toString() {
        return "Ball @("+this.x+", "+this.y+").";
    }
}

