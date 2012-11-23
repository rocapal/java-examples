/*
 *    Copyright (C) 2012 - Roberto Calvo Palomino
 * 
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program; if not, write to the Free Software
 *    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *    
 *    
 *    Authors: Roberto Calvo <rocapal [at] gmail [dot] com>
 */


package es.curso.java;

public class Foo {
	
	public class CheckException extends Exception {
	
		private String msgException;
		private static final long serialVersionUID = 1L;

		public CheckException() {}
		
		public CheckException(String message) 
		{
			msgException = message;
		}
		
		public String toString()
		{
		    return "CheckException: " + msgException;
		}  
	
	}
	
	
	public Foo()
	{		
	}
	
	public void doSomething ()
	{
		try
		{
			Integer.parseInt("hola");
		}
		catch(NumberFormatException e) {
		    System.out.println("Must enter integer as first argument.");
		    System.out.println("Exception: " + e.getMessage());
		    return;
		}
	}
	
	public void check () throws CheckException
	{
		throw new CheckException("This message is an example of msg exception");
	}

}
