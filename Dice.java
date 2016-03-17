import java.util.Random;
public class Dice {

    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int first = 1 + r.nextInt(6);
        int second = 1 + r.nextInt(6);
        int sum= first+second;
        System.out.println("HERE COMES THE DICE! \n ");
        System.out.println("ROLL #1: "+first);
        System.out.println("ROLL #2: "+second);
        System.out.println("the total is "+sum);
                
    }
    
}
