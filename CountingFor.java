import java.util.Scanner;
public class CountingFor {

    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 2 ; n <= 10 ; n = n+2 )
        {
            System.out.println( n + ". " + message );
        }
 
    }
    
}
/*1. n=n+1 is an increamentor. It increase the value of n by 1.
2.int n = 1is the declaration and initialization of n. It also marks the beginning of the for loop.

*/