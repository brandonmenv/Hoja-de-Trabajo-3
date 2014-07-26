import java.util.Arrays;

/**
   * @Sorting.java  1.0 25/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * 
   * Basado en el programa Sorting.java del @author Lewis/Loftus
   * Modificado por
   * 
   * Basado tambien en el programa de Merging Sort del sitio web
   * {@link http://eddmann.com/posts/merge-sort-comparison-in-java-and-scala/}
   * 
   * Implementacion generica basada en 
   * {@link http://en.literateprograms.org/Bubble_sort_(Java)}
   * 
   * Quick sort obtenido de 
   * {@link https://gist.github.com/3359319.git}
   * 	
   * @author Brandon Mendez Carnet: 13087
   * @author Javier Bucaro: 13033
   * @author Samuel Maldonado: 13153
   * @author Ricardo Franco: 13261
   * 
   * Sorting: Programa que tiene 4 metodos de ordenamiento
   * de 2000 numeros
   * 
   */

public class Sorting {
	public static void InsertionSort(Comparable[] list) {
	
	}
	
   /**
    * Ordena el arreglo de objetos usando el algoritmo de insertionSort
    * @param list
    */
   public static void insertionSort (Comparable[] list)
   {

	   for (int index = 1; index < list.length; index++){
		   Comparable key = list[index];  
		   int position = index;
		   //  Shift larger values to the right
		   while (position > 0 && key.compareTo(list[position-1]) < 0){
			   list[position] = list[position-1];
			   position--;
		   }           
		       list[position] = key;
	   }    
      
   }	
   
   /**
    * Ordena el arreglo de objetos usando el algoritmo de bubble
    * @param array
    */
	public static <T> void BubbleSort(Comparable[] array) {
		int right_border = array.length - 1;

		do
		{
			int last_exchange = 0;

			for (int i = 0; i < right_border; i++)
			{
				if (array[i].compareTo(array[i + 1]) > 0)
				{
					T temp = (T) array[i];
					array[i] = array[i + 1];
					array[i + 1] = (Comparable) temp;

					last_exchange = i;
				}
			}

			right_border = last_exchange;
		}
		while ( right_border > 0 );
	
	}
	
	
	/**
	 * El ordenamiento Merge sort consta de 3 métodos
	 * @param arr
	 * @param tmp
	 * @param l
	 * @param m
	 * @param h
	 */

    private static void merge(Comparable[] arr, Comparable[] tmp, int l, int m, int h)
    {
        for (int i = l; i <= h; i++) tmp[i] = arr[i]; // copy order into temp array
        int i = l, j = m + 1;
        for (int k = l; k <= h; k++) {
            if (i > m)                             arr[k] = tmp[j++]; // left complete
            else if (j > h)                        arr[k] = tmp[i++]; // right complete
            else if (tmp[j].compareTo(tmp[i]) < 0) arr[k] = tmp[j++]; // right < left
            else                                   arr[k] = tmp[i++]; // left < right
        }
    }

    /**
     * El algoritmo trabaja con 2 arreglos para fusionarlos.
     * @param arr
     * @param tmp
     * @param l
     * @param h
     */
    private static void sort(Comparable[] arr, Comparable[] tmp, int l, int h)
    {
        if (l >= h) return; // 0..1
        int m = l + (h - l) / 2;
        sort(arr, tmp, l, m);     // left
        sort(arr, tmp, m + 1, h); // right
        merge(arr, tmp, l, m, h);
    }

    /**
     * Metodo donde se crea un arreglo temporal	para ayudar y 
     * fusionar la rutina del algoritmo
     * @param arr
     */
    public static void sort(Comparable[] arr)
    {
        Comparable[] tmp = new Comparable[arr.length];
        sort(arr, tmp, 0, arr.length - 1);
    }

		
	
	
	/**
	 * Ordena el arreglo de objetos usando el algoritmo de Quick
	 * @author Arunma usuario de Github {@link https://gist.github.com/arunma}
	 * Modificado porÑ
	 * 
	 * @author Brandon Mendez Carnet: 13087
	 * @author Javier Bucaro: 13033
	 * @author Samuel Maldonado: 13153
	 * @author Ricardo Franco: 13261
	 * 
	 * @param comparableArray
	 * @param lowIndex
	 * @param highIndex
	 */
	public static void quickSort (Comparable comparableArray[], int lowIndex, int highIndex){
		
		//at least one item must exist in the array 
		if (lowIndex>=highIndex){
			return;
		}
	
		int pivotIndex=getMedianIndexAsPivotIndex(lowIndex, highIndex);
		//1) Choose pivot from the sublist
		Comparable pivot=comparableArray[pivotIndex];
		
		//2) Swap the pivot to the last item in the array
		swapItemsWithIndices(comparableArray, pivotIndex, highIndex); 	
 
		int i=lowIndex-1;
		int j=highIndex;
		
		do{ //Notice the <j (pivot item is ignored). We stop when both the counters cross
			
			//compareTo will return 0 when it reaches the pivot - will exit loop
			do {i++;} while (comparableArray[i].compareTo(pivot)<0);
			//we dont have the protection as the previous loop. 
			//So, add extra condition to prevent 'j' from overflowing outside the current sub array
			do {j--;} while (comparableArray[j].compareTo(pivot)>0 &&(j>lowIndex));
			
			if (i<j){
				swapItemsWithIndices(comparableArray, i, j);
			}
		} while (i<j);
		
		swapItemsWithIndices(comparableArray, highIndex, i);//bring pivot to i's position	
		//the big subarray is partially sorted (agrees to invariant). Let's recurse and bring in more hands
		quickSort(comparableArray, lowIndex, i-1); //sort subarray between low index and one before the pivot
		quickSort(comparableArray, i+1, highIndex); //sort subarray between low index and one before the pivot
	}
	
	
	/**
	 * Metodo que me intercambio datos con un arreglo temporal para que sea mucho mas rapido
	 * @param comparableArray
	 * @param firstItem
	 * @param secondItem
	 */
	
	private static void swapItemsWithIndices(Comparable[] comparableArray, int firstItem, int secondItem) {
		final Comparable tempItem=comparableArray[firstItem];
		comparableArray[firstItem]=comparableArray[secondItem];
		comparableArray[secondItem]=tempItem;
	}
 
 
	/**
	 * La media de los indices serbiara como indice pivote
	 * @param lowIndex
	 * @param highIndex
	 * @return
	 */
	private static int getMedianIndexAsPivotIndex(int lowIndex, int highIndex) {
		return lowIndex+((highIndex-lowIndex)/2);
	}
	 
	 

}
