import java.util.List;
import java.io.*;
import java.util.*;

public class SchoolApp {

	public static List<Schueler> alSchuelerListe = new ArrayList<Schueler>();  
	
	public static void main(String[] args) throws IOException {
		//Objekte erzeugen durch Aufruf des Konstruktors der Klasse
		FileWriter schreiben =new FileWriter("Personendaten.txt",true);
		
		//Reihenfolge wird im Konstruktor(HandwerksFirma) festgelegt und hier als Objekt erzeugt
		HandwerksFirma klempner = new HandwerksFirma("03483", "Frau Schmidt", "Rohr_fre", "Sanitäter");
		
		klempner.ausgabeDaten();
		
//		Scanner sc =new Scanner(System.in);
//		String strNeu = "j";
//		int i=0;
			
//		System.out.println("\nSchüler erzeugen: \n");
//		 while (strNeu.charAt(0) == 'j')  {	//strNeu.equals("j")
//			 System.out.println("Neuer Schüler? j/n: ");
//			 strNeu = sc.next();
//			 if (strNeu.charAt(0) == 'j') {
//			 alSchuelerListe.add(new Schueler());
//			 alSchuelerListe.get(i).erfasseDaten();
//			 alSchuelerListe.get(i).druckeAusweis();
//			 schreiben.write(alSchuelerListe.get(i).schreibDatensatz());
//			 schreiben.write(System.getProperty("line.separator"));
//			 i++;
//			 }
//			 else {break;}
//			  }
//		 
//		 System.out.println(alSchuelerListe.size()+" Schüler erzeugt.\n");
//		 
//		
//		schreiben.close();	 	
		 
	}

}
