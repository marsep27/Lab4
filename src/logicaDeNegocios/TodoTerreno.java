package logicaDeNegocios;

import logicaDeNegocios.Automovil;

class TodoTerreno extends Automovil {

	// Atributos
	public int estado;
	//M�todos
	//constructor 1
	public TodoTerreno(){
		estado = 0;
	}
	//constructor 2 
	public TodoTerreno(int pEstado){
		estado = pEstado;
	}
	public int getEstado() {return estado;}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
