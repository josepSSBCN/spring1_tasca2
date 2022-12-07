package CinePackage;

public class Butaca {
	// ATRIBUTS
	protected byte numFila;
	protected byte numSeient;
	protected String nomPersona;

	// CONSTRUCTOR
	public Butaca(byte numFila, byte numSeient, String nomPersona) {
		this.numFila = numFila;
		this.numSeient = numSeient;
		this.nomPersona = nomPersona;
	}

	// GETTERS
	public byte getNumFila() {
		return numFila;
	}

	public byte getNumSeient() {
		return numSeient;
	}

	public String getNomPersona() {
		return nomPersona;
	}

	// METODES
	public boolean equals(Butaca btc2) {
		return (this.numFila == btc2.getNumFila() && this.numSeient == btc2.getNumSeient());
	}
	
	public String toString() {
		return String.format("Fila: %s, Seient: %s, Persona: %s", this.numFila, this.numSeient, this.nomPersona); 
	}

}
