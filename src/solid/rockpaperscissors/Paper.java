package solid.rockpaperscissors;

import solid.Gesture;

public class Paper implements Gesture {
    @Override
    public GestureType getType() {
        return GestureType.PAPER;
    }
}
