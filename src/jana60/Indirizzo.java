package jana60;

public class Indirizzo {
	//ATTRIBUTI
	private String via;
	private String numero;
	private String citt�;
	//COSTRUTTORE
	public Indirizzo(String via, String numero, String citt�) {
		super();
		this.via = via;
		this.numero = numero;
		this.citt� = citt�;
	}
//GET PER ESSERE LETTI ALL'ESTERNO E SET PER POTER ESSERE MODIFICATI
	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCitta() {
		return citt�;
	}

	public void setCitta(String citt�) {
		this.citt� = citt�;
	}
	
}
