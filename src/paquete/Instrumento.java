package paquete;

import java.util.ArrayList;

public class Instrumento implements InstrumentoMusical{
	public String nombre;
	public String tipo;
	public String subtipo;
	public String notaFinal;
	public String notaAfinada;


	ArrayList<String> musicos;
	
	public Instrumento(){
		
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getSubtipo() {
		return subtipo;
	}


	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}


	public String getNotaFinal() {
		return notaFinal;
	}


	public void setNotaFinal(String notaFinal) {
		this.notaFinal = notaFinal;
	}

	public String getNotaAfinada() {
		return notaAfinada;
	}


	public void setNotaAfinada(String notaAfinada) {
		this.notaAfinada = notaAfinada;
	}

	public ArrayList<String> getMusicos() {
		return musicos;
	}


	public void setMusicos(ArrayList<String> musicos) {
		this.musicos = musicos;
	}


	public void Instrumento() {
		this.musicos = new ArrayList<String>();
	}

	public void addMusico(String musico) {
		this.musicos.add(musico);	
	}


	@Override
	public void mostrarInfo() {
		System.out.println("Informacion: Nombre:" + this.nombre.toUpperCase());
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Subtipo: " + this.subtipo);
		System.out.println("Afinacion: " + this.notaAfinada);
		
	}


	@Override
	public boolean afinado_a(String nota) {
		return this.notaAfinada.equals(nota);
	}


	@Override
	public String tocar() {
		return this.nombre + " está sonando";
	}
	
	boolean esDeTipo(String tipo){
		if(this.tipo.equals(tipo)){
			return true;
		}else{
			return false;
		}
	}
	
	boolean esTocadaPor(String musico){
		return this.musicos.contains(musico);
		
	}
}
