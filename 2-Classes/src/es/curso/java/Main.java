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

/* This example explains:
 * 		- Class and object
 * 		- Attributes
 * 		- Public/Private methods
 * 		- Getters/Setters
 * 		- Static attributes
 *  
 * */

public class Main 
{ 
    public static void main (String [ ] args) throws Throwable 
    { 
        System.out.println ("Classes project!");
        
        MyClass m = new MyClass();
        m.setName("Class1");
        m.setNum(1);
        
        m.mStatic = "Static1";
        
        System.out.println( "object m: " + m.getName() + " - " + String.valueOf(m.getNum()) + " - " + m.mStatic);
        
        MyClass m2 = new MyClass("Class2", 2);        
        
        m2.mStatic = "Static2";
        
        System.out.println( "object m: " + m.getName() + " - " + String.valueOf(m.getNum()) + " - " + m.mStatic);
        System.out.println( "object m2: " + m2.getName() + " - " + String.valueOf(m2.getNum()) + " - " + m2.mStatic);
     } 
    
}