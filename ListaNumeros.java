
public class ListaNumeros implements Comparable{
	//Atributos
	private String firstName, lastName;
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
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
      return (lastName.equals(((ListaNumeros)other).getLastName()) &&
              firstName.equals(((ListaNumeros)other).getFirstName()));
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

      String otherFirst = ((ListaNumeros)other).getFirstName();
      String otherLast = ((ListaNumeros)other).getLastName();

      if (lastName.equals(otherLast))
         result = firstName.compareTo(otherFirst);
      else
         result = lastName.compareTo(otherLast);

      return result;
   }
	   
	
	
	
}
