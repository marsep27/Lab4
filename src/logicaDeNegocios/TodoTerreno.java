package logicaDeNegocios;

import logicaDeNegocios.Automovil;

class TodoTerreno extends Automovil {

	// Atributos
	private int estado;
	//M�todos
	//constructor 1
	public TodoTerreno(){
		int estado = 0;
	}
	//constructor 2 
	public TodoTerreno(int pEstado){
		int estado = pEstado;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
