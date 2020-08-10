
package kaksoispiste;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;


public class Kaksoispiste {
    Scanner meno=new Scanner(System.in);
    String tvoje_meno="";

public void fajinovica() {
    for(;;){
        tvoje_meno=meno.nextLine();

        if (tvoje_meno.equals("Patrik")){
            System.out.println(tvoje_meno+ " fess čavo");
    
    
    
    
        }
        else {System.out.println(tvoje_meno+ " bruh");}
    }








}    

     
    public static void main(String[] args) {
        Kaksoispiste a = new Kaksoispiste();
        a.fajinovica();

        
    }
    
}
