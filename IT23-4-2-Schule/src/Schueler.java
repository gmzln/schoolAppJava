import java.util.Scanner;

public class Schueler extends Person {     //extends: Klasse erbt Attribute und Methoden von der Basisklasse

private String strKlasse;
	
public Schueler() {
}

public String getStrKlasse() {
	return strKlas
}

public void setStrKlasse(String strKlasse) {
	this.strKlasse = strKlasse;
}

public void erfasseDaten() {      //überschreibt (overrrides) die Methode aus der Basisklasse
	Scanner sc =new Scanner(System.in);
	super.erfasseDaten();     //führt die Methode aus der Basis-/Superklasse aus
	System.out.print("Klasse: \t");
	setStrKlasse(sc.next());
}	


public void druckeAusweis() {
    System.out.println("\nSchülerausweis\n");
    super.druckeAusweis();
    System.out.println("Klasse: \t"+getStrKlasse());
    	}

public String schreibDatensatz() {
	String strZeile = String.valueOf(getiPNr())      +";"+
					  getStrName()					 +";"+
					  getStrVorName()			     +";"+
					  adresse.getStrStrasse()	     +";"+
					  adresse.getStrHNr()			 +";"+
					  adresse.getStrPLZ()            +";"+
					  adresse.getStrOrt()            +";"+
					  strKlasse;
	return strZeile;
	
}
}


