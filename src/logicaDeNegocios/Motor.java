/*
 *Laboratorio3
 *Grupo 40
 *San José
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

public class Motor {
	//Atributos	de la clase motor
		String marca;
		int numSerie;
		int cilindraje;
		private PrintStream out;
		private Object in;

	public Motor() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		System.out.println("Digite la Marca del motor: ");
	 	marca = br.readLine();
	 	System.out.println("Digite el número de Serie del motor: ");
	 	numSerie = System.in.read();
	 	System.out.println("Digite el cilindraje del motor: ");
	 	cilindraje = System.in.read();
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

	public int getCilindraje() {
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

}
