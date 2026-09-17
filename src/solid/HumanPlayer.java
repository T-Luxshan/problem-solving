package solid;

import solid.rockpaperscissors.Paper;
import solid.rockpaperscissors.Rock;
import solid.rockpaperscissors.Scissors;

import java.util.Scanner;

public class HumanPlayer implements Player{
    Scanner sc = new Scanner(System.in);
    @Override
    public Gesture chooseGesture() {


        System.out.println("Choose your gesture:\n1.Rock\n2.Paper\n3.Scissors");
        System.out.print("Enter choice:");
        int choice = sc.nextInt();

        while (choice > 3 || choice < 1){
            System.out.println("Invalid input try again.");
            choice = sc.nextInt();
        }
        return switch (choice) {
            case 1 -> new Rock();
            case 2 -> new Paper();
            case 3 -> new Scissors();
            default -> throw new IllegalArgumentException("Invalid choice");
        };
    }
}
