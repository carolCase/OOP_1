import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    
    public static void main(String[] args) throws Exception {
        
        Random random=new Random();
        int randomNumber=random.nextInt(100)+1;
       
         System.out.println("välkommen till Gissa ett nummer spelet");
         System.out.println("Gissa ett tal mellan 1 till 100");
         Scanner scanner = new Scanner(System.in); 
            int tryCount=0;


      while(true) {
             int gissningsTal= scanner.nextInt();
             tryCount++;

            if (gissningsTal==randomNumber){
               System.out.println("Du gissade rätt!!!");
               System.out.println("Du gissade rätt på "+ tryCount+" försök");
               break;
            }
            else if (gissningsTal<randomNumber){
               System.out.println("fel! talet är större");
            }
            else if (gissningsTal>randomNumber){
               System.out.println("nej! talet är mindre");
            }
            scanner.close();
    
      }
         
            }
}
