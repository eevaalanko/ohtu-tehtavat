package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Peli {
    private Tuomari tuomari;
    private Vastapelaaja vastapelaaja;
    private Scanner scanner;


    Peli(Scanner scanner, Vastapelaaja vastapelaaja) {
        this.tuomari = new Tuomari();
        this.vastapelaaja = vastapelaaja;
        this.scanner = scanner;
    }

    protected String pelaajanTeksti() {
        return null;
    }

    void pelaa() {

        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();
        String tokanSiirto;

        tokanSiirto = vastapelaaja.annaSiirto();
        System.out.println(pelaajanTeksti() + tokanSiirto);


        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();

            tokanSiirto = vastapelaaja.annaSiirto();
            System.out.println(pelaajanTeksti() + tokanSiirto);
            vastapelaaja.asetaSiirto(ekanSiirto);
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }


    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}