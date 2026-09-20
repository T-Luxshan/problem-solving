package solid;

import solid.SwordsAndGuns.SwordsAndGunsGestureProvider;
import solid.SwordsAndGuns.SwordsAndGunsRules;
import solid.rockpaperscissors.RockPaperScissorsGestureProvider;
import solid.rockpaperscissors.RockPaperScissorsRules;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("1.Rock Paper Scissors\n2.Swords and Guns\nChoose the game:");

        int gameChoice = sc.nextInt();

        while (gameChoice < 1 || gameChoice > 2){
            System.out.print("Invalid choice:");
            gameChoice = sc.nextInt();
        }
        GestureProvider gestureProvider;
        GameRules gameRules;
        if(gameChoice == 1){
            gestureProvider = new RockPaperScissorsGestureProvider();
            gameRules = new RockPaperScissorsRules();

        } else {
            gestureProvider = new SwordsAndGunsGestureProvider();
            gameRules = new SwordsAndGunsRules();

        }

        Player humanPlayer = new HumanPlayer(gestureProvider);
        Player computerPlayer = new ComputerPlayer(gestureProvider);

        // 3. Create the game rules
//        gameRules = new RockPaperScissorsRules();

        // 4. Create the game engine
        GameEngine gameEngine = new GameEngine(humanPlayer, computerPlayer, gameRules);

        // 5. Play one round
        GameResult result = gameEngine.playRound();

        // 6. Display the result
        System.out.println("Result: " + result);
    }
}
