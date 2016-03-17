import java.util.Scanner;
import java.util.Random;
public class BabyBlackjack {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         Random r = new Random();
         int choice1,choice2,dealer1,dealer2,sum1,sum2;
         dealer1=1 + r.nextInt(10);
         dealer2=1 + r.nextInt(10);
         sum1=dealer1+dealer2;
         System.out.print("Baby Blackjack!");
         System.out.print("Draw two numbers from 1 to 10. \nFirst number: ");
         choice1=input.nextInt();
         System.out.print("Second number: ");
         choice2=input.nextInt();
         sum2=choice1+choice2;
         System.out.println("You drew " + choice1 + " and "+choice2+"\n"
         + "Your total is "+ sum2);
         
         System.out.println("The dealer has " + dealer1 + " and " + dealer2 + "\n"
         + "Your total is "+ sum1);
         
         if(sum1>sum2){
         System.out.println("DEALER WON! ");    
         }
         else 
             System.out.println("YOU WIN! ");
    }
    
}
