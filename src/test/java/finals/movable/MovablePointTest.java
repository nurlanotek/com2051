package finals.movable;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint center;
    Movable point;

    @BeforeEach
    void setUp() {
        point = new MovablePoint(0, 0, 10, 10);
        center = new MovablePoint(0, 0, 10, 10);
    }

    @AfterEach
    void tearDown() {
        center = null;
    }

    @Test
    public void testToString() {
        assertEquals("MovablePoint[Coordinates(0,0), Speed(10,10)]", center.toString());
    }

    @Test
    public void moveUp() {
        center.moveUp();
        assertEquals("MovablePoint[Coordinates(0,-10), Speed(10,10)]", center.toString());
    }

    @Test
    public void moveDown() {
        center.moveDown();
        assertEquals("MovablePoint[Coordinates(0,10), Speed(10,10)]", center.toString());
    }

    @Test
    public void moveLeft() {
        center.moveLeft();
        assertEquals("MovablePoint[Coordinates(-10,0), Speed(10,10)]", center.toString());
    }

    @Test
    public void moveRight() {
        center.moveRight();
        assertEquals("MovablePoint[Coordinates(10,0), Speed(10,10)]", center.toString());
    }

    @Test
    void testMembersHaveProtectedAccessModifier() {
        assertEquals(0, center.x);
        assertEquals(0, center.y);
        assertEquals(10, center.xSpeed);
        assertEquals(10, center.ySpeed);
    }

    @Test
    void testIfPointIsMovable() {
        assertInstanceOf(Movable.class, center);
        assertInstanceOf(Movable.class, point);
    }
}