package solid;

import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {

    private final GestureProvider gestureProvider;
    private final Random random = new Random();

    public ComputerPlayer(GestureProvider gestureProvider) {
        this.gestureProvider = gestureProvider;
    }

    @Override
    public Gesture chooseGesture() {
        List<Gesture> gestures = gestureProvider.getGestures();
        int randomIndex = random.nextInt(gestures.size());
        System.out.println("Computer choose: "+gestures.get(randomIndex).getType());
        return gestures.get(randomIndex);
    }
}