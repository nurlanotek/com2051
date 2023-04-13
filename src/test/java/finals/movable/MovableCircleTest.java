package finals.movable;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {
    MovableCircle circle;
    Movable circleMovable;

    @BeforeEach
    void setUp() {
        circle = new MovableCircle(0, 0, 10, 10, 5);
        circleMovable = new MovableCircle(0, 0, 10, 10, 5);
    }

    @AfterEach
    void tearDown() {
        circle = null;
    }
    @Test
    public void testToString() {
        assertEquals("MovableCircle[radius=5, center=MovablePoint[Coordinates(0,0), Speed(10,10)]]", circle.toString());
    }

    @Test
    public void moveUp() {
        circle.moveUp();
        assertEquals("MovableCircle[radius=5, center=MovablePoint[Coordinates(0,-10), Speed(10,10)]]", circle.toString());
    }

    @Test
    public void moveDown() {
        circle.moveDown();
        assertEquals("MovableCircle[radius=5, center=MovablePoint[Coordinates(0,10), Speed(10,10)]]", circle.toString());
    }

    @Test
    public void moveLeft() {
        circle.moveLeft();
        assertEquals("MovableCircle[radius=5, center=MovablePoint[Coordinates(-10,0), Speed(10,10)]]", circle.toString());
    }

    @Test
    public void moveRight() {
        circle.moveRight();
        assertEquals("MovableCircle[radius=5, center=MovablePoint[Coordinates(10,0), Speed(10,10)]]", circle.toString());
    }

    @Test
    void testCircleImplementsMovableInterface() {
        assertInstanceOf(Movable.class, circleMovable);
        assertInstanceOf(Movable.class, circle);
    }
}