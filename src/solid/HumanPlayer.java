package solid;

import java.util.List;
import java.util.Scanner;

public class HumanPlayer implements Player{
    Scanner sc = new Scanner(System.in);
    public final GestureProvider gestureProvider;

    public HumanPlayer(GestureProvider gestureProvider) {
        this.gestureProvider = gestureProvider;
    }

    @Override
    public Gesture chooseGesture() {

        List<Gesture> gestures = gestureProvider.getGestures();
        printMenu(gestures);
        System.out.print("Enter your choice:");
        int choice = sc.nextInt();

        while (choice > gestures.size() || choice < 1){
            System.out.print("Invalid input try again:");
            choice = sc.nextInt();
        }
        return gestures.get(choice-1);
    }

    public void printMenu(List<Gesture> gestures){
        for(int i=0; i<gestures.size(); i++){
            System.out.println(i+1 + "." + gestures.get(i).getType());
        }
    }
}
