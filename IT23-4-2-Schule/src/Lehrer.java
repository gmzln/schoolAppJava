import java.util.Scanner;

public class Lehrer extends Person{
	
	String strFach;
	//Konstruktor
	public Lehrer() {
	
	}

	public void erfasseDaten() {      //überschreibt (overwrites) die Methode aus der Basisklasse
		Scanner sc =new Scanner(System.in);
		super.erfasseDaten();     //führt die Methode aus der Basis-/Superklasse aus
		System.out.print("Fach: \t\t");
		strFach=sc.next();
	}	
	
	public void druckeAusweis() {
	    System.out.println("\nMitarbeiterausweis\n");
	    super.druckeAusweis();
	    System.out.println("Fach: \t\t"+strFach);
		}
	
	public void erteileNoten() {
	}
	
}
