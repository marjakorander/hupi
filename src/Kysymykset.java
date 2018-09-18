public class Kysymykset {

    private int oikeaVastaus;
    private String kysymysTeksti, vaihtoehtoA, vaihtoehtoB, vaihtoehtoC, vaihtoehtoD;
    String prompt;
    String vastaus;


    public Kysymykset(String kysymys, String vastausA, String vastausB, String vastausC, String vastausoD, int vastattuOikein) {
        this.kysymysTeksti = kysymys;
        this.vaihtoehtoA = vastausA;
        this.vaihtoehtoB = vastausB;
        this.vaihtoehtoC = vastausC;
        this.vaihtoehtoD = vastausoD;
        this.oikeaVastaus = vastattuOikein;
    }

    public Kysymykset(String prompt, String vastaus) {
        this.prompt = prompt;
        this.vastaus = vastaus;

    }

    boolean tarkistaVastaus(int arvaus, int oikeaArvaus) {
        return (arvaus == oikeaArvaus);
    }


    @Override


    public String toString() {
        return kysymysTeksti +
                vaihtoehtoA +
                vaihtoehtoB +
                vaihtoehtoC +
                vaihtoehtoD;
    }
}
