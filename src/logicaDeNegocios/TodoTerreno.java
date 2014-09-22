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

import logicaDeNegocios.Automovil;

class TodoTerreno extends Automovil {

	// Atributos
	private int estado;
	//Métodos
	//constructor 1
	public TodoTerreno(){
		estado = 0;
	}
	//constructor 2 
	public TodoTerreno(int pEstado){
		estado = pEstado;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
