package MainPackage;

public class Venda {
	// ATRIBUTS
	private Producte[] productes;
	private int totalVenda;
	
	// CONSTRUCTORA
	public Venda() {}
	
	// GETTERS & SETTERS
	public Producte[] getProductes() {
		return productes;
	}

	public void setProductes(Producte[] productes) {
		this.productes = productes;
	}

	public int getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(int totalVenda) {
		this.totalVenda = totalVenda;
	}

	// METODES
	public void calcularTotal() throws VendaBuidaException {
		if(this.productes == null) {
			// Llançament de l'excepció
			throw new VendaBuidaException();
		}else {
			for(int i=0; i < productes.length; i++) {
				this.totalVenda += productes[i].getPreu();
			}
		}
	}
	
	
	
}
