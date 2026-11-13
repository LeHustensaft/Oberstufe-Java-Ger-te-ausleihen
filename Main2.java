
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int auswahl;

        Geraetverwaltung verwaltung = new Geraetverwaltung();

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
                    System.out.println("==============================");

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

                    // Gerät mit Konstruktor erstellen
                    Geraet neuesGeraet = new Geraet(
                        inventarnummer,
                        bezeichnung,
                        hersteller,
                        wert,
                        geraetetyp,
                        standort,
                        zustand
                    );

                    verwaltung.geraetAufnehmen(neuesGeraet);

                    System.out.println("Gerät wurde aufgenommen.");
                    break;

                case 2:
                    System.out.println("==============================");
                    verwaltung.geraeteAnzeigen();
                    break;

                case 3:
                    System.out.print("Inventarnummer eingeben: ");
                    String suchnummer = scanner.nextLine();

                    Geraet gefunden = verwaltung.geraetSuchen(suchnummer);

                    if (gefunden != null) {
                        gefunden.anzeigen();
                    } else {
                        System.out.println("Gerät nicht gefunden.");
                    }
                    break;

                case 4:
                    System.out.print("Inventarnummer eingeben: ");
                    String suchnummerAusleihe = scanner.nextLine();

                    Geraet gefundenesGeraet =
                        verwaltung.geraetSuchen(suchnummerAusleihe);

                    if (gefundenesGeraet != null) {
                        System.out.print("Mitarbeiter eingeben: ");
                        String mitarbeiterName = scanner.nextLine();

                        gefundenesGeraet.ausleihen(mitarbeiterName);
                    } else {
                        System.out.println("Gerät nicht gefunden.");
                    }
                    break;

                case 5:
                    System.out.print("Inventarnummer eingeben: ");
                    String suchnummerRueckgabe = scanner.nextLine();

                    Geraet gefundenesRueckgabeGeraet =
                        verwaltung.geraetSuchen(suchnummerRueckgabe);

                    if (gefundenesRueckgabeGeraet != null) {
                        gefundenesRueckgabeGeraet.zurueckgeben();
                    } else {
                        System.out.println("Gerät nicht gefunden.");
                    }
                    break;

                case 6:
                    System.out.print("Inventarnummer eingeben: ");
                    String suchnummerEntfernen = scanner.nextLine();

                    verwaltung.geraetEntfernen(suchnummerEntfernen);
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
}
