import java.util.ArrayList;

public class Geraetverwaltung {
  ArrayList<Geraet> geraete = new ArrayList<>();

// Gerät aufnehmen

   void geraetAufnehmen(Geraet geraet) {
    geraete.add(geraet);
    }

// Alle Geräte anzeigen

   void geraeteAnzeigen() {
     for (Geraet geraet : geraete) {
      geraet.anzeigen();
      System.out.println("-----------------------------");
     }

   }   
// Gerät über Inventarnummer suchen

   Geraet geraetSuchen(String inventarnummer) {
     for (Geraet geraet : geraete) {
      if (geraet.inventarnummer.equals(inventarnummer)) {
      return geraet;
      }
     }
     
     return null;
   }
   
   // Gerät über Inventarnummer entfernen

void geraetEntfernen(String inventarnummer) {
    Geraet geraet = geraetSuchen(inventarnummer);

    if (geraet != null) {
        geraete.remove(geraet);
        System.out.println("Gerät wurde entfernt.");
    } else {
        System.out.println("Gerät nicht gefunden.");
    }
}
}