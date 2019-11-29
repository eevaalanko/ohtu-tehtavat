package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Erotus extends Komento {
    private final TextField tuloskentta;
    private final TextField syotekentta;
    private final Button nollaa;
    private final Button undo;
    private final Sovelluslogiikka sovellus;
    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    @Override
    public void suorita() {
        sovellus.miinus(Integer.parseInt(syotekentta.getText()));
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }

    @Override
    public void peru() {

    }
}
