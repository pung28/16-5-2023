package homework.bt6_8;

public class main {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15); // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        MovableRectangle mr = new MovableRectangle(1, 2, 4, 6, 3, 3);
        System.out.println(mr);
        mr.moveUp();
        System.out.println(mr);
        mr.moveRight();
        System.out.println(mr);
    }
}

