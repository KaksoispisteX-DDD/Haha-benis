import java.util.Scanner;


/**
 * niaky_program
 */
public class niaky_program {
    Scanner vstup = new Scanner(System.in);
    String zakladna_premenna = vstup.nextLine();
    public void hlavny(){

    
    if (zakladna_premenna.equals("pyramida")){
        System.out.println("Pyramidka");


    }
    else {
        System.out.println("Nedal si správne heslo");

    }



    }
    public static void main(String[] args) throws Exception{

        niaky_program a=new niaky_program();
        a.hlavny();

        
        
    }

}