import java.util.Scanner;
public class Adventure2 {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
                int nextroom = 1;
		String choice = "";

		while ( nextroom != 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println( "You are in a creepy house!Would you like to go \"upstairs\" or into the \"Kitchen\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("kitchen") )
					nextroom = 2;
				else if ( choice.equals("upstairs") )
					nextroom = 3;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "There is a long countetop with dirty dishes everywhere. Off to one side"
                                        + " there is, as you'd expected, arefrigeraotr. You may open the \"refrigerator\" or go \"back\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("back") )
					nextroom = 1;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 3 )
			{
                                System.out.println("Upstairs you see a hallway.At the end of the hall is the master"
                                        + "\"Bedroom\". There is also a\"bathroom\" off the hallway. Or, you can go back "
                                        + "\"downstairs\".Where would you like to go?");
				choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equals("bathroom") )
					nextroom = 1;
				else if ( choice.equals("bedroom") )
					nextroom = 4;
                                else if(choice.equals("downstairs"))
                                    nextroom = 5; 
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 4 )
			{
				System.out.println( "Upon closer inspection, the seemingly blank wall shimmers ever so slightly" );
				System.out.println( "in the dim light. You put forward a tentative hand, and it pushes through," );
				System.out.println( "a feeling of static sliding up your arm." );
				System.out.println();
				System.out.println( "You pass through the portal into the unknown...." );
				nextroom = 0;
			}
                        if ( nextroom == 5){
                            System.out.println("You can use the bed now because you are tired! ");
                        }
				
		}

		System.out.println( "\nThe game is over. The next episode can be downloaded for only 800 Microsoft points!" );

    }
    
}
