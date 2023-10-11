import java.util.Random;
import java.util.Scanner;

public class GuessGame {

            
 
   
    public static void main(String[] args) {
           int tryCount=0;
            String svar;
            int gissningsTal;
           Random random=new Random();
           int randomNumber=random.nextInt(100)+1;
           Scanner scanner = new Scanner(System.in); 
          System.out.println(randomNumber);
          System.out.println("välkommen till Gissa ett nummer spelet");
      
      do{  
        System.out.println("Gissa ett tal mellan 1 till 100");
        
           gissningsTal=scanner.nextInt();

       
              
       if (gissningsTal==randomNumber){
               System.out.println("Du gissade rätt!!!");
               gissningsTal= scanner.nextInt();
                tryCount++;
               System.out.println("Du gissade rätt på "+ tryCount+" försök");
                System.out.println("Vill du fortsätta?(ja/nej)");
             svar=scanner.nextLine();

            
               
            }
      else if (gissningsTal<randomNumber){
               System.out.println("fel! talet är större");
            }
    else if (gissningsTal>randomNumber){
               System.out.println("nej! talet är mindre");
            }
         }
         
           while(true);
          
       
           
         
           
               
            
         

            }
         }
      