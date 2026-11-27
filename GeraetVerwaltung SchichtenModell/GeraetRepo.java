
import java.util.ArrayList;

public class GeraetRepo {

    ArrayList<GeraetModell> geraete = new ArrayList<>();

    // Gerät aufnehmen
    void geraetAufnehmen(GeraetModell geraet) {
        geraete.add(geraet);
    }

    // Alle Geräte zurückgeben
    ArrayList<GeraetModell> geraeteAnzeigen() {
        return geraete;
    }

    // Gerät über Inventarnummer suchen
    GeraetModell geraetSuchen(String inventarnummer) {

        for (GeraetModell geraet : geraete) {

            if (geraet.getInventarnummer().equals(inventarnummer)) {
                return geraet;
            }
        }

        return null;
    }

    // Gerät entfernen
    void geraetEntfernen(GeraetModell geraet) {
        geraete.remove(geraet);
    }
}
