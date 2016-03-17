import java.util.Scanner;
import java.util.Random;
public class NUmberGuessingWithACounter {
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("I have chosen a number between 1 TO 10 ");
        System.out.print("Your guess: ");
        int userguess=input.nextInt();
        int compguess=1 + r.nextInt(10);
        int counter=0,check=0;
        while(userguess!=compguess){
            System.out.println("That is incorrect. Guess again ");
            userguess=input.nextInt();
            check=counter + 1;
            counter ++;
        }
        System.out.println("That's right! You're a good guesser.\n"
                + "It only took you "+check+" tries" );
    }
    
}
