

/**
   * @ListaNumeros.java  1.0 25/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * @author Brandon Mendez Carnet: 13087
   * @author Javier Bucaro: 13033
   * @author Samuel Maldonado: 13153
   * @author Ricardo Franco: 13261
   * ListaNumero: Lista de numeros generados por Texto.java
   * 
   *
   */


public class ListaNumeros implements Comparable{
	//Atributos
	private String tipo, dimension;
	private Integer[] arrayNumeros;
	
	
	/*
	 * Constructor de la clase
	 */
	public ListaNumeros(){
		arrayNumeros=new Integer[2000];			//Se crea el array de Integers		
	}
	
	
	/*
	 * SETS Y GETS de la clase
	 */
	public String getTipo() {
		return tipo;
	}

	public void setFirstName(String firstName) {
		this.tipo = firstName;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String lastName) {
		this.dimension = lastName;
	}

	
	public Integer[] getArrayNumeros() {
		return arrayNumeros;
	}


	public void setArrayNumeros(Integer[] arrayNumeros) {
		this.arrayNumeros = arrayNumeros;
	}


/*
	 * Metodo que da la descripcion del tipo y 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
   public boolean equals (Object other)
   {
      return (dimension.equals(((ListaNumeros)other).getDimension()) &&
              tipo.equals(((ListaNumeros)other).getTipo()));
   }
   
   
   /*
    * Metodo que mira el tipo de numero y tipo de ___ para ordenarlos de esta otra forma
    * OJO QUE ES UN AGREGADO YA QUE TAMBIEN SE ENCUENTRAN LOS
    * 4 METODOS DE ORDENAMIENTO.
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */
   public int compareTo (Object other)
   {
      int result;

      String otherFirst = ((ListaNumeros)other).getTipo();
      String otherLast = ((ListaNumeros)other).getDimension();

      if (dimension.equals(otherLast))
         result = tipo.compareTo(otherFirst);
      else
         result = dimension.compareTo(otherLast);

      return result;
   }
	   
	
	
	
}
