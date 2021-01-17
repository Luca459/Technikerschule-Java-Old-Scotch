class Sonderposten extends Artikel{
   int Rabatt;
   double neuerPreis;

  
  // Konstruktor
  public Sonderposten(String artnr, String bzn, double ek, int lz)
  { 
    super(artnr,bzn, ek,lz);
    if (lagerzeit > 12) {
       Rabatt = 30;
    } else {
       Rabatt = 10;
    } // end of if-else
          
  }
  public double berechneVerkaufspreis() {
        double Listenverkaufspreis = 0;
        Listenverkaufspreis = (einkaufspreis * (1 + HANDELSSPANNE));
        Verkaufspreis = Listenverkaufspreis * (1 + MWST);
        neuerPreis = Verkaufspreis - (Verkaufspreis / 100) * Rabatt;
        neuerPreis = Math.round(neuerPreis * 10000) / 10000.0;
        return neuerPreis;
    }
  
  
  public void anzeigen()
  {
    System.out.println("");
    System.out.println("Sonderposten:");
    System.out.println(artikelNr + " " + "\"" + bezeichnung + "\" " + " " + "EK: " + einkaufspreis + " VK: " + berechneVerkaufspreis()+ " Euro " + "Lagerzeit: "
                + lagerzeit + " Monate");
    System.out.println("(VK <alt>:" + Verkaufspreis + " Euro " + "Rabatt: " + Rabatt + "%)");
  }
}
