import java.util.*;

public class HandwerksFirma {

	private String telefon;
	private String ansprechpartner;
	private String name;
	private String branche;
	
	Adresse adresse = new Adresse(); // Komposition
	
	//konstruktor
	public HandwerksFirma (String telefon, String ansprechpartner, String name, String branche) {
		this.telefon= telefon;
		this.ansprechpartner= ansprechpartner;
		this.name= name;
		this.branche= branche;
	}

	public void ausgabeDaten() {
		System.out.println(telefon);
		System.out.println(ansprechpartner);
		System.out.println(name);
		System.out.println(branche);
	}
	
	public void reparieren() {
		System.out.println("gfhdg");
	}
	
}
