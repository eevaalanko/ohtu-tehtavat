
package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class VKKirjanpito implements Kirjanpito {

    private ArrayList<String> tapahtumat;

    public VKKirjanpito() {
        tapahtumat = new ArrayList<String>();
    }

    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    @Override
    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }
}
