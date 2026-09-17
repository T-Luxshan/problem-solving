package solid.rockpaperscissors;

import solid.Gesture;

public class Rock implements Gesture {

    @Override
    public GestureType getType() {
        return GestureType.ROCK;
    }
}
