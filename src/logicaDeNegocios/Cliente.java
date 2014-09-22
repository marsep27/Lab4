/*
 *Laboratorio4
 *Grupo 40
 *San José
 *SAMANTHA PATRICIA ARBUROLA LEON
 *ADRIAN ESTEBAN ARBUROLA LEON
 *MARCO GERARDO SOTO MORERA
 *FEDERICO ANDRES MONTEALEGRE CAMPABADAL
 */
package logicaDeNegocios;

public class Cliente {
	//Atributos de la clase Ciente
	private String cedula;
	private String nombre;
	private String apellido;
	
	public Cliente(String pCedula,String pNombre, String pApellido) {
		setCedula(pCedula);
		setNombre(pNombre);
		setApellido(pApellido);
	}
	//Metodos get y set
	public String getCedula() {
		return cedula;//Salida: String 
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;//EntradaSalida: String con la cedula
	}

	public String getNombre() {
		return nombre;//Salida: String 
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;//Entrada: String con nombre
	}

	public String getApellido() {
		return apellido;//Salida: String 
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;//Entrada: String con apellido
	}

	public String toString(){
		String msg="";
		msg="Cédula: " + getCedula() + "\n";
		msg+="Nombre: " + getNombre() + " " + apellido + "\n";
		return msg;
	}
	
}
