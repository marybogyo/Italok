package modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class Asztal implements Serializable {
    
    private ArrayList<Ital> italok;
    
    public Asztal() {
        italok = new ArrayList<>();
        
        italok.add(new Sor(UUID.randomUUID(), 60, "Sör-1", "5%", Ital.Cimke.HAGYOMANYOS));
        italok.add(new Sor(UUID.randomUUID(), 50, "Sör-2", "9%", Ital.Cimke.REGI));
        italok.add(new Sor(UUID.randomUUID(), 55, "Sör-3", "3,9%", Ital.Cimke.UJ));
        italok.add(new Bor("édes", "Tokai", "11%", Ital.Cimke.REGI));
        italok.add(new Bor("száraz", "Kékfrankos", "14%", Ital.Cimke.HAGYOMANYOS));
        italok.add(new Bor("száraz", "Bikavér", "9%", Ital.Cimke.UJ));
    }

    public ArrayList<Ital> getItalok() {
        return italok;
    }
    

    
}
