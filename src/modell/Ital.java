
package modell;

import java.io.Serializable;


public class Ital implements Serializable{
public enum Cimke {REGI, UJ, HAGYOMANYOS};
private String nev, fok;
private Cimke cimke;

    public Ital(String nev, String fok, Cimke cimke) {
        this.nev = nev;
        if(!fok.contains("%")){
            throw new NincsszazalekException("Az alkohol értékben nincs % jel!");
        }
        this.fok = fok;
        this.cimke = cimke;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getFok() {
        return fok;
    }

    public void setFok(String fok) {
        if(!fok.matches("\\d+(\\.\\d+)?%")){
            this.fok = fok+".0%";
        }else{
        this.fok = fok;}
    }

    public Cimke getCimke() {
        return cimke;
    }

    public void setCimke(Cimke cimke) {
        this.cimke = cimke;
    }
  

    
}
