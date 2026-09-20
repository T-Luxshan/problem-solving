package solid;

import solid.rockpaperscissors.RockPaperScissorsGestureProvider;
import solid.rockpaperscissors.RockPaperScissorsRules;

public class Main {
    public static void main(String[] args){
        GestureProvider gestureProvider = new RockPaperScissorsGestureProvider();

        Player humanPlayer = new HumanPlayer(gestureProvider);

        Player computerPlayer = new ComputerPlayer(gestureProvider);

        // 3. Create the game rules
        GameRules gameRules = new RockPaperScissorsRules();

        // 4. Create the game engine
        GameEngine gameEngine = new GameEngine(humanPlayer, computerPlayer, gameRules);

        // 5. Play one round
        GameResult result = gameEngine.playRound();

        // 6. Display the result
        System.out.println("Result: " + result);
    }
}
