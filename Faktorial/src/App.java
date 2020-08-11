

import java.util.Scanner;

public class App {
    Scanner novy = new Scanner(System.in);
    int cislo = 0;
    long vysledok = 1;
    public void faktorial(){
        for(int i=2;i<=cislo;i++){
            vysledok = vysledok*i;



        }
        System.out.println(vysledok);




    }






    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
