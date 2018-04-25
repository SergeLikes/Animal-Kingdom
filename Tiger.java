import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {

    Color[] colors = new Color[] { Color.RED, Color.GREEN, Color.BLUE};
    Random ran = new Random();
    int x = ran.nextInt(3);
    private int counter = 0;

    public Color getColor() {
        return colors[x];
    }
    public String toString() {
        return "TGR";
    }
    public Action getMove(CritterInfo info) {
        counter ++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }
        else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
