import java.util.Scanner;
public class RightTrinagleChecker {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int side1,side2,side3;
        System.out.println("Enter three integers: ");
        System.out.print("Side 1: ");
        side1 = input.nextInt();
       
        System.out.print("Side 2: ");
        side2 = input.nextInt();
        while (true)
        {
         if(side2<side1){
            System.out.print(side2 + " is smaller than " + side1 + ". Try again.");
            side2 = input.nextInt();
            }
            System.out.print("Side 3: ");
            side3 = input.nextInt();
         if(side3<side2)
             {
             System.out.print(side3 + " is smaller than " + side2 + ". Try again.");
            System.out.print("Side 3: ");
            side3 = input.nextInt(); 
             }     
         break;
        }
        System.out.print("");
            
    }
    
}
