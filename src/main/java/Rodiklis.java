public abstract class Rodiklis {
    private String pavadinimas,kodas,aprasymas,galimaLiga;
    int min,max;

    public Rodiklis(String pavadinimas, String kodas, String aprasymas, String galimaLiga, int min, int max) {
        this.pavadinimas = pavadinimas;
        this.kodas = kodas;
        this.aprasymas = aprasymas;
        this.galimaLiga = galimaLiga;
        this.min = min;
        this.max = max;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public String getKodas() {
        return kodas;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public String getGalimaLiga() {
        return galimaLiga;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
