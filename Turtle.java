package turtleGraphics;


import static turtleGraphics.Direction.*;

public class Turtle {
    private final Pen pen;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(Pen turtlePen) {
        this.pen = turtlePen;
        currentDirection = EAST;
        currentPosition = new Position(0, 0);

    }

    public Pen getPen() {
        return pen;
    }

    public void movePenUp() {
        pen.setIsUp(true);
    }

    public boolean isPenUp() {
        return pen.isUp();

    }

    public void movePenDown() {
        pen.setIsUp(false);

    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> changeCurrentDirectionTo(SOUTH);
            case WEST -> changeCurrentDirectionTo(NORTH);
            case SOUTH -> changeCurrentDirectionTo(WEST);
            case NORTH -> changeCurrentDirectionTo(EAST);
        }

    }



    private void changeCurrentDirectionTo(Direction newDirection) {
        currentDirection = newDirection;

    }



  public void moveForwardBy(int numberOfSteps) {
     switch (currentDirection){
           case EAST -> currentPosition.IncreaseColumnPositionBy(numberOfSteps);
       }

    }
    public Position getCurrentPosition(){
       return currentPosition;
    }


    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        if (!isPenUp()){
            switch (currentDirection){
                case EAST :

            }
        }
    }
}


