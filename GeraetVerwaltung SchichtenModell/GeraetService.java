
public class GeraetService {

    GeraetRepo repo = new GeraetRepo();

    // Gerät aufnehmen
    boolean geraetAufnehmen(GeraetModell geraet) {

        if (repo.geraetSuchen(geraet.getInventarnummer()) != null) {
            return false;
        }

        repo.geraetAufnehmen(geraet);
        return true;
    }

    // Alle Geräte abrufen
    public java.util.ArrayList<GeraetModell> geraeteAnzeigen() {
        return repo.geraeteAnzeigen();
    }

    // Gerät suchen
    GeraetModell geraetSuchen(String inventarnummer) {
        return repo.geraetSuchen(inventarnummer);
    }

    // Gerät ausleihen
    boolean geraetAusleihen(String inventarnummer, String mitarbeiterName) {

        GeraetModell geraet = repo.geraetSuchen(inventarnummer);

        if (geraet != null && geraet.getAusleihstatus().equals("verfügbar")) {

            geraet.setAusleihstatus("ausgeliehen");
            geraet.setMitarbeiter(mitarbeiterName);

            return true;
        }

        return false;
    }

    // Gerät zurückgeben
    boolean geraetZurueckgeben(String inventarnummer) {

        GeraetModell geraet = repo.geraetSuchen(inventarnummer);

        if (geraet != null && geraet.getAusleihstatus().equals("ausgeliehen")) {

            geraet.setAusleihstatus("verfügbar");
            geraet.setMitarbeiter("-");

            return true;
        }

        return false;
    }

    // Gerät entfernen
    boolean geraetEntfernen(String inventarnummer) {

        GeraetModell geraet = repo.geraetSuchen(inventarnummer);

        if (geraet != null) {

            repo.geraetEntfernen(geraet);
            return true;
        }

        return false;
    }
}
