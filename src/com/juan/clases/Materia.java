package com.juan.clases;

import com.juan.interfaz.IMateria;

public class Materia implements IMateria {
	
	private String nombre;
	private int nota;
	
	public Materia(String nombre, int nota)
	{
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public int getNota() 
	{
		return nota;
	}

	public void setNota(int nota)
	{
		this.nota = nota;
	}

}
