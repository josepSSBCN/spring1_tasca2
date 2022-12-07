package ExcepcionsPackage;

public class ExcepcioSeientIncorrecte extends Exception{
	// CONSTRUCTOR
	public ExcepcioSeientIncorrecte (byte numButaca, byte min, byte max){
		// El missatge es passa a la constructora de la classe pare
		super(String.format("EXCEPCIO! El nº de butaca '%s', està fora dels límits."
				+ "\r\nEl valor ha de ser entre %s i %s.", numButaca, min, max));
	}
}
