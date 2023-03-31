public class Produkt {
    private String Name;
    private double Einkaufspreis;
    private double Verkaufspreis;
    private int Lagerbestand;
    double BestandsWert;


    Produkt(String iName, double iEinkaufspreis, double iVerkaufspreis, int iLagerbestand) {
        Name = iName;
        Einkaufspreis = iEinkaufspreis;
        Verkaufspreis = iVerkaufspreis;
        Lagerbestand = iLagerbestand;
    }
        Produkt(String iName, double iEinkaufspreis, double iVerkaufspreis) {
            Name = iName;
            Einkaufspreis = iEinkaufspreis;
            Verkaufspreis = iVerkaufspreis;
        }
        double lieferung(int anzahl) {
            System.out.println(Einkaufspreis * anzahl);
            return Lagerbestand = Lagerbestand + anzahl;
        }

        double verkaufe(){
            System.out.println(Verkaufspreis);
            return Lagerbestand = Lagerbestand - 1;
        }
        double verkaufe(int anz){
            System.out.println(Verkaufspreis * anz);
            return Lagerbestand = Lagerbestand - anz;
        }

        double getBestandsWert(){
            return BestandsWert = Einkaufspreis * Lagerbestand;
        }

        void schreibe() {
            System.out.println("Produkt:" + Name + " "+"Bestand:" + Lagerbestand +" "+ "EK:" + Einkaufspreis + "€" +" " + "VK:" + Verkaufspreis + "€");

        }
}
