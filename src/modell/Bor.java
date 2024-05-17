
package modell;


public class Bor extends Ital{
    private String cukorTartalom;

    public Bor(String cukorTartalom, String nev, String fok, Cimke cimke) {
        super(nev, fok, cimke);
        this.cukorTartalom = cukorTartalom;
    }

    public String getCukorTartalom() {
        return cukorTartalom;
    }

    @Override
    public String toString() {
        return "Bor{" + "cukorTartalom=" + cukorTartalom + '}';
    }
    
}
