import java.util.ArrayList;
public class Main {
       public static void main(String[] args) {
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
       
       // ArrayList erstellen
       
       ArrayList<Geraet> geraete = new ArrayList<>();
       
       // Geräte zur Liste hinzufügen
       
       geraete.add(geraet1);
       geraete.add(geraet2);
       
       // Alle Geräte anzeigen
       
       System.out.println("=== ALLE GERÄTE ===");
       
       for (Geraet geraet : geraete) {
       geraet.anzeigen();
       System.out.println("-----------------------------");
       }
       
       // Gerät 1 ausleihen
       
       System.out.println();
       System.out.println("=== AUSLEIHE ===");
       geraet1.ausleihen("Max Mustermann");
       geraet1.anzeigen();
       
       // Versuch, das bereits ausgeliehene Gerät erneut auszuleihen
       
       System.out.println("-----------------------------");
       System.out.println();
       System.out.println("=== ZWEITE AUSLEIHE ===");
       geraet1.ausleihen("Anna Müller");
       
       // Gerät 1 zurückgeben
       System.out.println("-----------------------------");
       System.out.println();
       System.out.println("=== RÜCKGABE ===");
       geraet1.zurueckgeben();
       geraet1.anzeigen();
       System.out.println("-----------------------------");
       }
}