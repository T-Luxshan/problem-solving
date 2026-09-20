package solid.rockpaperscissors;

import solid.Gesture;

public class Paper implements Gesture {
    @Override
    public String getType() {
        return "PAPER";
    }
}
