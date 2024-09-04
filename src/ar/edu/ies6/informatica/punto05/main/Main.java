package ar.edu.ies6.informatica.punto05.main;

import java.time.LocalDate;

import ar.edu.ies6.informatica.punto05.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//usando constructor por defecto
		Persona persona1=new Persona();
		persona1.setDni("44015412");
		persona1.setNombre("Julien Man");
		persona1.setFechaNac(LocalDate.of(2004, 11, 23));
		persona1.setProvincia("Catamarca");
		persona1.mostrarDatos();
		System.out.println();
//usando constructo parametrizado
		Persona persona2=new Persona("434356756","Juana Manson",LocalDate.of(1996, 6, 12),"Cordoba");
		persona2.mostrarDatos();
		System.out.println();
// usando ponstructo de jujuy
		Persona persona3=new Persona("67676854","Ortencio Salinas",LocalDate.of(2011, 9, 12));
		persona3.mostrarDatos();
		System.out.println();
		
		
	}

}