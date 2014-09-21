/*
 *Laboratorio3
 *Grupo 40
 *San Josï¿½
 *SAMANTHA PATRICIA ARBUROLA LEON
 *ADRIAN ESTEBAN ARBUROLA LEON
 *MARCO GERARDO SOTO MORERA
 */

package logicaDeNegocios;

//Importar
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public abstract class Motor {
	
	//Atributos	de la clase motor
		String marca;
		int numSerie;
		public static int cilindraje;
		public static int estado = 0;
		private PrintStream out;
		private Object in;
		

	//Métodos
	// Constructor(1)
	public Motor(String pMarca, int pNumSerie, int pCilindraje, int pEstado )  { // throws IOException
		/**
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		System.out.println("Digite la Marca del motor: ");
	 	marca      = br.readLine();
	 	System.out.println("Digite el nímero de Serie del motor: ");
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
	public Motor(String pMarca, int pNumSerie, int pCilindraje)  { // throws IOException
		// Estado ya es 100
		marca 	   = pMarca;
		numSerie   = pNumSerie;
		cilindraje = pCilindraje;
		estado     = 100;
	}
	
	
	//Metodos get y set
	public String getMarca() {
		return marca;//Salida: String 
	}

	public void setMarca(String marca) {
		this.marca = marca;//Entrada: String con la marca
	}

	public int getNumSerie() {
		return numSerie;//Salida: Entero
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;//Entrada: entero con el numero de serie
	}

	public static int getCilindraje() {
		return cilindraje;//Salida: Entero
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;//Entrada: entero con el cilindraje
	}

	public PrintStream getOut() {
		return out;
	}

	public void setOut(PrintStream out) {
		this.out = out;
	}

	public Object getIn() {
		return in;
	}

	public void setIn(Object in) {
		this.in = in;
	}
	public static int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}

}
