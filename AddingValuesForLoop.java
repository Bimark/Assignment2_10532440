import java.util.Scanner;
public class AddingValuesForLoop {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int accpt=input.nextInt();
        int sum=0;
        for(int r=1;r<=accpt;r++ )
        {
            System.out.print(r + " ");
            
            sum = sum + r;
        }
        System.out.println("The sum is "+ sum);
    }
    
}
