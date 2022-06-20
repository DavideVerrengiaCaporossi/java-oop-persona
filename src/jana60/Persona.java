package jana60;

public class Persona {

	private String nome;
	private String cognome;
	private Indirizzo indirizzo;
	
	public Persona(String nome, String cognome, String indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = new Indirizzo(indirizzo.getVia(),indirizzo.getNumero(),indirizzo.getCitta());
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	
	
}
