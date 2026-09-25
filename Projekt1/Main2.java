import java.util.Scanner;
import java.util.ArrayList;

public class Main2 {
       public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       int auswahl;
       
       // Erstes Gerät erstellen
       Geraet geraet1 = new Geraet();
       geraet1.inventarnummer = "NB-001";
       geraet1.bezeichnung = "Notebook";
       geraet1.hersteller = "Lenovo";
       geraet1.wert = 800.00;
       geraet1.geraetetyp = "Notebook";
       geraet1.standort = "Büro 1";
       geraet1.zustand = "Gut";
       geraet1.ausleihstatus = "verfügbar";
       geraet1.mitarbeiter = "-";
       
       // Zweites Gerät erstellen
       
       Geraet geraet2 = new Geraet();
       geraet2.inventarnummer = "NB-002";
       geraet2.bezeichnung = "Notebook";
       geraet2.hersteller = "Dell";
       geraet2.wert = 950.00;
       geraet2.geraetetyp = "Notebook";
       geraet2.standort = "Büro 2";
       geraet2.zustand = "Gut";
       geraet2.ausleihstatus = "verfügbar";
       geraet2.mitarbeiter = "-";
       
  
       // Geräteverwaltung erstellen
       
       Geraetverwaltung verwaltung = new Geraetverwaltung();
       
       
       do {
       System.out.println();
       System.out.println("==============================");
       System.out.println(" GERÄTEVERWALTUNG");
       System.out.println("==============================");
       System.out.println("1 - Gerät aufnehmen");
       System.out.println("2 - Geräte anzeigen");
       System.out.println("3 - Gerät suchen");
       System.out.println("4 - Gerät ausleihen");
       System.out.println("5 - Gerät zurückgeben");
       System.out.println("0 - Beenden");
       System.out.print("Auswahl: ");
       auswahl = scanner.nextInt();
       scanner.nextLine();
       
       switch (auswahl) {
       
       case 1:
          // später
           break;
       case 2:
          verwaltung.geraeteAnzeigen();
          break;
       case 3:
          // später
          break;
       case 4:
          // später
          break;
       case 5:
          // später
          break;
       case 0:
          System.out.println("Programm beendet.");
          break;
       default:
          System.out.println("Ungültige Eingabe.");
       }
       } while (auswahl != 0);

       
       // Geräte aufnehmen
       
       verwaltung.geraetAufnehmen(geraet1);
       verwaltung.geraetAufnehmen(geraet2);
       
       // Alle Geräte anzeigen
       
       System.out.println("=== ALLE GERÄTE ===");
       verwaltung.geraeteAnzeigen();
       
       // Gerät ausleihen
       
       System.out.println();
       System.out.println("=== AUSLEIHE ===");
       geraet1.ausleihen("Max Mustermann");
       geraet1.anzeigen();
                                                       
       // Zweite Ausleihe testen
       
       System.out.println("-----------------------------");
       System.out.println();
       System.out.println("=== ZWEITE AUSLEIHE ===");
       geraet1.ausleihen("Anna Müller");
       
       // Rückgabe
       
       System.out.println("-----------------------------");
       System.out.println();
       System.out.println("=== RÜCKGABE ===");
       geraet1.zurueckgeben();
       geraet1.anzeigen();
       System.out.println("-----------------------------");
       }
}
