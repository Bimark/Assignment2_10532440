import java.util.Scanner;
public class CollatzSequence {
public void col(int u){
    int s;
            if (u%2==0)
            {
                 s = (u/2);
                 col(u-1);
                  System.out.print(u + " " + s + " ");
            }
            else {
                s=(u*3) + 1;
                col(u-1);
                 System.out.print(u + " " + s +" ");
            }
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CollatzSequence use = new CollatzSequence();
        System.out.println("Enter any natural number: ");
        int n = input.nextInt();
        int s;
        use.col(n);
      /*  while(true)
        {
            if (n%2==0)
            {
                 s = (n/2);
            }
            else 
                s=(n*3) + 1; 
        System.out.print(n+" "+s+" ");
        }*/
    }
    
}
