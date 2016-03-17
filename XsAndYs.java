
public class XsAndYs {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("X        Y\n---------------");
        for(double x = -10;x<=10;x=x+0.5){
           
            System.out.print(x + "\t" );
            double y=x;
            System.out.println(+ Math.pow(y,2));
            
        }
    }
    
}
