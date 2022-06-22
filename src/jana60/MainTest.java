package jana60;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		//CREAZIONE SCANNER
		Scanner scan = new Scanner(System.in);
		//creiamo una variabile per far decidere la grandezza dell'arrey di Persona al utente
				int indicePersona = Integer.parseInt(scan.nextLine());
				
		//CREO UN ARREY DI PERSONA CON LA CLASSE PERSONA
		Persona[] persona = new Persona[indicePersona];
		
		//CREAZIONE CICLO FOR PER FARGLI RIPETERE L INSERIMENTO DEI DATI QUANTE VOLTE VUOLE L'UTENTE
		for (int i = 0; i < persona.length ; i++) {
			//creiamo variabile indicePersona che avanzera con l avanzare degli studenti cosi da stamparci poi l indice della persona
			int indicePersonaTemp = i+1;
			
			//stampiamo una richiesta + 
			System.out.print("Inserisci i dati della persona numero:  " + (indicePersonaTemp));
			
			//ORA CHIEDIAMO DI INSERIRE UN NOME 
			System.out.println("Inserisci Il Nome: ");
			
			//CREIAMO LO SCAN PER FARGLI ARRIVARE I DATE INSERITI DALL'ESTERNO E LO METTIAMO IN UNA VARIABILE TEMPORANEA PER SALVARLO
			String nomeTemp = scan.nextLine();
			
			//RIPETIAMO PER LE ALTRE VARIABILI
			System.out.println("Inserisci Il Cognome: ");
			String cognomeTemp = scan.nextLine();
			
			System.out.println("Inserisci La Via Di Residenza: ");
			String viaTemp = scan.nextLine();
			
			System.out.println("Inserisci Il Numero Civico: ");
			String numCivicoTemp = scan.nextLine();
			
			System.out.println("Inserisci La Citta: ");
			String cittaTemp = scan.nextLine();
			
			Indirizzo indirizzo = new Indirizzo(viaTemp, numCivicoTemp, cittaTemp);
			//Creiamo un istanza del contenitore della classe Persona che avanza con riferimento [i] e 
			//al suo interno gli diamo le variabili nome/cognome e indirizzo(che a suavolte al suo interno contiene via/numeroCivico/citta)
			//al suo interno cosi da salvarle ogni volta in un nuovo contenitore all'interno della classe Persona
			persona[i] = new Persona(nomeTemp, cognomeTemp, indirizzo) ;
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
