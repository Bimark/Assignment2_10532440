import java.util.Random;
//import java.util.Scanner;
public class FortuneCookies {

    public static void main(String[] args) {
  //  Scanner input = new Scanner (System.in);
    Random r = new Random();
    int generate [ ] = new int [6];
    System.out.println("Fortune cookie says:\"You will find happiness with a new love\". ");
    System.out.print("Fortune says:\"Stay with your wife\". \n");
    for (int y = 0 ; y < generate.length; y++)
		{
			generate[y]=1+ r.nextInt(154);
			System. out. print(generate[y] + " - ");
			//Show(render[r]);
		}
           System.out.println("");
    }
    
}
