package solid.rockpaperscissors;

import solid.Gesture;

public class Scissors implements Gesture {
    @Override
    public GestureType getType() {
        return GestureType.SCISSORS;
    }
}
