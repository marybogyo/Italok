
package modell;

import java.util.Random;
import java.util.UUID;


public class Sor extends Ital{
    private UUID id;
    private int arany;

    public Sor(UUID id, int arany, String nev, String fok, Cimke cimke) {
        super(nev, fok, cimke);
        this.id = id;
        if(arany == 0){
            Random r = new Random();
            this.arany = r.nextInt(20)+50;
        }
        else this.arany = arany;
        
    }


    public int getArany() {
        return arany;
    }

    @Override
    public String toString() {
        return "Sor{" + "id=" + id + ", arany=" + arany + '}';
    }   
}
