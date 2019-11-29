package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Summa extends Komento {
    private final TextField tuloskentta;
    private final TextField syotekentta;

    private final Sovelluslogiikka sovellus;
    private String viimeArvo;




    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta,  nollaa, undo, sovellus);
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.sovellus = sovellus;
    }

    @Override
    public void suorita() {
        setViimeArvo(tuloskentta.getText());
        sovellus.plus(Integer.parseInt(syotekentta.getText()));
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }

    @Override
    public void peru() {
        tuloskentta.setText(getViimeArvo());

    }

    public String getViimeArvo() {
        return viimeArvo;
    }

    public void setViimeArvo(String viimeArvo) {
        this.viimeArvo = viimeArvo;
    }
}




