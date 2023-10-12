import java.util.Random;
import java.util.Scanner;

public class Spel {
    
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    String svar="ja";

    while (svar.equals("ja")){
           Random random=new Random();
           int randomNumber=random.nextInt(100)+1;
           int gissningsTal=0;
          
      while (gissningsTal!=randomNumber)
      {
        System.out.println("Gissa ett tal mellan 1 till 100");
        gissningsTal= scanner.nextInt();
         int tries=0;
         tries++;

            if (gissningsTal==randomNumber){
                System.out.println("Du gissade rätt!!!");
                System.out.println("Du gissade rätt på "+ tries +" försök");
                System.out.println("Vill du fortsätta spela?(ja/nej)");
                svar=scanner.next();
             }
               else if (gissningsTal<randomNumber){
                System.out.println("fel! talet är större");
               }
               else if (gissningsTal>randomNumber){
                System.out.println("nej! talet är mindre");
             }

    
    
    }



    }


scanner.close();


}






}
