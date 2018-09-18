import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Peli1 {

    public void pelaa() {
        List<Kysymykset> kysymyslista = new ArrayList<>();

        Kysymykset k1 = new Kysymykset("Mikä väittämistä on väärin?\n", "1. Luokka määrittelee jonkin toiminnallisuuden.\n", "2. Luokkien välille voidaan muodostaa ns. luokkahierarkioita ns. periytymisen avulla.\n", "3. Luokka toimii aina ja kaikkialla.\n", "4. Luokat ovat tyyppejä siinä kuin jo tutuksi tulleet int, double, boolean ja String.", 2);

        kysymyslista.add(k1);

        Kysymykset k2 = new Kysymykset("Mikä seuraavista ei ole primitiivityyppi\n", "1. int\n", "2. String\n", "3. short\n", "4. double", 2);

        kysymyslista.add(k2);

        Kysymykset k3 = new Kysymykset("Mikä väittämistä on väärin?\n", "1. Luokka määrittelee jonkin toiminnallisuuden.\n", "2. Luokkien välille voidaan muodostaa ns. luokkahierarkioita ns. periytymisen avulla.\n", "3. Luokka toimii aina ja kaikkialla ilman konstruktosia tai settereitä ja gettereitä.\n", "4. Luokat ovat tyyppejä siinä kuin jo tutuksi tulleet int, double, boolean ja String.", 2);

        kysymyslista.add(k3);

        Kysymykset k4 = new Kysymykset("Mikä väittämistä on väärin?\n", "1. Luokka määrittelee jonkin toiminnallisuuden.\n", "2. Luokkien välille voidaan muodostaa ns. luokkahierarkioita ns. periytymisen avulla.\n", "3. Luokka toimii aina ja kaikkialla ilman konstruktosia tai settereitä ja gettereitä.\n", "4. Luokat ovat tyyppejä siinä kuin jo tutuksi tulleet int, double, boolean ja String.", 2);


        System.out.println("**************");


        System.out.println(k1);

        Scanner lukija = new Scanner(System.in);

        peliLooppi(lukija);


        System.out.println();
        System.out.println("**************");
        System.out.println(k2);


        int vastaus2 = lukija.nextInt();

        if (vastaus2 == 2) {

            System.out.println("Oikein");
        } else {
            System.out.println("Väärin");
        }

        System.out.println("**************");
        System.out.println(k3);

    }

    private void peliLooppi(Scanner lukija) {
        while (true) {
            System.out.print("Anna vastaus: ");
            int vastaus = lukija.nextInt();

            if (vastaus == 3) {
                System.out.println("Oikein");
                break;
            } else {
                System.out.println("Väärin");
            }
        }
    }
}
