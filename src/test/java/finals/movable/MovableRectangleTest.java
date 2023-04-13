package finals.movable;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableRectangleTest {
    MovableRectangle rectangleMovable;
    Movable rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new MovableRectangle(0, 0, 15, 20, 10, 10);
        rectangleMovable = new MovableRectangle(0, 0, 15, 20, 10, 10);
    }

    @AfterEach
    void tearDown() {
        rectangle = null;
        rectangleMovable = null;
    }

    @Test
    void testToString() {
        assertEquals("MovableRectangle{point1=MovablePoint[Coordinates(0,0), Speed(10,10)], point2=MovablePoint[Coordinates(15,20), Speed(10,10)]}", rectangleMovable.toString());
    }

    @Test
    void moveUp() {
        rectangleMovable.moveUp();
        assertEquals("MovableRectangle{point1=MovablePoint[Coordinates(0,-10), Speed(10,10)], point2=MovablePoint[Coordinates(15,10), Speed(10,10)]}", rectangleMovable.toString());

    }

    @Test
    void moveDown() {
        rectangleMovable.moveDown();
        assertEquals("MovableRectangle{point1=MovablePoint[Coordinates(0,10), Speed(10,10)], point2=MovablePoint[Coordinates(15,30), Speed(10,10)]}", rectangleMovable.toString());
    }

    @Test
    void moveLeft() {
        rectangleMovable.moveRight();
        assertEquals("MovableRectangle{point1=MovablePoint[Coordinates(10,0), Speed(10,10)], point2=MovablePoint[Coordinates(25,20), Speed(10,10)]}", rectangleMovable.toString());
    }

    @Test
    void moveRight() {
        rectangleMovable.moveLeft();
        assertEquals("MovableRectangle{point1=MovablePoint[Coordinates(-10,0), Speed(10,10)], point2=MovablePoint[Coordinates(5,20), Speed(10,10)]}", rectangleMovable.toString());
    }

    @Test
    void testRectableIsMovable() {
        assertInstanceOf(Movable.class, rectangleMovable);
        assertInstanceOf(Movable.class, rectangle);
    }
}