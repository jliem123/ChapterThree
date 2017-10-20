
// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "poop";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
                              
        Scanner scan = new Scanner(System.in);
        
        Random generator = new Random();
        
        //Get player's play -- note that this is stored as a string
        System.out.print("Make your play (rock, paper, or scissors): ");
        personPlay = scan.next();
        
        //Make player's play uppercase for ease of comparison
        
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);
        
        //Translate computer's randomly generated play to string
        if (computerInt == 0) {
            computerPlay = "rock";
        }
        else if (computerInt == 1) {
            computerPlay = "paper";
        }
        else if (computerInt == 2) {
            computerPlay = "scissors";
        }
        //Print computer's play
        System.out.println("Opponent chose " + computerPlay);
        
        //See who won.
        if ((personPlay.equals("rock") && computerPlay.equals("scissors"))) {
            System.out.println("Rock crushes scissors! Congrats, you win!");
        }
        else if ((personPlay.equals("paper") && computerPlay.equals("rock"))) {
            System.out.println("Paper covers rock! Congrats, you win!");
        }
        else if  ((personPlay.equals("scissors") && computerPlay.equals("paper")))  {
            System.out.println("Scissors cut paper! Congrats, you win!");
        }
        else if ((personPlay.equals("rock") && computerPlay.equals("paper"))) {
            System.out.println("You lose, better luck next time!");
        }
        else if ((personPlay.equals("paper") && computerPlay.equals("scissors"))) {
            System.out.println("You lose, better luck next time!");
        }
        else if ((personPlay.equals("scissors") && computerPlay.equals("rock"))) {
            System.out.println("You lose, better luck next time!");
        }
        else if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        }
    }
}