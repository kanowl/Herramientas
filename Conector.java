import java.util.Scanner;

public class Conector {

	public Conector() {
		
	}
	
	public static void main (String args []) {
		
		Scanner sca = new Scanner (System.in);
		System.out.print("ingrese la oración ");
		String oracion = sca.nextLine();
		String texto [] = oracion.split(" ");
		boolean y = true;
		int cont=0;
		for (int i=0; i < texto.length; i ++) {	
			if (cont >= 0)
				y=true;
			if (i+3<texto.length) {
				if ( texto[i].equals("si") && texto[i+1].equals("y") && texto[i+2].equals("solo") && texto[i+3].equals("si")  ) {
					System.out.println("se encontro conector si y solo si en la posición: " +i);
					y = false;
					cont = -3;
				}
				
			}
				
			if ( texto[i].equals("y") && y==true)
				System.out.println("se encontro conector y en la posición: " +i);
			if (texto[i].equals("o"))
				System.out.println("se encontro conector o en la posición: " +i);
			if (texto[i].equals("entonces"))
				System.out.println("se encontro conector entonces en la posición: " +i);
			if (texto[i].equals("no"))
				System.out.println("se encontro conector NO en la posición: " +i);
		cont++;	
		}
	}

}
