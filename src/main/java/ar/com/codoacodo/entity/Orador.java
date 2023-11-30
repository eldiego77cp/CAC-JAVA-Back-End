package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class Orador {
	
	// Las clases deben tener atributos privados y metodos publicos
	//atributos: encapsulamiento
	
	private Long id;
	private String nombre;
	private String apellido;
	private String mail;
	private String tema;
	private LocalDate fecha_alta;
	
	
	//contructores (polimormismos por sobrecarga)
	
	public Orador(String nombre, String apellido, String mail, String tema, LocalDate fecha_alta) {
		init(nombre, apellido, mail, tema, fecha_alta);
	}


	public Orador(Long id, String nombre, String apellido, String mail, String tema, LocalDate fecha_alta) {
		this.id = id;
		init(nombre, apellido, mail, tema, fecha_alta);
	}
	
	private void init(String nombre, String apellido, String mail, String tema, LocalDate fecha_alta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
		this.fecha_alta = fecha_alta;
	}


	//cambiar metodo toString() de la clase object
	//otra forma de polimoformismo: SOBREESCRITURA, metodo que existe en una clase base (java.lang.Object)
	@Override
	public String toString() {
		return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", tema="
				+ tema + ", fecha_alta=" + fecha_alta + "]";
	}
	
	//getters y setters
	
	public Long getId() {
		return this.id;
	}
	
	/* No tiene sentido porque viene desde la bd y esta predefinido. No se podria cambiar
	public void setId(Long id) {
		this.id = id;
	}
	*/

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		if(nombre != null) {
		this.nombre = nombre;
		}else {
			this.nombre = "N/A";
		}
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}


	public LocalDate getFecha_alta() {
		return fecha_alta;
	}


	public void setFecha_alta(LocalDate fecha_alta) {
		this.fecha_alta = fecha_alta;
	}


	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	

}
