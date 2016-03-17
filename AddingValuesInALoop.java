import java.util.Scanner;
public class AddingValuesInALoop {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double add=0;
        System.out.println("I will add up the numbers you give me. If you want to stop, type zero(0)");
        System.out.print("Number: ");
        double accpt=input.nextDouble();
        add+=accpt;
        System.out.println("The total so is "+add);
        while(accpt!= 0){
        System.out.print("Number: ");
        accpt=input.nextDouble();
        add+=accpt;
        System.out.println("The total so is "+add);
                
        }
    }
    
}
