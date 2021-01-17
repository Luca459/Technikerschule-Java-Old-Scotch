
public class ArtikelTester {

    public static void main(String args[]) {
        Artikel artikelA = new Artikel("SC123-F", "DUFFY MALT WHISKEY", 10.0, 3);
        Sonderposten artikelB = new Sonderposten("SC347-A", "GLEN MORANGIE MALT WHISKEY", 49.0, 15);
        artikelA.anzeigen();
        artikelB.anzeigen();                                                             
    }
}

          
