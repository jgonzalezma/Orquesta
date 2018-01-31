package paquete;

import java.util.ArrayList;
import java.util.Iterator;

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
	public ArrayList<Instrumento> getInstrumentoDeTipo(String tipo){
		ArrayList<Instrumento> instrumentosDeTipo = new ArrayList<Instrumento>();
		Iterator<Instrumento> i = this.instrumentos.iterator();
		while(i.hasNext()){
			Instrumento instrumento = i.next();
			
			if(instrumento.esDeTipo(tipo)){
				instrumentosDeTipo.add(instrumento);
			}
		}
		return instrumentos;
	}
	public void mostrarInfo(){
		Iterator<Instrumento> i = instrumentos.iterator();
		while(i.hasNext()){
			Instrumento instrumentos = i.next();
			mostrarInfo();
		}
	}
	
	public ArrayList<Instrumento> getInstrumentoTocadoPor(String musico){
		ArrayList<Instrumento> instrumentoTocadoPor = new ArrayList<Instrumento>();
		Iterator i = this.instrumentos.iterator();
		while(i.hasNext()){
			Instrumento instrumento = i.next();
			if(instrumento.esTocadaPor(musico)){
				instrumentoTocadoPor.add(instrumento);
			}
			}return instrumentoTocadoPor;
		}





}
	
	
	




