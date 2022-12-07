package ExcepcionsPackage;

public class ExcepcioNomPersonaIncorrecte extends Exception{
	// CONSTRUCTOR
	public ExcepcioNomPersonaIncorrecte (){
		// El missatge es passa a la constructora de la classe pare
		super("EXCEPCIO! Aquesta nom de persona, no és correcte. No pot tenir números");
	}
}