package MainPackage;

public class Producte {
	// ATRIBUTS
	private String nom;
	private float preu;
	
	// CONSTRUCTOR
	public Producte(String nom, float preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	// GETTERS & SETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}
	
}
