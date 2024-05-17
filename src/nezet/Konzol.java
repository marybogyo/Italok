
package nezet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import modell.Asztal;
import modell.Bor;
import modell.Ital;
import modell.Sor;
import modell.SorbarakComparatore;


public class Konzol {
   private ArrayList<Sor> sorok;
   private ArrayList<Bor> borok;
   private Asztal asztal;
   
   public Konzol(){
       sorok = new ArrayList<>();
       borok = new ArrayList<>();
       asztal = new Asztal();
   }
   
   public void feladatok(){
       italokAsztalon();
       italokFajlban();
       statisztika();
   }

    private void italokAsztalon() {
        ArrayList<Ital> italok = asztal .getItalok();

        for (Ital ital : italok) {
             
            if(ital instanceof Sor){
                sorok.add((Sor) ital);
            }else if(ital instanceof  Bor){
                borok.add((Bor)ital);
            }
           
           System.out.println(ital);
           
        }
        
        Collections.sort(sorok, new SorbarakComparatore());

        for (Sor sor : sorok) {
            System.out.println(sor);
        }
   }

    private void italokFajlban() {
       try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("adar.ser"))){
           ous.writeObject(asztal);
           System.out.println("Italok kiirva a fajlba: adat.ser");
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Konzol.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Konzol.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       }

    private void statisztika() {
        //Számlálók a cukortartalom szerinti borokhoz
        HashMap<String, ArrayList<String>> cukortartalomBorok = new HashMap<>();
        for (Bor bor : borok) {
            ArrayList<String> borNevek = cukortartalomBorok.getOrDefault(bor.getCukorTartalom(), new ArrayList<>());
            borNevek.add(bor.getNev());
            cukortartalomBorok.put(bor.getCukorTartalom(), borNevek);
        }
        for (String cukorTartalom : cukortartalomBorok.keySet()) {
            System.out.println(cukorTartalom + "cukortartalmú borok");
            for (String bornev : cukortartalomBorok.get(cukorTartalom)) {
                System.out.println("- " + bornev);
            }
            System.out.println();
        }
   }
}
