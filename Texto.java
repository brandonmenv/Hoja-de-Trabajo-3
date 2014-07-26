/**
   * @Texto.java  1.0 25/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Javier Bucaro: 13033
   * @author Samuel Maldonado: 13153
   * @author Ricardo Franco: 13261
   * Texto: Escribe en un archivo .txt 2000 numeros aleatorios
   * y los guarda en una array
   *
   */

//Importando librerias utiles
import java.io.*;
public class Texto {
	private File txt;														//Archivo txt que se genera


	/*
	 * Metodo que genera el archivo.txt llamado "Numeros.txt"
	 */
	public void generaTxt(String nombre) {
		txt = new File(nombre);										//Se crea el objeto tipo File
		try { 
			PrintWriter printer = new PrintWriter(txt);						//Se crea el printer  
			printer.close();												//Cerrando el printer 
		}catch(Exception e1){												//Se controla las excepciones
	       e1.printStackTrace();
		}		
	}

	/*
	 * Clase que Crea un archibo .txt en el ordenador y escribe 2000
	 *  Numeros aleatorios
	 */
	public void escribir(){
		try {
			FileWriter escritor = new FileWriter(txt, true);				//Se crea el escritor
			BufferedWriter buffer = new BufferedWriter(escritor);			//Se crea el buffer
			for(int i = 1; i<=2000; i++){									//genera los numeros aleatorios de 0-2000		
				buffer.write(Integer.toString(((int)(Math.random()*(2000-0+1)+0))));
				if(i!=2000){												//Se coloca en cada enter, excepto al final del txt
				buffer.newLine();
				}
			}
			buffer.close();													//Se cierra el buffer para que se guarden los cambios
		}catch (Exception ex) {
		       ex.printStackTrace();										//Se controlas las excepciones
		}
	}
	
}//Fin de la clase
