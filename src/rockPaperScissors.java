import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        int playerOneNumber = 0;
        int playerTwoNumber = 0;
        String gameMode = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("do you want to play singleplayer or multiplayer?");
            gameMode = scanner.nextLine();
        } while(!gameMode.equals("singleplayer") && !gameMode.equals("multiplayer"));
        if (gameMode.equals("singleplayer")){
            singleplayerMode();
        }
        else {
            multiplayerMode();
        }
    }

    public static void singleplayerMode(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playerOneChoice;
        String playerTwoChoice;
        int winner = 0;
        int roundWinner;
        System.out.println("what is the player's name? ");
        String playerOneName = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            do{
                do {
                    System.out.println(playerOneName + " chose rock, paper or scissors");
                    playerOneChoice = scanner.nextLine();
                } while ((!playerOneChoice.equals("rock") && !playerOneChoice.equals("paper") && !playerOneChoice.equals("scissors")));
                int randomChoice = random.nextInt(3) + 1;
                if (randomChoice == 1) {
                    playerTwoChoice = "rock";
                } else if (randomChoice == 2) {
                    playerTwoChoice = "paper";
                } else {
                    playerTwoChoice = "scissors";
                }
                System.out.println(playerOneName + " chose " + playerOneChoice + " the computer chose " + playerTwoChoice);
                roundWinner = playRockPaperScissors(playerOneChoice, playerTwoChoice);
                if (roundWinner == 1) {
                    System.out.println("the round winner is " + playerOneName);
                    winner += 1;
                } else if (roundWinner == 2) {
                    System.out.println("the round winner is the computer");
                    winner -= 1;
                } else {
                    System.out.println("the round was a draw");
                }
            } while (roundWinner != 0);
        }
        if (winner > 0){
            System.out.println("the match winner is " + playerOneName);
        } else if (winner < 0) {
            System.out.println("the match winner is the computer");
        } else {
            System.out.println("the match was a draw");
        }
    }

    public static void multiplayerMode() {
        Scanner scanner = new Scanner(System.in);
        String playerOneChoice;
        String playerTwoChoice;
        int winner = 0;
        int roundWinner;
        System.out.println("what is player1's name? ");
        String playerOneName = scanner.nextLine();
        System.out.println("what is player2's name? ");
        String playerTwoName = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            do {
                do {
                    System.out.println(playerOneName + " chose rock, paper or scissors");
                    playerOneChoice = scanner.nextLine();
                } while ((!playerOneChoice.equals("rock") && !playerOneChoice.equals("paper") && !playerOneChoice.equals("scissors")));
                do {
                    System.out.println(playerTwoName + " chose rock, paper or scissors");
                    playerTwoChoice = scanner.nextLine();
                } while ((!playerTwoChoice.equals("rock") && !playerTwoChoice.equals("paper") && !playerTwoChoice.equals("scissors")));
                System.out.println(playerOneName + " chose " + playerOneChoice + " " + playerTwoName + " chose " + playerTwoChoice);
                roundWinner = playRockPaperScissors(playerOneChoice, playerTwoChoice);
                if (roundWinner == 1) {
                    System.out.println("the round winner is " + playerOneName);
                    winner += 1;
                } else if (roundWinner == 2) {
                    System.out.println("the round winner is " + playerTwoName);
                    winner -= 1;
                } else {
                    System.out.println("the match was a draw, redo!");
                }
            } while (roundWinner != 0);
        }
        if(winner > 0){
            System.out.println("the match winner is " + playerOneName);
        } else if (winner < 0) {
            System.out.println("the match winner is " + playerTwoName);
        } else {
            System.out.println("the match was a draw");
        }
    }

    public static int playRockPaperScissors(String playerOneChoice, String playerTwoChoice){
        if (playerOneChoice.equals("rock") && playerTwoChoice.equals("paper")){
            return 2;
        }
        else if (playerOneChoice.equals("rock") && playerTwoChoice.equals("scissors")){
            return 1;
        }
        else if (playerOneChoice.equals("paper") && playerTwoChoice.equals("rock")){
            return 1;
        }
        else if (playerOneChoice.equals("paper") && playerTwoChoice.equals("scissors")){
            return 2;
        }
        else if (playerOneChoice.equals("scissors") && playerTwoChoice.equals("rock")){
            return 2;
        }
        else if (playerOneChoice.equals("scissors") && playerTwoChoice.equals("paper")){
            return 1;
        }
        else {
            return 0;
        }
    }
}
