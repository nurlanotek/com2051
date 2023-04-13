package finals.movable;

public class MovablePointDriver {
    public static void main(String[] args) {
        MovablePoint center = new MovablePoint(0, 0, 10, 10);
//        center.moveUp();
//        center.moveDown();
//        center.moveRight();
        center.moveLeft();
        System.out.println(center);
//        System.out.println(center);
//        System.out.println(center);
    }
}
