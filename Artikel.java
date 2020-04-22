package testFX;

public class Artikel {

	public String artikelNaam;
	public String prijs;
	
	
	public Artikel (String naam, String prijs) {
		this.artikelNaam = naam;
		this.prijs = prijs;
	}
	
	public String toString() {
		return artikelNaam + " " + prijs;
	}
	
}
