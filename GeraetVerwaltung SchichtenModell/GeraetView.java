
import java.util.ArrayList;
import java.util.Scanner;

public class GeraetView {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GeraetController controller = new GeraetController();

        int auswahl;

        do {
            System.out.println();
            System.out.println("==============================");
            System.out.println("       GERÄTEVERWALTUNG");
            System.out.println("==============================");
            System.out.println("1 - Gerät aufnehmen");
            System.out.println("2 - Geräte anzeigen");
            System.out.println("3 - Gerät suchen");
            System.out.println("4 - Gerät ausleihen");
            System.out.println("5 - Gerät zurückgeben");
            System.out.println("6 - Gerät entfernen");
            System.out.println("0 - Beenden");
            System.out.print("Auswahl: ");

            auswahl = scanner.nextInt();
            scanner.nextLine();

            switch (auswahl) {

                case 1:
                    System.out.print("Inventarnummer: ");
                    String inventarnummer = scanner.nextLine();

                    System.out.print("Bezeichnung: ");
                    String bezeichnung = scanner.nextLine();

                    System.out.print("Hersteller: ");
                    String hersteller = scanner.nextLine();

                    System.out.print("Wert: ");
                    double wert = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Gerätetyp: ");
                    String geraetetyp = scanner.nextLine();

                    System.out.print("Standort: ");
                    String standort = scanner.nextLine();

                    System.out.print("Zustand: ");
                    String zustand = scanner.nextLine();

                    GeraetModell neuesGeraet = new GeraetModell(
                        inventarnummer,
                        bezeichnung,
                        hersteller,
                        wert,
                        geraetetyp,
                        standort,
                        zustand
                    );

                    if (controller.geraetAufnehmen(neuesGeraet)) {
                        System.out.println("Gerät wurde aufgenommen.");
                    } else {
                        System.out.println("Inventarnummer existiert bereits.");
                    }
                    break;

                case 2:
                    System.out.println("==============================");

                    ArrayList<GeraetModell> geraete =
                        controller.geraeteAnzeigen();

                    for (GeraetModell geraet : geraete) {
                        zeigeGeraet(geraet);
                        System.out.println("-----------------------------");
                    }
                    break;

                case 3:
                    System.out.print("Inventarnummer eingeben: ");
                    String suchnummer = scanner.nextLine();

                    GeraetModell gefunden =
                        controller.geraetSuchen(suchnummer);

                    if (gefunden != null) {
                        zeigeGeraet(gefunden);
                    } else {
                        System.out.println("Gerät nicht gefunden.");
                    }
                    break;

                case 4:
                    System.out.print("Inventarnummer eingeben: ");
                    String suchnummerAusleihe = scanner.nextLine();

                    GeraetModell gefundenesGeraet =
                        controller.geraetSuchen(suchnummerAusleihe);

                    if (gefundenesGeraet != null) {
                        System.out.print("Mitarbeiter eingeben: ");
                        String mitarbeiterName = scanner.nextLine();

                        if (controller.geraetAusleihen(
                                suchnummerAusleihe, mitarbeiterName)) {
                            System.out.println("Gerät wurde ausgeliehen.");
                        } else {
                            System.out.println("Das Gerät ist bereits ausgeliehen.");
                        }
                    } else {
                        System.out.println("Gerät nicht gefunden.");
                    }
                    break;

                case 5:
                    System.out.print("Inventarnummer eingeben: ");
                    String suchnummerRueckgabe = scanner.nextLine();

                    if (controller.geraetZurueckgeben(suchnummerRueckgabe)) {
                        System.out.println("Gerät wurde zurückgegeben.");
                    } else {
                        System.out.println(
                            "Gerät nicht gefunden oder nicht ausgeliehen."
                        );
                    }
                    break;

                case 6:
                    System.out.print("Inventarnummer eingeben: ");
                    String suchnummerEntfernen = scanner.nextLine();

                    if (controller.geraetEntfernen(suchnummerEntfernen)) {
                        System.out.println("Gerät wurde entfernt.");
                    } else {
                        System.out.println("Gerät nicht gefunden.");
                    }
                    break;

                case 0:
                    System.out.println("Programm beendet.");
                    break;

                default:
                    System.out.println("Ungültige Eingabe.");
            }

        } while (auswahl != 0);

        scanner.close();
    }

    // Gerätedaten anzeigen
    static void zeigeGeraet(GeraetModell geraet) {

        System.out.println("Inventarnummer: " + geraet.getInventarnummer());
        System.out.println("Bezeichnung: " + geraet.getBezeichnung());
        System.out.println("Hersteller: " + geraet.getHersteller());
        System.out.println("Wert: " + geraet.getWert() + "\u20AC");
        System.out.println("Gerätetyp: " + geraet.getGeraetetyp());
        System.out.println("Standort: " + geraet.getStandort());
        System.out.println("Zustand: " + geraet.getZustand());
        System.out.println("Ausleihstatus: " + geraet.getAusleihstatus());
        System.out.println("Mitarbeiter: " + geraet.getMitarbeiter());
    }
}
