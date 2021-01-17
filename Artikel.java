public class Artikel {
    String artikelNr;
    String bezeichnung;
    double einkaufspreis;
    double Verkaufspreis;
    int lagerzeit;
    final double HANDELSSPANNE = 0.6; // 60 Prozent des Einkaufspreises
    final double MWST = 0.19; // 19 Prozent

    // Konstruktor
    public Artikel(String artnr, String bzn, double ek, int lz) {
        artikelNr = artnr;
        bezeichnung = bzn;
        einkaufspreis = ek;                      
        lagerzeit = lz;
        berechneVerkaufspreis();
    }

    public double berechneVerkaufspreis() {
        double Listenverkaufspreis = 0;
        Listenverkaufspreis = (einkaufspreis * (1 + HANDELSSPANNE));
        Verkaufspreis = Listenverkaufspreis * (1 + MWST);
        return Verkaufspreis;

    }

    public void anzeigen() {
        System.out.println(artikelNr + " " + "\"" + bezeichnung + "\"" + " " + "EK: " + einkaufspreis + " VK: " + Verkaufspreis + " Euro" + "Lagerzeit: "
                + lagerzeit + " Monate");
    }
}
// super(bezeichnung, einkaufspreis, lagerzeit); # shift+ alt +F                 
