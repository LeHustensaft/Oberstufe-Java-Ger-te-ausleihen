
import java.util.ArrayList;

public class GeraetController {

    GeraetService service = new GeraetService();

    // Gerät aufnehmen
    public boolean geraetAufnehmen(GeraetModell geraet) {
        return service.geraetAufnehmen(geraet);
    }

    // Alle Geräte anzeigen
    public ArrayList<GeraetModell> geraeteAnzeigen() {
        return service.geraeteAnzeigen();
    }

    // Gerät suchen
    public GeraetModell geraetSuchen(String inventarnummer) {
        return service.geraetSuchen(inventarnummer);
    }

    // Gerät ausleihen
    public boolean geraetAusleihen(String inventarnummer, String mitarbeiterName) {
        return service.geraetAusleihen(inventarnummer, mitarbeiterName);
    }

    // Gerät zurückgeben
    public boolean geraetZurueckgeben(String inventarnummer) {
        return service.geraetZurueckgeben(inventarnummer);
    }

    // Gerät entfernen
    public boolean geraetEntfernen(String inventarnummer) {
        return service.geraetEntfernen(inventarnummer);
    }
}
