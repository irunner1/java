package task7;

public class movablePoint implements Movable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    movablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return String.format("MovablePoint ("+x+", "+y+") with xSpeed = "+xSpeed+" and ySpeed = "+ySpeed
                , x, y, xSpeed, ySpeed);
    }
}