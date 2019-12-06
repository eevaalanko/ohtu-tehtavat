package ohtu.kivipaperisakset;

import java.util.Scanner;

public class PeliFactory {
    private Scanner scanner;

    PeliFactory(Scanner scanner) {
        this.scanner = scanner;
    }

    public KPSTekoaly yksinpeli() {
        Tekoaly tekoaly = new Tekoaly();
        return new KPSTekoaly(scanner, tekoaly);
    }

    public KPSTekoaly pahaYksinpeli(int muistinkoko) {
        TekoalyParannettu tekoaly = new TekoalyParannettu(muistinkoko);
        return new KPSTekoaly(scanner, tekoaly);
    }

    public KPSPelaajaVsPelaaja kaksinpeli() {
        IhmisVastapelaaja ihmisVastapelaaja = new IhmisVastapelaaja(scanner);
        return new KPSPelaajaVsPelaaja(scanner, ihmisVastapelaaja);
    }
}
