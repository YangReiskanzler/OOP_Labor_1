public class Spiel {
    private String Name;
    private double Kosten;
    private double Dauer;
    private double Tickets;

    Spiel(String iName, double iKosten,double iDauer, double iTickets) {
        Name = iName;
        Kosten = iKosten;
        Dauer = iDauer;
        Tickets = iTickets;
    }

    double spielen(){
        System.out.println(Tickets-Kosten);
        return 0;
    }
    double spielen(int anz){
        System.out.println("Das Spiel dauert:" +Dauer * anz + "min");
        return Tickets = Tickets-(Kosten*anz);
    }
    double kaufen(int anzahl){
        System.out.println(("Du hast " +  anzahl + " Tickets gekauft. Somit hast du jetzt " + (Tickets + anzahl) + " Tickets."));
        return Tickets = Tickets + anzahl;
    }
}
