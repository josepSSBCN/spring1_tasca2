package MainPackage;

public class Main {

	public static void main(String[] args) {
		// DEFINICIO VARIABLES
		Venda venda1 = new Venda();
		String[] animals = {"Gos", "Ocell", "Girafa"};
		
		// ACCIONS
		// EXCEPCIÓ PROPIA "VendaBuidaException"
		try {
			// Es crida al mètode, sense haver afegit primer productes.
			venda1.calcularTotal();
		}catch(VendaBuidaException ex){
			System.out.println(ex.getMessage());
		}
		
		// EXCEPCIÓ "ArrayIndexOutOfBoundsException"
		try {
			for(int i = 0; i <= animals.length; i++) {
				System.out.println(animals[i]);	
			}
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());			
		}

		// Per comprovar que totes les excepcions estan controlades 
		System.out.println("Programa finalitzat.");
	}

}
