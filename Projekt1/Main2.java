import java.util.Scanner;

public class Main2 {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int auswahl;
   
   // Erstes Gerät erstellen
   
   //Geraet geraet1 = new Geraet();
   //geraet1.inventarnummer = "NB-001";
   //geraet1.bezeichnung = "Notebook";
   //geraet1.hersteller = "Lenovo";
   //geraet1.wert = 800.00;
   //geraet1.geraetetyp = "Notebook";
   //geraet1.standort = "Büro 1";
   //geraet1.zustand = "Gut";
   //geraet1.ausleihstatus = "verfügbar";
   //geraet1.mitarbeiter = "-";
   
   // Zweites Gerät erstellen
   
   //Geraet geraet2 = new Geraet();
   //geraet2.inventarnummer = "NB-002";
   //geraet2.bezeichnung = "Notebook";
   //geraet2.hersteller = "Dell";
   //geraet2.wert = 950.00;
   //geraet2.geraetetyp = "Notebook";
   //geraet2.standort = "Büro 2";
   //geraet2.zustand = "Gut";
   //geraet2.ausleihstatus = "verfügbar";
   //geraet2.mitarbeiter = "-";
   
   // Geräteverwaltung erstellen
   
   Geraetverwaltung verwaltung = new Geraetverwaltung();
   
   // Vorhandene Geräte aufnehmen
   
   //verwaltung.geraetAufnehmen(geraet1);
   //verwaltung.geraetAufnehmen(geraet2);
   
   // Menü
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
      System.out.println("6 - Gerät entfernen");
      System.out.println("0 - Beenden");
      System.out.print("Auswahl: ");
      auswahl = scanner.nextInt();
      scanner.nextLine();
      
      switch (auswahl) {
      
      case 1:
          Geraet neuesGeraet = new Geraet();
            System.out.println("==============================");
          System.out.print("Inventarnummer: ");
          neuesGeraet.inventarnummer = scanner.nextLine();
          System.out.print("Bezeichnung: ");
          neuesGeraet.bezeichnung = scanner.nextLine();
          System.out.print("Hersteller: ");
          neuesGeraet.hersteller = scanner.nextLine();
          System.out.print("Wert: ");
          neuesGeraet.wert = scanner.nextDouble();
          scanner.nextLine();
          System.out.print("Gerätetyp: ");
          neuesGeraet.geraetetyp = scanner.nextLine();
          System.out.print("Standort: ");
          neuesGeraet.standort = scanner.nextLine();
          System.out.print("Zustand: ");
          neuesGeraet.zustand = scanner.nextLine();
          neuesGeraet.ausleihstatus = "verfügbar";
          neuesGeraet.mitarbeiter = "-";
          verwaltung.geraetAufnehmen(neuesGeraet);
          System.out.println("Gerät wurde aufgenommen.");
          break;
          
          case 2:
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
          Geraet gefundenesGeraet = verwaltung.geraetSuchen(suchnummerAusleihe);
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
