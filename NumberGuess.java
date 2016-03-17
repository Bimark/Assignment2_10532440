import java.util.Random;
import java.util.Scanner;
public class NumberGuess {

  
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner (System.in);
         Random r = new Random();
         int computerguess=1 + r.nextInt(10);
        String name;
        int ch;
    System.out.println("TEH WORST NUMBER GESSING GAME EVAR!!!!!1!");
    System.out.print("I'M THIMKING OF A NBR FROM 1 TO 10 ");
    ch=input.nextInt();
    if (ch==computerguess)
    {
        System.out.println("LOL!!! U GOT IT! I CANT BELIEVE U GESSED IT WAS " + computerguess);
    }
    else 
        System.out.println("WOOT! U SUXOR!!! I PWN JOO!!! IT WAS " + computerguess);
    }
    
}
