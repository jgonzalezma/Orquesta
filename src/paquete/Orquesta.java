package paquete;

import java.util.ArrayList;

public class Orquesta {
	String nombre;
	int miembros;
	double presupuesto;
	ArrayList<Instrumento> instrumentos;

	public Orquesta(String nombre, int numMiembros, double presupuesto, ArrayList<Instrumento> instrumentos) {
		this.nombre = nombre;
		this.miembros = numMiembros;
		this.presupuesto = presupuesto;
		this.instrumentos = instrumentos;
	}
	public Orquesta(){
		this.instrumentos = new ArrayList<Instrumento>();
	}
	public void addInstrumento(Instrumento instrumento){
		this.instrumentos.add(instrumento);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMiembros() {
		return miembros;
	}
	public void setMiembros(int miembros) {
		this.miembros = miembros;
	}
	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	public ArrayList<Instrumento> getInstrumentos() {
		return instrumentos;
	}
	public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}
	public ArrayList<Instrumento> getDeTipo(String tipo){
		return instrumentos;
		
	}
	
	
	
	
}


