import java.util.Random;
import java.util.Scanner;
public class OneShotHiLo {

        public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        Scanner input = new Scanner (System.in); 
        int userguess;
        int computerguess=1 + r.nextInt(100);
        System.out.println("I'm thinking of a number between 1-100.Try to guess it");
        userguess=input.nextInt();
        if (userguess==computerguess)
            System.out.println("You guessed it! Whats are the odds?!? ");
        else if (userguess<computerguess)
            System.out.println("Sorry,you too low. I was thinking of "+computerguess);
        else
            System.out.println("Sorry, you are too high. I was thinking of "+computerguess);
    }
    
}
