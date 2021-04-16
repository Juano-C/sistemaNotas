package com.juan.clases;

public class Utilidades
{
	static boolean esNumerico(String cadena)
	{
		try
		{
			Integer.parseInt(cadena);
			return true;
		}
		catch (NumberFormatException nfe)
		{
			return false;
		}
	}
}
