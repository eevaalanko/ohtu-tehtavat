package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends Peli {

    KPSTekoaly(Scanner scanner, Tekoaly tekoaly) {
        super(scanner, tekoaly);
    }

    @Override
    protected String pelaajanTeksti() {
        return "Tietokone valitsi :";
    }
}