package ExcepcionsPackage;

public class ExcepcioButacaLliure extends Exception{
	// CONSTRUCTOR
	public ExcepcioButacaLliure (){
		// El missatge es passa a la constructora de la classe pare
		super("EXCEPCIO! Aquesta butaca no està reservada.");
	}
}
