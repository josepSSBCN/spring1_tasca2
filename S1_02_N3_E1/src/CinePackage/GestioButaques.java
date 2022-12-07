package CinePackage;

import java.util.ArrayList;

import ExcepcionsPackage.*;

public class GestioButaques {
	// ATRIBUTS
	/** Llista butaques reservades*/
	protected ArrayList<Butaca> butaques;

	// CONSTRUCTOR
	public GestioButaques() {
		butaques = new ArrayList<>();
	}

	// GETTERS
	public ArrayList<Butaca> getButaques() {
		return butaques;
	}

	// METODES
	public boolean AfegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {
		// DEFINICIÓ DE VARIABLES
		boolean resultat = false;

		// Està lliure la butaca?
		if (cercarButaca(butaca.getNumFila(), butaca.getNumSeient()) == -1) {
			this.butaques.add(butaca);
			resultat = true;
		} else {
			throw new ExcepcioButacaOcupada(butaca.numFila, butaca.numSeient);
		}

		return resultat;
	}

	/**
	 * Elimina una butaca de l'array
	 * @param numFila	
	 * @param numSeient	
	 * @return true = Eliminada correctamente; false= butaca era lliure
	 * @throws ExcepcioButacaLliure
	 */
	public boolean eliminarButaca(byte numFila, byte numSeient) throws ExcepcioButacaLliure {
		// DEFINICIÓ DE VARIABLES
		boolean resultat = false;
		int posicio = 0;

		// ACCIÓ
		// Està ocupada la butaca?
		posicio = cercarButaca(numFila, numSeient);
		if (posicio != -1) {
			this.butaques.remove(posicio);
			resultat = true;
		} else {
			throw new ExcepcioButacaLliure();
		}
		
		// SORTIDA
		return resultat;
	}

	public int cercarButaca(byte numFila, byte numSeient) {
		// DECLARACIÓ DE VARIABLES
		boolean sortir = false;
		int index = 0, posicioButaca = -1;

		// ACCIONS
		if (this.butaques.size() > 0) {
			do {
				if (this.butaques.get(index).getNumFila() == numFila
						& this.butaques.get(index).getNumSeient() == numSeient) {
					sortir = true;
					posicioButaca = index;
				}else {
					index++;
				}
			}while (!sortir && this.butaques.size() > index);
		}
		
		// SORTIDA
		return posicioButaca;
	}
}
