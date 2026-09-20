package solid.SwordsAndGuns;

import solid.Gesture;
import solid.GestureProvider;

import java.util.List;

public class SwordsAndGunsGestureProvider implements GestureProvider {
    @Override
    public List<Gesture> getGestures() {
        return List.of(
                new Sword(),
                new Gun()
        );
    }
}
