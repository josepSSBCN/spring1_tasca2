package MainPackage;


public class Main {

	public static void main(String[] args) {
		// DEFINICIO VARIABLES	
		boolean myBoolean;
		Byte myByte;
		int myInt;
		float myFloat;
		char myChar;
		String myString;
		
		// ACCIONS
		// MÈTODES CONTROL DE EXCEPCIÓ: 'InputMismatchException'
		// MÈTODE BYTE
		myByte = Entrada.llegirByte("Introdueix un byte");
		System.out.println("El número: " + myByte + ", te el format correcte de 'byte'");

		// MÈTODE CONTROL INT
		myInt = Entrada.llegirInt("\r\nIntrodueix un número amb el format 'int'");
		System.out.println("El número: " + myInt + ", te el format correcte de 'int'");

		// MÈTODE FLOAT
		myFloat = Entrada.llegirFloat("\r\nIntrodueix un número amb el format 'float'");
		System.out.println("El número: " + myFloat + ", te el format correcte de 'float'");

		// MÈTODES CONTROL DE EXCEPCIÓ: 'Exception'
		// MÈTODE CHAR
		myChar = Entrada.llegirChar("\r\nIntrodueix un char");
		System.out.println("El caràcter: " + myChar + ", te el format correcte de 'char'");

		// MÈTODE STRING
		myString = Entrada.llegirString("\r\nIntrodueix un String");
		System.out.println("La cadena: " + myString + ", te el format correcte de 'String'");

		// MÈTODE BOOLEAN
		myBoolean = Entrada.llegirSiNo("\r\nIntrodueix el caràcter 's' o 'n'");
		System.out.println(String.format("%s, s'ha introduit el caracter '%s'", myBoolean, 
				(myBoolean)? "s":"n"));
		
		// SORTIDA
		System.out.println("\r\nEl programa ha finalitzat");

	}

}
