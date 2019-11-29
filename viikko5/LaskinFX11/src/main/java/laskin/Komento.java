package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public abstract class Komento {

    public Komento(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        nollaa.disableProperty().set(false);
        undo.disableProperty().set(false);

    }

    public abstract void suorita();

    public abstract void peru();

}
