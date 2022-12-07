package MainPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	// ATRIBUTS
	static Scanner myScan;

	// METODES
	public static byte llegirByte(String missatge) {
		// DECLARACIÓ VARIABLES
		boolean correcte = false;
		byte byteOut = 0;

		// ACCIONS
		System.out.println(missatge);
		// Estarem en el bucle fins que el format sigui correcte
		while (!correcte) {
			try {
				myScan = new Scanner(System.in);
				byteOut = myScan.nextByte();

				// Sols arriba aquí, si el format és correcte
				correcte = true;
			} catch (InputMismatchException ex) {
				System.out.println("Error de format, torna-ho a provar");
			}
		}

		// SORTIDA
		return byteOut;
	}

	public static int llegirInt(String missatge) {
		// DECLARACIÓ VARIABLES
		boolean correcte = false;
		int intOut = 0;

		// ACCIONS
		System.out.println(missatge);
		// Estarem en el bucle fins que el format sigui correcte
		while (!correcte) {
			try {
				myScan = new Scanner(System.in);
				intOut = myScan.nextInt();

				// Sols arriba aquí, si el format és correcte
				correcte = true;
			} catch (InputMismatchException ex) {
				System.out.println("Error de format, torna-ho a provar");
			}
		}

		// SORTIDA
		return intOut;
	}

	public static float llegirFloat(String missatge) {
		// DECLARACIÓ VARIABLES
		boolean correcte = false;
		float floatOut = 0f;

		// ACCIONS
		System.out.println(missatge);
		// Estarem en el bucle fins que el format sigui correcte
		while (!correcte) {
			try {
				myScan = new Scanner(System.in);
				floatOut = myScan.nextFloat();

				// Sols arriba aquí, si el format és correcte
				correcte = true;
			} catch (InputMismatchException ex) {
				System.out.println("Error de format, torna-ho a provar");
			}
		}

		// SORTIDA
		return floatOut;
	}

	public static double llegirDouble(String missatge) {
		// DECLARACIÓ VARIABLES
		boolean correcte = false;
		double doubleOut = 0.0;

		System.out.println(missatge);
		// Estarem en el bucle fins que el format sigui correcte
		while (!correcte) {
			try {
				myScan = new Scanner(System.in);
				doubleOut = myScan.nextDouble();

				// Sols arriba aquí, si el format és correcte
				correcte = true;
			} catch (InputMismatchException ex) {
				System.out.println("Error de format, torna-ho a provar");
			}
		}
		return doubleOut;
	}

	public static char llegirChar(String missatge) {
		// DECLARACIÓ VARIABLES
		boolean correcte = false;
		String myString = "";

		// ACCIONS
		System.out.println(missatge);
		// Estarem en el bucle fins que el format sigui correcte
		while (!correcte) {
			try {
				myScan = new Scanner(System.in);
				myString = myScan.next();

				if (myString.length() == 1) {
					correcte = true;
				} else {
					throw new Exception();
				}
			} catch (Exception ex) {
				System.out.println("Error de format, torna-ho a provar");
			}
		}

		// SORTIDA
		return myString.charAt(0);
	}

	public static String llegirString(String missatge) {
		// DECLARACIÓ VARIABLES
		boolean correcte = false;
		String stringOut = "";

		// ACCIONS
		System.out.println(missatge);
		// Estarem en el bucle fins que el format sigui correcte
		while (!correcte) {
			try {
				myScan = new Scanner(System.in);
				stringOut = myScan.next();

				// Sols s'arriba aquí, si el format és correcte
				correcte = true;
			} catch (Exception ex) {
				System.out.println("Error de format, torna-ho a provar");
			}
		}

		// SORTIDA
		return stringOut;
	}

	public static boolean llegirSiNo(String missatge) {
		// DECLARACIÓ VARIABLES
		boolean correcte = false, booleanOut = false;
		String myString = "";

		// ACCIONS
		// Estarem en el bucle fins que el format sigui correcte
		while (!correcte) {
			try {
				System.out.println(missatge);

				myScan = new Scanner(System.in);
				myString = myScan.next();

				if (myString.length() == 1) {
					if((myString.charAt(0) == 's' || myString.charAt(0) == 'n')) {
						correcte = true;
						booleanOut = (myString.charAt(0) == 's')? true:false;
					}else {
						throw new Exception();	
					}
				} else {
					throw new Exception();
				}
			} catch (Exception ex) {
				System.out.println("Error de format, torna-ho a provar");
			}
		}

		// SORTIDA
		return booleanOut;

	}
}
