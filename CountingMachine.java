import java.util.Scanner;
public class CountingMachine {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and I will cpunt it from zero(0) to the number you entered \n"
                + "Count to: ");
        int count=input.nextInt();
        for (int i = 0;i<=count;i++){
            System.out.print(i+ " ");
        }
    }
    
}
