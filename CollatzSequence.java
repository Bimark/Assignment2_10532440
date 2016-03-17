import java.util.Scanner;
public class CollatzSequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // CollatzSequence use = new CollatzSequence();
        System.out.println("Enter any natural number: ");
        int n = input.nextInt();
        int s;
        while(true)
        {
            if (n%2==0)
            {
                 s = (n/2);
            }
            else {
                s=(n*3) + 1; 
         System.out.print(n+"  "+ s +" ");
            }
        }
        //System.out.print(n+" "+ s +" ");
    }
    
}
