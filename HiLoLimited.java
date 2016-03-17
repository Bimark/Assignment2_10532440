import java.util.Scanner;
import java.util.Random;
public class HiLoLimited { 
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner (System.in);
         System.out.println("I have chosen a number between 1 TO 100."
                 + "You have 7 guesses. ");
        System.out.print("First guess: ");
        int accpt=input.nextInt();
        int compguess=1 + r.nextInt(100);
        
    int counter=2;
    if (accpt==compguess){
        System.out.println("You guessed it! Whats are the odds?!?");
    }
    else {
        while(accpt!=compguess && counter<=7)
    {
        System.out.println(accpt>compguess ?"Sorry, that guess is too high ":"Sorry you are too low");
        
        System.out.print("Guess # " + counter +" :");
        accpt=input.nextInt();
        counter++;
        }
        System.out.println("Sorry, you didn't guess it in 7 tries. You lose. ");
    }
  }
    
}
