package com.example;

public class Chifumi {
    private final String player;

    public Chifumi(String player) {
        this.player = player;
    }

    public int playRound() {
        String[] emoji = {"\u270A", "\uD83D\uDD90", "\u270C"}; 
        String playerChoice;
        String emojiPlayerChoice = "";
        while(true){
            playerChoice = System.console().readLine(player + " enter your choice (rock \u270A , paper \uD83D\uDD90 , scissors  \u270C): ");
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice");
            } else {
                switch (playerChoice) {
                    case "rock" -> emojiPlayerChoice = emoji[0];
                    case "paper" -> emojiPlayerChoice  = emoji[1];
                    case "scissors" -> emojiPlayerChoice = emoji[2];
                    default -> throw new AssertionError();
                }
                break;
            }
        }
        String[] choices = {"rock", "paper", "scissors"};
        int random = (int) (Math.random() * 3);
        String computer = choices[random];
        System.out.println("Computer: " + computer + " " + emoji[random] + " - " + player + ": " + playerChoice + " " + emojiPlayerChoice);
        if (playerChoice.equals(computer)) {
            System.out.println("Draw");
            return 2;
        } else if (playerChoice.equals("rock") && computer.equals("scissors") || playerChoice.equals("paper") && computer.equals("rock") || playerChoice.equals("scissors") && computer.equals("paper")) {
            System.out.println(player + " win");
            return 1;
        } else {
            System.out.println("Computer win");
            return 0;
        }
    }

    public void play() {
        int playerScore = 0;
        int computerScore = 0;
        int round = 1;
        while (playerScore < 3 && computerScore < 3) {
            System.out.println("############### Round " + round + " ###############");
            int result = playRound();
            if (result == 1) {
                playerScore++;
            } else if (result == 0) {
                computerScore++;
            }
            System.out.println("Score: " + player + " " + playerScore + " - Computer " + computerScore);
            round++;
        }
        if (playerScore == 3) {
            System.out.println(player + " win the game");
        } else {
            System.out.println("Computer win the game");
        }
    }

    public static void main(String[] args) {
        System.out.println("\uD83D\uDD90 \u270C \u270A Welcome to the Rock Paper Scissors game \uD83D\uDD90 \u270C \u270A");
        String player = System.console().readLine("Enter your namePlayer : ");
        Chifumi chifumi = new Chifumi(player);
        chifumi.play();
    }
}
