import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner lukija = new Scanner(System.in);
        Peli1 ekaPeli = new Peli1();
        Peli2 tokaPeli = new Peli2();


        while (true) {
            System.out.println("Valitse peli: eka vai toka ");
            String valittuPeli = lukija.nextLine();

            if (valittuPeli.equals("eka")) {
                ekaPeli.pelaa();

            } else if (valittuPeli.equals("toka"))  {
                tokaPeli.pelaa2();
            } else {
                System.out.println("Väärin meni! Pelaaminen loppui tähän, tee jotain muuta!");
                break;
            }
        }



    }
}
