package turtleGraphics;

public class Position {
    private int rowPosition;
    private int columnPosition;


    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }
    @Override
    public  String toString(){
        String toString = "Position \n";
        toString += "Current Row Position :" + rowPosition;
        toString += "\n Current Column Position : " + columnPosition;
        return toString;
    }


    @Override
    public boolean equals(Object anotherPosition){
        if (anotherPosition.getClass() != this.getClass()){
            return false;

    }

    Position convertedPosition = (Position) anotherPosition;
    boolean columnsAreEqual = convertedPosition.columnPosition == this.columnPosition;

    boolean rowsAreEqual = convertedPosition.rowPosition == this.rowPosition;
    return columnsAreEqual && rowsAreEqual;
   }

   public void IncreaseColumnPositionBy(int numberOfSteps){
    columnPosition += numberOfSteps;
}
}