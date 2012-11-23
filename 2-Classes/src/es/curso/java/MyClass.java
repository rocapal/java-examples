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

public class MyClass {
	
	// Attr
	private String mName = null;
	private Integer mNum = null;
	
	public static String mStatic = null;
	
	//Constructor
	public MyClass()
	{
		System.out.println("Constructor");		
		
	}
	
	public MyClass (String name, Integer num)
	{
		System.out.println("Constructor2");
		mName = name;
		mNum = num;
	}
	
	
	//Destructor
	protected void finalize() throws Throwable
	{
		super.finalize();
		System.out.println("Destructor");
	}
	
	// Setters
	public void setName (String name)
	{
		mName = name;
	}
	
	public void setNum (Integer num)
	{
		mNum = num;
	}
	
	//Getters
	public String getName()
	{
		return mName;	
	}
	
	public Integer getNum()
	{
		return mNum;
	}
	

}
