package laskin;

import javafx.scene.control.TextField;

public class Nollaa extends Komento {
    private final TextField tuloskentta;

    private final Sovelluslogiikka sovellus;
    private String viimeArvo;

    public Nollaa(TextField tuloskentta, TextField syotekentta, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta,  sovellus);
        this.tuloskentta = tuloskentta;

        this.sovellus = sovellus;
    }

    @Override
    public void suorita() {
        setViimeArvo(tuloskentta.getText());
        sovellus.nollaa();
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
