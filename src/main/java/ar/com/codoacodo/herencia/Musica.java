package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class Musica extends Articulo {
	
	private String [] temas;

	public Musica(String titulo, Float precio, String img) {
		super(titulo, precio, img);
		
		
		// TODO Auto-generated constructor stub
	}

	public String[] getTemas() {
		return temas;
	}

	public void setTemas(String[] temas) {
		this.temas = temas;
	}

	@Override
	public String toString() {
		return "Musica [temas=" + Arrays.toString(temas) + "]";
	}

	
}
