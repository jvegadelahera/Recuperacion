
public class ED_T2 {
	
	public static void leyGravitacionalUniversal () {
			double [] dato = new double [3];
			double fuerza ;
			System.out.println("Introduce la masa del objeto 1: ");
			dato [0] = utiles.leerDouble ();
			System.out.println("Introduce la masa del objeto 2: ");
			dato [1] = utiles.leerDouble ();
			System.out.println("Introduce la distancia que los separa: ");
			dato [2] = utiles.leerDouble ();
			fuerza = 6.67 * (dato [0] * dato [1] / dato [2] * dato [2] );
			System.out.println("El resultado del computo es el siguiente ");
			System.out.println("La fuerza gravitacional entre los dos objetos");
			System.out.println("Alcanza un valor de: + fuerza");
		}
	}


