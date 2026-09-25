 import java.util.ArrayList;
 
public class Geraetverwaltung {
  ArrayList<Geraet> geraete = new ArrayList<>();
  
  void geraetAufnehmen(Geraet geraet) {
  geraete.add(geraet);
}
  void geraeteAnzeigen() {
    for (Geraet geraet : geraete) {
      geraet.anzeigen();
      System.out.println("-----------------------------");
    }
  }
}

