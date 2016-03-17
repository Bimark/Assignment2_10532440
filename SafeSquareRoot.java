import java.util.Scanner;
public class SafeSquareRoot {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
     int accpt;
     System.out.println("SQUARE ROOT!");
     System.out.print("Enter a number: ");
     accpt = input.nextInt();
     while (true){
     if(accpt>0){
        System.out.println("The square root of " + accpt +" is "+Math.sqrt(accpt));
        break;
     }
     else
            {
         
         System.out.print("You can't take the square root of a negative number!\n"
                     + "Try again: ");
         accpt = input.nextInt();
         
            }
        }
    }
}