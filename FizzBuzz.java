
public class FizzBuzz {

    public static void main(String[] args) {
        // TODO code application logic here
            // TODO code application logic here
        int i;
        String replace= "Fizz";
        for ( i=1;i<=100;i++ )
        {
            System.out.print(i);
        if ( i%3==0 )
        {
        System.out.print( " Fizz" );
        }
        else if(i%5==0){
        System.out.print(" Buzz");
        }
        else if(i%3==0 && i%5==0){
          System.out.print(" FizzBuzz");  
        }
         System.out.println();
        }
       
    }
}
