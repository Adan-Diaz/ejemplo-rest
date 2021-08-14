package edu.ieu.ejemplorest.api;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Saludo {
	private String nombre;
	private String texto;
	
	public Saludo() {
		super();
	}

	public Saludo(String nombre, String texto) {
		super();
		this.nombre = nombre;
		this.texto = texto;
	}

	@XmlElement
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
