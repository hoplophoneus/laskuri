package laskuri;

public class Laskuri {

    /* laskuriolion kentan arvoa voi kasvattaa yhdella kutsumalla metodia
     lisaa(). Arvoa voi tarkastella ja sen voi nollata.                  */
    private int tapahtumia;
    
    /* MUOKATTU GITHUBISSA... */
    
    public Laskuri(int alkuarvo) {
        // konstruktori, kuormitettu. Alkuarvon tulee olla >= 0.
        if (alkuarvo < 0) {
            return;
        }
        this.tapahtumia = alkuarvo;
    }

    public Laskuri() {
        this.tapahtumia = 0;
    }

    public void lisaa() {
        this.tapahtumia = this.tapahtumia + 1;
    }

    public void lisaa(int lisays) {
        this.tapahtumia = this.tapahtumia + lisays;
    }

    public int lukema() {
        return this.tapahtumia;
    }

    public void nollaa() {
        this.tapahtumia = 0;
    }

    public String toString() {
        return "Lukema: " + this.tapahtumia;
    }

}
