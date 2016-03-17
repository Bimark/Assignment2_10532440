import java.util.Scanner;
import java.util.Random;
public class AgainWithTheNumberGuessing {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        int compguess=1 + r.nextInt(10);
        int counter=0,check=0;
        int userguess;
        System.out.println("I have chosen a number between 1 TO 10 ");
        System.out.print("Your guess: ");
            userguess=input.nextInt();
        do {
            System.out.println("That is incorrect. Guess again ");
            userguess=input.nextInt();
            check=counter + 1;
            counter ++;
        }
        
        while( userguess != compguess);
                
        System.out.println("That's right! You're a good guesser.\n"
                + "It only took you "+check+" tries" );
    }
    
}
