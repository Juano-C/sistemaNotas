package com.juan.clases;

import java.util.ArrayList;
import com.juan.interfaz.IAlumno;

public class Alumno implements IAlumno{
	
	private int libreta;
	private String nombre;
	private String apellido;
	private ArrayList<Materia> materias;
	private int contadorNota;
	
	public Alumno(int libreta, String nombre, String apellido)
	{
		this.libreta = libreta;
		this.nombre= nombre;
		this.apellido = apellido;
		this.contadorNota =0;
		this.materias = new ArrayList<Materia>();		
	}

	public int getLibreta() 
	{
		return libreta;
	}
	
	public void setLibreta(int libreta)
	{
		this.libreta = libreta;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getApellido() 
	{
		return apellido;
	}
	
	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}	
	
	public ArrayList<Materia> getMaterias()
	{
		return materias;
	}
	
	public void agregarMateria(String nombre, int nota)
	{
		if(estaAprobada(nota))
		{
			if(this.materias.contains(nombre))
				throw new RuntimeException ("la materia ya esta ingresada");
			else
			{
				Materia materia = new Materia(nombre, nota);
				materias.add(materia);
			}
		}
	}
	
	public boolean estaAprobada(int nota)
	{
		if(nota>=4 && nota<=10)
		{
			this.contadorNota = this.contadorNota + nota;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int calcularPromedio()   
	{                                                                                              
		return this.contadorNota = this.contadorNota/materias.size();	                               
	}
	
}
