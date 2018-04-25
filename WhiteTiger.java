import java.awt.*;

public class WhiteTiger extends Critter {
    private boolean inf = false;

    public Color getColor() {
        return Color.WHITE;
    }
    public String toString() {
        if (!inf) {
            return "tgr";
        } else {
            return "TGR";
            }
    }
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            inf = true;
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
