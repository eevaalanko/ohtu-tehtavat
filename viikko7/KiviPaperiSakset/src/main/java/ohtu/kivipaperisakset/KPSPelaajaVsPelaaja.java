package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends Peli {

    private static final Scanner scanner = new Scanner(System.in);

    KPSPelaajaVsPelaaja(Scanner scanner, IhmisVastapelaaja ihmisvastapelaaja) {
        super(scanner, ihmisvastapelaaja);
    }

    @Override
    protected String pelaajanTeksti() {
        return "Toisen pelaajan siirto: ";
    }
}