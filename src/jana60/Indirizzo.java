package jana60;

public class Indirizzo {
	//ATTRIBUTI
	String via;
	String numero;
	String città;
	//COSTRUTTORE
	public Indirizzo(String via, String numero, String città) {
		super();
		this.via = via;
		this.numero = numero;
		this.città = città;
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

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}
	
}
