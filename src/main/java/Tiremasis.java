public abstract class Tiremasis {
    String vardas;
    int rodiklioReiksme;

    public Tiremasis(int rodiklioReiksme) {
        this.rodiklioReiksme = rodiklioReiksme;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getVardas() {
        return vardas;
    }

    public int getRodiklioReiksme() {
        return rodiklioReiksme;
    }
}
