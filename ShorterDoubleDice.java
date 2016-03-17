import java.util.Random;
public class ShorterDoubleDice {

    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
       
         int first=1 + r.nextInt(6);
        int second=1 + r.nextInt(6);
        int sum=first+second;
        System.out.println("HERE COMES THE DICE\n");
        do{
         System.out.println("Roll #1: "+first);
         System.out.println("roll #2: "+second);
         System.out.println("The total is "+sum);
        }
        while(first !=second );
        
    
    
  }
}