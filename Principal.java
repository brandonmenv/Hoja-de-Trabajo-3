/**
   * @Principal.java  1.0 25/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Javier Bucaro: 13033
   * @author Samuel Maldonado: 13153
   * @author Ricardo Franco: 13261
   * Principal: Programa principal de la hoja de trabajo 3
   * 
   *
   */

public class Principal {
	public static void main(String[] args) {
	
		Texto txt=new Texto();											//Se crea el archivo de texto con los numeros random
		txt.generaTxt("Numeros.txt");									//Se genera el archivo de texto con el nombre que se desee
		txt.escribir();													//Se escribe en el archivo de texto los 2000 numeros aleatorios
		EstructuraDeDatos ED=new EstructuraDeDatos();		//Se crea la lista que se llena con los numeros random.
		ED.muestraOrdenamiento("quick");
		/*OJO SE LE TIENE QUE ESCRIBIR CON QUE ALGORITMO SE QUIERE ORDENAR*/
	}
}
