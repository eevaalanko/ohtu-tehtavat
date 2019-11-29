package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {
    private final TextField tuloskentta;

    private final Button nollaa;
    private final Button undo;
    private final Sovelluslogiikka sovellus;

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
        this.tuloskentta = tuloskentta;

        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    @Override
    public void suorita() {
        sovellus.nollaa();
        System.out.println("tulos on nollauksessa:   " + sovellus.tulos());
        tuloskentta.setText(Integer.toString(sovellus.tulos()));


    }

    @Override
    public void peru() {

    }
}
