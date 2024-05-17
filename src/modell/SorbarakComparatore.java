
package modell;

import java.util.Comparator;

public class SorbarakComparatore implements Comparator<Sor>{

    @Override
    public int compare(Sor o1, Sor o2) {
    return  o1.getArany() - o2.getArany();
    } 
}
