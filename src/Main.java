public class Main {
    public static void main(String[] args) {
        Produkt p=new Produkt("Tennissocken",2.4, 2.9, 12);

        Produkt p2=new Produkt ("Sandspielzeug", 9.3, 18.5);

        Produkt[] produkte= new Produkt[]{
                new Produkt("Schirm", 3.5, 4.0, 5),
                new Produkt("Eis",1.5, 2, 10),
                new Produkt("Handtuch",3.7,4.5,20),
                new Produkt("Sonnenbrillen",2.0,2.5, 8),
                new Produkt("Badehose",10,11,23)
        };

        for(int x = 0; x<produkte.length;x++) {
            produkte[x].schreibe();
        }
        produkte[0].lieferung(10);
        produkte[1].lieferung(5);
        produkte[2].lieferung(1);
        produkte[3].lieferung(12);

        produkte[0].verkaufe(7);
        produkte[1].verkaufe(9);
        produkte[2].verkaufe(15);
        produkte[3].verkaufe(10);
        produkte[4].verkaufe(3);

        System.out.print("Die Summe der Bestandswerte beträgt: ");
        System.out.println(produkte[0].getBestandsWert() + produkte[1].getBestandsWert() +  produkte[2].getBestandsWert() +  produkte[3].getBestandsWert() +  produkte[4].getBestandsWert());


        /*p.lieferung(10);
        p.verkaufe();
        p.verkaufe(10);
        p.getBestandsWert();
        p.schreibe();*/
    }
}