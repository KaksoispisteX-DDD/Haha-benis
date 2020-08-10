
package kaksoispiste;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;


public class Kaksoispiste {
    Scanner meno=new Scanner(System.in);
    String tvoje_meno="";

public void fajinovica() {
    for(int i=0; i<10; i++){
        tvoje_meno=meno.nextLine();

        if (tvoje_meno.equals("Patrik")){
            System.out.println(tvoje_meno+ " fess čavo");
        }
        
        else if(tvoje_meno.equals("Yegor")){
            System.out.println(tvoje_meno+ " je špion");
        }

        else {System.out.println(tvoje_meno+ " bruh");}
    }








}    

     
    public static void main(String[] args) {
        Kaksoispiste a = new Kaksoispiste();
        a.fajinovica();

        
    }
    
}
