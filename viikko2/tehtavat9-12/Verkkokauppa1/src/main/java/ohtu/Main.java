package ohtu;

import ohtu.verkkokauppa.Kauppa;
import ohtu.verkkokauppa.VKKirjanpito;

public class Main {

    public static void main(String[] args) {
        Kauppa kauppa = new Kauppa(new ohtu.verkkokauppa.VKVarasto(new ohtu.verkkokauppa.VKKirjanpito()),
                 new ohtu.verkkokauppa.VKPankki(new ohtu.verkkokauppa.VKKirjanpito()),
                new ohtu.verkkokauppa.VKViitegeneraattori());

        // kauppa hoitaa yhden asiakkaan kerrallaan seuraavaan tapaan:
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");

        // seuraava asiakas
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }

        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");

        // kirjanpito
        for (String tapahtuma : new VKKirjanpito().getTapahtumat()) {
            System.out.println(tapahtuma);
        }
    }
}
