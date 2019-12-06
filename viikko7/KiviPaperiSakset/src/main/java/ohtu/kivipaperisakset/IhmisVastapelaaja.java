package ohtu.kivipaperisakset;

import java.util.Scanner;

public class IhmisVastapelaaja implements Vastapelaaja {

    private Scanner scanner;

    IhmisVastapelaaja(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public String annaSiirto() {
        return scanner.nextLine();
    }

    @Override
    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään
    }
}
