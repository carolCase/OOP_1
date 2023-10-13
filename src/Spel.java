import java.util.Random;
import java.util.Scanner;

public class Spel {
    
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    String svar="ja";
     int tries=0;
       
      while (svar.equals("ja")){
           Random random=new Random();
           int randomNumber=random.nextInt(100)+1; //100+1 efetersom den börjar räkna från 0.
           int gissningsTal=0;
          
      while (gissningsTal!=randomNumber){
      //slå på om du ska testa-->   System.out.println("slump numret är:"+randomNumber);
        System.out.println("Gissa ett tal mellan 1 till 100");
       
    try {  //try and catch i blocket där användaren kan skriva fel input
            gissningsTal = scanner.nextInt();
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
       catch (java.util.InputMismatchException e) {
             System.out.println("Du kan bara skriva ett tal med siffror");
             scanner.next();
              }
    }
  }  
             System.out.println("Tack för den här gången");
             scanner.close();
    }
}