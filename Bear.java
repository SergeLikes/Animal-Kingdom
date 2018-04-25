import java.awt.*;

public class Bear extends Critter {
    private boolean polar;
    private int counter;

    public Bear(boolean polar){
        this.polar = polar;
        this.counter = 0;
    }
    public Color getColor()     {
        if (this.polar){
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }
    public String toString() {
        if(counter == 0 || counter%2 == 0){
            return "/";
        } else{
            return "\\";
        }
    }
    public Action getMove(CritterInfo info) {
        counter ++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}
