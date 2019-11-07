package ohtu.verkkokauppa;

import java.util.HashMap;

public interface Varasto {
    Tuote haeTuote(int id);

    HashMap<Tuote, Integer> saldot = null;

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);

    void alustaTuotteet();
}
