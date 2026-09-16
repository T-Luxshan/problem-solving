package solid;

import java.util.Random;
public class RocknPaper {

    String elements[]  = {"ROCK", "PAPER", "SCISSORS"};

    public void options(){
        System.out.println("1: ROCK \n2:PAPER \n3:SCISSORS ");
    }

    public String gameRules(int humanOption, int computerOption){
//        Human choose Rock
        if(humanOption == 1 && computerOption == 1 ){
            return "Draw";
        }
        if(humanOption == 1 && computerOption == 2 ){
            return "Computer Wins";
        }
        if(humanOption == 1 && computerOption == 3 ){
            return "Human Wins";
        }
//        Human choose Paper
        if(humanOption == 2 && computerOption == 1 ){
            return "Human Wins";
        }
        if(humanOption == 2 && computerOption == 2 ){
            return "Draw";
        }
        if(humanOption == 2 && computerOption == 3 ){
            return "Computer Wins";
        }
//        Human choose Scissors
        if(humanOption == 3 && computerOption == 1 ){
            return "Computer Wins";
        }
        if(humanOption == 3 && computerOption == 2 ){
            return "Human Wins";
        }
        if(humanOption == 3 && computerOption == 3 ){
            return "Draw";
        }
        return "Game finished";
    }


    public int computer(){
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        System.out.println("Computer Choose:"+ elements[randomNumber-1]);

        return randomNumber;
    }
}


