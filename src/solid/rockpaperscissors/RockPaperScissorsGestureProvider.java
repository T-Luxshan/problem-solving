package solid.rockpaperscissors;

import solid.Gesture;
import solid.GestureProvider;

import java.util.List;

public class RockPaperScissorsGestureProvider implements GestureProvider {
    @Override
    public List<Gesture> getGestures() {
        return List.of(
                new Rock(),
                new Paper(),
                new Scissors()
        );
    }
}
