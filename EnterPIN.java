import java.util.Scanner;
public class EnterPIN {

    public static void main(String[] args) {
        // TODO code application logic here
        	Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
    
}
/* 1.while loop and if statement are similar in the sense an action is performed based on a condition
2.while loop performs iteration based on a condition but if statement just performs an action once.
3.There is no int in front of entry because it has already been declred.
4.When the entry=keyboard.nextInt() is deleted, while loop becomes an infinite loop if the user enters the wrong pin.
5.
*/