
package ohtu.kivipaperisakset;

// "Muistava tekoäly"

public class TekoalyParannettu extends Tekoaly implements Vastapelaaja {
  private String[] muisti;
  private int vapaaMuistiIndeksi;

  TekoalyParannettu(int muistinKoko) {
    muisti = new String[muistinKoko];
    vapaaMuistiIndeksi = 0;
  }

  public void asetaSiirto(String siirto) {
    // jos muisti täyttyy, unohdetaan viimeinen alkio
    if(vapaaMuistiIndeksi == muisti.length) {
      if (muisti.length - 1 >= 0) System.arraycopy(muisti, 1, muisti, 0, muisti.length - 1);

      vapaaMuistiIndeksi--;
    }

    muisti[vapaaMuistiIndeksi] = siirto;
    vapaaMuistiIndeksi++;
  }


  public String annaSiirto() {
    if(vapaaMuistiIndeksi == 0 || vapaaMuistiIndeksi == 1) {
      return "k";
    }

    String viimeisinSiirto = muisti[vapaaMuistiIndeksi - 1];

    int k = 0;
    int p = 0;
    int s = 0;


    for(int i = 0; i < vapaaMuistiIndeksi - 1; i++) {
      if(viimeisinSiirto.equals(muisti[i])) {
        String seuraava = muisti[i+1];

        if("k".equals(seuraava)) {
          k++;
        }
        else if("p".equals(seuraava)) {
          p++;
        }
        else {
          s++;
        }
      }
    }


    // Tehdään siirron valinta esimerkiksi seuraavasti;
    // - jos kiviä eniten, annetaan aina paperi
    // - jos papereita eniten, annetaan aina sakset
    // muulloin annetaan aina kivi
    if(k > p && k > s) {
      return "p";
    }
    else if (p > k && p > s) {
      return "s";
    }
    else {
      return "k";
    }

    // Tehokkaampiakin tapoja löytyy, mutta niistä lisää
    // Johdatus Tekoälyyn kurssilla!
  }
}