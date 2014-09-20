/*
 *Laboratorio3
 *Grupo 40
 *San José
 *SAMANTHA PATRICIA ARBUROLA LEON
 *ADRIAN ESTEBAN ARBUROLA LEON
 *MARCO GERARDO SOTO MORERA
 */

package logicaDeNegocios;

public class Duenio {
	private String nombre;
	private String telefono;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public Duenio(String pNombre,String pTelefono) {
		// TODO Auto-generated constructor stub
		setNombre(pNombre);
		setTelefono(pTelefono);
	}
	@Override
	public String toString() {
		String msg="";
		msg+="Nombre: "+getNombre()+" "+"\n";
		msg+="Teléfono: "+getTelefono()+"\n";
		return msg;
	}
	
	
	
	

}