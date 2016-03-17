import java.util.Scanner;
public class CountingWhile {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
                System.out.print( "How many times? ");
		int n = keyboard.nextInt();
                int x=0;
		while ( x < n )
		{
			System.out.println( (x+1)*10 + ". " + message );
			x++;
		}
    }
    
}
/*1.The n++ is acting as loop breaker as it ensures that the loop does not become an infinite loop.

*/