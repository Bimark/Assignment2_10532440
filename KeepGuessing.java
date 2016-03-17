import java.util.Scanner;
import java.util.Random;
public class KeepGuessing {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner (System.in);
         Random r = new Random();
         int computerguess=1 + r.nextInt(10);
        String name;
        int ch;
    System.out.println("TEH WORST NUMBER GESSING GAME EVAR!!!!!1!");
    System.out.print("I'M THIMKING OF A NBR FROM 1TO 10 ");
    ch=input.nextInt();
    while(ch!=computerguess)
        {
    System.out.println("That is incorrect. Guess again");
    ch=input.nextInt();
        
        }
    System.out.println("That's right! You're a good guesser.");
    }
}