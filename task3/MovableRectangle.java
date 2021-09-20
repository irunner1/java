package task3;

public class MovableRectangle implements Movable{
    private movablePoint topLeft;
    private movablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new movablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new movablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    @Override
    public String toString() {
        return String.format("MovableRectangle with topLeft: %1$s and bottomRight: %2$s"
                            , topLeft.toString(), bottomRight.toString());
    }
}