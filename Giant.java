import java.awt.*;

public class Giant extends Critter {
    private int counter=0;
    private int nameCounter = 0;
    String[] names = new String[] {"fee", "fie", "foe", "fum"};
    public Color getColor(){
        return Color.GRAY;
    }
    public String toString()
    {
        if (nameCounter==4){
            nameCounter = 0;
        }
        return names[nameCounter];
    }
    public Action getMove(CritterInfo info)
    {
        counter ++;
        if (counter%6==0){
            nameCounter++;
        }

        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }

}

