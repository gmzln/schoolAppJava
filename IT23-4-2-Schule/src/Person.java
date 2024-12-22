import java.util.Scanner;

public class Person {

	public static int iPAnzahl=1;   //static: Klassenvariable (wird von der Klasse verwaltet)
	private final int iPNr;          //final: Wert kann genau einmal zugewiesen werden 
	private String strName, strVorName;
	
	Adresse adresse = new Adresse();     //Komposition mit der Adresse
	
	//Konstruktor
	public Person() {
	//Standardwerte
		iPNr=iPAnzahl++;
		strName="";
		adresse.setStrPLZ("01234");
	};
	
	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrVorName() {
		return strVorName;
	}

	public void setStrVorName(String strVorName) {
		this.strVorName = strVorName;
	}

	public int getiPNr() {
		return iPNr;
	}

	//weitere Methoden
	public void erfasseDaten() {
		Scanner sc =new Scanner(System.in);
		System.out.println("\nDatenerfassung:\n");
		System.out.print("Name: \t\t");
		strName=sc.next();
		System.out.print("Vorname: \t");
		strVorName=sc.next();
		System.out.print("Strasse: \t");
		adresse.setStrStrasse(sc.next());
		System.out.print("Hausnr.: \t");
		adresse.setStrHNr(sc.next());
		System.out.print("PLZ: \t\t");
		adresse.setStrPLZ(sc.next());
		System.out.print("Ort: \t\t");
		adresse.setStrOrt(sc.next());
	}	

	// Konstruktor
	public void erfasseDaten(String strName) {
		this.strName = strName;
	}
	
	public void druckeAusweis() {
		      System.out.println("Personennr.: \t"+iPNr);
		      System.out.println("Name: \t"+strName);
		      System.out.println("Vorname: \t"+strVorName);
		      System.out.println("Adresse: \t"+adresse.getStrStrasse()+" "+adresse.getStrHNr()+"\n\t\t"+adresse.getStrPLZ()+" "+adresse.getStrOrt());
			}
			
}
