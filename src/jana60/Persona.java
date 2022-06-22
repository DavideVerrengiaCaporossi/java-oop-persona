package jana60;

public class Persona {
 //ATTRIBUTI
	private String nome;
	private String cognome;
	//ATTRIBUTO INDIRIZZO COLLEGATO A CLASSE INDIRIZZO
	//QUESTO VIENE FATTO PER DARE UN LIVELLO DI SICUREZZA MAGGIORE E
	//NON PERMETTERE CHE SI POSSANO MODIFICARE I DATI INSERITI
	private Indirizzo indirizzo;
	//COSTRUTTORE
	public Persona(String nome, String cognome, Indirizzo indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		//ATTRIBUTO INDIRIZZO CHE RICHIEDE IN INGRESSO LE TRE VARIBILI CONTENUTE NEL COSTRUTTORE DI INDIRIZZO
		//QUESTO VIENE FATTO PER DARE UN LIVELLO DI SICUREZZA MAGGIORE E
		//NON PERMETTERE CHE SI POSSANO MODIFICARE I DATI INSERITI
		this.indirizzo = new Indirizzo(indirizzo.getVia(),indirizzo.getNumero(),indirizzo.getVia());
	}
	//GET E SETTER
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	
	
}
