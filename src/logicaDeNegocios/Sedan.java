package logicaDeNegocios;

import logicaDeNegocios.Automovil;

class Sedan extends Automovil {

	// Atributos
	private int estado;
	//M�todos
	//constructor 1 
	public Sedan(){
		setEstado(0);
	}
	
	//constructor 2
	public Sedan(int pEstado){
		setEstado(pEstado);
	}

	public int getEstado() {return estado;}
	public void setEstado(int estado) {this.estado = estado;}
	
}
