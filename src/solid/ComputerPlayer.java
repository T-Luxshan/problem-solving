package solid;
public class ComputerPlayer implements Player {

    private final GestureProvider gestureProvider;

    public ComputerPlayer(GestureProvider gestureProvider) {
        this.gestureProvider = gestureProvider;
    }

    @Override
    public Gesture chooseGesture() {
        return null;
    }
}