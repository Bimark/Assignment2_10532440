import java.util.Scanner;
public class CountingMachineRevisited {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countf,countt,steps;
        System.out.println("Enter a number for me to count it the way you want it.");
        System.out.print("Count from: ");
        countf=input.nextInt();
        System.out.print("Count to  : ");
        countt=input.nextInt();
        System.out.print("count by  : ");
        steps=input.nextInt();
        for (int i = countf;i<=countt;i=i+steps)
            System.out.print(i + " ");
    }
    
}
