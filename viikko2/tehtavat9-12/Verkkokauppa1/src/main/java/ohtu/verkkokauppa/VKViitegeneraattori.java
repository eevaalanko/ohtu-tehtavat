package ohtu.verkkokauppa;

public class VKViitegeneraattori implements Viitegeneraattori {

    private int seuraava;

    public VKViitegeneraattori(){
        seuraava = 1;
    }

    @Override
    public int uusi(){
        return seuraava++;
    }
}
