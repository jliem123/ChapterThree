// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          numToGuess = generator.nextInt(11);//randomly generate the number to guess
 
          System.out.println("Guess a number from 1 to 10!");
          guess = scan.nextInt();//print message asking user to enter a guess
 
          System.out.println("You guessed: " + guess + ".");//read in guess
                    
          while (guess != numToGuess) {  //keep going as long as the guess is wrong
                  System.out.println("You guessed the wrong number. Try again!"); //print message saying guess is wrong
                  guess = scan.nextInt();//get another guess from the user
          }
 
          System.out.println("You guessed correctly, congrats!"); //print message saying guess is right
        }
}