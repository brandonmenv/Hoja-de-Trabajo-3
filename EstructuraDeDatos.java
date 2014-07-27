
/**
   * @EstructuraDeDatos.java  1.0 25/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Javier Bucaro: 13033
   * @author Samuel Maldonado: 13153
   * @author Ricardo Franco: 13261
   * Estructura de Datos: Administra los 2000 datos
   * 
   *
   */


import java.io.*;


public class EstructuraDeDatos {
	/*Atributos de la clase*/
	private ListaNumeros array;
	
	/*
	 * Constructor de la clase
	 */
	public EstructuraDeDatos(){
    	array=new ListaNumeros();
    	guardaEnLista();										//Se guardan los numeros en la lista      	
        
	}
	
	/**
	 * Metodo que ordena los 2000 numeros dependiendo
	 * del ordenamiento que se le indique en el parametro.
	 * @param ordenamiento
	 */
	public void muestraOrdenamiento(String ordenamiento){
	   	if(ordenamiento=="insertion"){
	    	System.out.println("/********************************************************/");
			System.out.println("Los numeros se ordenaron con el algoritmo de Insertion: \n");	
	    	System.out.println("/********************************************************/");	
	    	Sorting.insertionSort(array.getArrayNumeros());						//Ordenandolos con el algoritmo de sorting
			for(Integer i : array.getArrayNumeros())							//Imprimiendo numeros ordenados
				System.out.println(i);
		}else{
			if(ordenamiento=="bubble"){									
		    	System.out.println("/********************************************************/");
				System.out.println("Los numeros se ordenaron con el algoritmo de Bubble: \n");	
		    	System.out.println("/********************************************************/");	
				Sorting.BubbleSort(array.getArrayNumeros());					//Se ordenan con el algoritmo de bubble
				for(Integer i : array.getArrayNumeros())						//Imprimiendo numeros ordenados
					System.out.println(i);
			}else{				
				if(ordenamiento=="merge"){
			    	System.out.println("/********************************************************/");
					System.out.println("Los numeros se ordenaron con el algoritmo de Merge: \n");	
			    	System.out.println("/********************************************************/");	
					Sorting.sort(array.getArrayNumeros());					//Se ordenan con el algoritmo de bubble
					for(Integer i : array.getArrayNumeros())						//Imprimiendo numeros ordenados
						System.out.println(i);
				}else{
					if(ordenamiento=="quick"){
				    	System.out.println("/********************************************************/");
						System.out.println("Los numeros se ordenaron con el algoritmo de Quick: \n");	
				    	System.out.println("/********************************************************/");	
						
				    	
				    	Sorting.quickSort(array.getArrayNumeros(), 0, array.getArrayNumeros().length-1);					//Se ordenan con el algoritmo de bubble
						for(Integer i : array.getArrayNumeros())						//Imprimiendo numeros ordenados
							System.out.println(i);
					}else{	
					}
				}
			}		
		}			
	}
	
	
	/*
	 * Metodo que guarda en una lista los numeros aleatorios generados
	 */
	public void guardaEnLista(){
		String linea = "";														//String que tendra c/linea												
		File archivo = new File("Numeros.txt");									//se crea el archivo a leer
		  
		try {
			FileReader leerArchivo = new FileReader(archivo);					//Se crea al lector
			BufferedReader buffer = new BufferedReader(leerArchivo);			//Se crea el buffer
			int contador=0;														//Contador para saber la posicion de la lista
			
			while ((linea = buffer.readLine()) != null){						//Se lee sin los "enter"						
				array.getArrayNumeros()[contador]=Integer.parseInt(linea);

				contador++;														//Se le suma al contador
			}
			buffer.close();														//Se cierra el buffer
		}catch (Exception ex){
		}	
		
		
	}
	
}
