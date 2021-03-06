/*
 *Laboratorio4
 *Grupo 40
 *San Jos�
 *SAMANTHA PATRICIA ARBUROLA LEON
 *ADRIAN ESTEBAN ARBUROLA LEON
 *MARCO GERARDO SOTO MORERA
 *FEDERICO ANDRES MONTEALEGRE CAMPABADAL
 */
package logicaDeNegocios;

//Importar

public abstract class Motor {
	
	//Atributos	de la clase motor
		String marca;
		int numSerie;
		public static int cilindraje;
		public static int estado = 0;

		

	//M�todos
	// Constructor(1)
	public Motor(String pMarca, int pNumSerie, int pCilindraje, int pEstado )  { // throws IOException
		/**
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		System.out.println("Digite la Marca del motor: ");
	 	marca      = br.readLine();
	 	System.out.println("Digite el n�mero de Serie del motor: ");
	 	numSerie   = System.in.read();
	 	System.out.println("Digite el cilindraje del motor: ");
	 	cilindraje = System.in.read();
	 	System.out.println("Digite el estado del motor");
	 	estado     = System.in.read();
		*/
		marca 	   = pMarca;
		numSerie   = pNumSerie;
		cilindraje = pCilindraje;
		estado     = pEstado;
	}
	
	// Constructor (2)
	public Motor(String pMarca, int pNumSerie, int pCilindraje)  
	{ // throws IOException
		// Estado ya es 100
		marca 	   = pMarca;
		numSerie   = pNumSerie;
		cilindraje = pCilindraje;
		estado     = 100;
	}

	// Obtener Cilindraje con Condici�n Turbo
	public int obtenerCilindraje(){
		  if ((estado == 50) && (cilindraje>=3200))
		  { /** Si el estado del motor V8 es de 50% 
			encontes se activa el turbo y al motor se le a�aden 500cc.*/
		   cilindraje = cilindraje + 500;
		  }
		  
		  return estado * cilindraje; 
		 }
	
	
	
	public Motor() {
		// TODO Auto-generated constructor stub
	}

	//Metodos get y set
	//Salida: String
	public String getMarca() {return marca; }
	//Entrada: String con la marca
	public void setMarca(String marca) {this.marca = marca;}
	
	//Salida: Entero
	public int getNumSerie() {return numSerie;}
	//Entrada: entero con el numero de serie
	public void setNumSerie(int numSerie) {this.numSerie = numSerie;}

	public static int getCilindraje() {return cilindraje;}
	public static void setCilindraje(int cilindraje) {Motor.cilindraje = cilindraje;}

	public static int getEstado() {return estado;}
	public static void setEstado(int estado) {Motor.estado = estado;}
}