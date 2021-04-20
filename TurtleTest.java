package turtleGraphics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    Pen pen;
    Pen secondPen;
    Turtle turtle;
    @BeforeEach
        void startAllTestWithThis(){
         pen = new Pen();
        secondPen = new Pen();
         turtle = new Turtle(pen);

    }
    @AfterEach
    void afterEach(){
        pen=null;
        secondPen=null;
        turtle=null;
    }

    @Test
    void  turtleHasAPenTest(){

        assertNotNull(turtle.getPen());
        assertEquals(pen, turtle.getPen());
        assertNotEquals(secondPen, turtle.getPen());
    }

    @Test
    void turtleCanMovePenUp(){
        turtle.movePenUp();
       assertTrue(turtle.isPenUp());
    }

    @Test
    void turtleCanMovePenDown(){
        assertTrue(turtle.isPenUp());
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    void turtleCanTurnRightWhileFacingEast(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingSouth() {
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingWest() {
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingNorth() {
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanMoveForwardWhileFacingEast() {

        assertSame(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanWriteWhileFacingEastTest(){
        turtle.movePenDown();
       // SketchPad sketchPad = new SketchPad(20, 20);
       // turtle.writeOn(sketchPad, 5);

    }

}
