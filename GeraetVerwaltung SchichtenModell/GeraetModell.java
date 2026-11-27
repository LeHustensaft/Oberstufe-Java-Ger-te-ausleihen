
public class GeraetModell {

    // Eigenschaften
    private String inventarnummer;
    private String bezeichnung;
    private String hersteller;
    private double wert;
    private String geraetetyp;
    private String standort;
    private String zustand;
    private String ausleihstatus;
    private String mitarbeiter;

    // Konstruktor
    public GeraetModell(String inventarnummer, String bezeichnung,
                        String hersteller, double wert, String geraetetyp,
                        String standort, String zustand) {

        this.inventarnummer = inventarnummer;
        this.bezeichnung = bezeichnung;
        this.hersteller = hersteller;
        this.wert = wert;
        this.geraetetyp = geraetetyp;
        this.standort = standort;
        this.zustand = zustand;

        this.ausleihstatus = "verfügbar";
        this.mitarbeiter = "-";
    }

    // Getter
    public String getInventarnummer() {
        return inventarnummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getHersteller() {
        return hersteller;
    }

    public double getWert() {
        return wert;
    }

    public String getGeraetetyp() {
        return geraetetyp;
    }

    public String getStandort() {
        return standort;
    }

    public String getZustand() {
        return zustand;
    }

    public String getAusleihstatus() {
        return ausleihstatus;
    }

    public String getMitarbeiter() {
        return mitarbeiter;
    }

    // Setter
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public void setGeraetetyp(String geraetetyp) {
        this.geraetetyp = geraetetyp;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public void setZustand(String zustand) {
        this.zustand = zustand;
    }

    public void setAusleihstatus(String ausleihstatus) {
        this.ausleihstatus = ausleihstatus;
    }

    public void setMitarbeiter(String mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }
}
