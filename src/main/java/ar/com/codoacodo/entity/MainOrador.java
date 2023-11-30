package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orador nuevoOrador = new Orador("Carlos", "Lopez", "carlos.lopez@gmail.com", "JAVA", LocalDate.now());
		
		System.out.println(nuevoOrador);
	}

}
