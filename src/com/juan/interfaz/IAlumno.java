package com.juan.interfaz;

import java.util.ArrayList;
import com.juan.clases.Materia;

public interface IAlumno {

	public int getLibreta();

	public void setLibreta(int libreta);

	public String getNombre();

	public void setNombre(String nombre);

	public String getApellido(); 
	
	public void setApellido(String apellido) ;

	public ArrayList<Materia> getMaterias();
	
	public void agregarMateria(String nombre, int nota);

	public boolean estaAprobada (int nota);  

	public int calcularPromedio();
}
