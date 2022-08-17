import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {
    static int getRandomNumber(){
        Random num = new Random();
        int r = num.nextInt(3);
        return r+1;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Rock,Paper & Scissor Game!");
        Scanner s = new Scanner(System.in);
        String[]rps = new String[]{"Rock", "Paper", "Scissor"};
        System.out.println("Enter your Name:");
        String name = s.nextLine();
        int playerScore = 0,computerScore = 0,n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println("<-------------------------------------------->");
            System.out.println("Enter --->   1 for Rock\n\t\t\t 2 for Paper\n\t\t\t 3 for Scissor");
            System.out.println(name + "'s Turn:");
            int num = s.nextInt();
            if (num > 0 && num <= 3){
                System.out.println("You choose : " + rps[num - 1]);
                System.out.println("Computer's Turn:");
                int rand = getRandomNumber();
                System.out.println("Computer choose : " + rps[rand - 1]);
                if (rand == 1 && num == 2 || rand == 2 && num == 3 || rand == 3 && num == 1) {
                    playerScore += 1;
                } else if (num == 1 && rand == 2 || num == 2 && rand == 3 || num == 3 && rand == 1) {
                    computerScore += 1;
                } else {
                    playerScore += 0;
                    computerScore += 0;
                }
                System.out.println("--------------ScoreBoard--------------");
                System.out.println(name + ":" + playerScore + "\n" + "Computer:" + computerScore);
            }
            else{
                n = n+1;
                System.out.println("You have entered a wrong key! Please enter a valid key");
            }
        }
        if (playerScore > computerScore){
            System.out.println("You Won!");
        }
        else if (playerScore == computerScore){
            System.out.println("It's a Draw!");
        }
        else{
            System.out.println("You Lost!");
        }
    }
}
