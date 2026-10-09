public class Geraet {

    String inventarnummer;
    String bezeichnung;
    String hersteller;
    double wert;
    String geraetetyp;
    String standort;
    String zustand;
    String ausleihstatus;
    String mitarbeiter;


    // Informationen über das Gerät anzeigen
    void anzeigen() {

        System.out.println("Inventarnummer: " + inventarnummer);
        System.out.println("Bezeichnung: " + bezeichnung);
        System.out.println("Hersteller: " + hersteller);
        System.out.println("Wert: " + wert + "\u20AC");
        System.out.println("Gerätetyp: " + geraetetyp);
        System.out.println("Standort: " + standort);
        System.out.println("Zustand: " + zustand);
        System.out.println("Ausleihstatus: " + ausleihstatus);
        System.out.println("Mitarbeiter: " + mitarbeiter);
    }


    // Gerät ausleihen
    void ausleihen(String mitarbeiterName) {

        if (ausleihstatus.equals("verfügbar")) {

            ausleihstatus = "ausgeliehen";
            mitarbeiter = mitarbeiterName;

            System.out.println("Gerät wurde ausgeliehen.");

        } else {

            System.out.println("Das Gerät ist bereits ausgeliehen.");
        }
    }


    // Gerät zurückgeben
    void zurueckgeben() {

        ausleihstatus = "verfügbar";
        mitarbeiter = "-";

        System.out.println("Gerät wurde zurückgegeben.");
    }
}

