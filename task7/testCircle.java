package task7;

public class testCircle {
    public static void main(String[] args) {
        Movable m1 = new movablePoint(2, 2, 10, 10);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);

        Movable m2 = new MovableCircle(2, 1, 2, 2, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}