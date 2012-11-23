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

import java.util.ArrayList;


public class Main 
{ 
    public static void main (String [ ] args) 
    { 
        System.out.println ("Project: Inheritance");
        
        Student p1 = new Student("Pedro", "Garcia", 7.5);
        Teacher p2 = new Teacher("Adolfo", "Perez", "Programación Avanzada");
        
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        
        System.out.println("\n- Listing:");
        for (Person person : list) {
        	if (person instanceof Student)
        		System.out.print ("[S] ");
        	else if (person instanceof Teacher)
        		System.out.print ("[T] ");
        	
        	System.out.println(person.getName() + " " + person.getSurname());
        }
        
        
        System.out.println("\n- Listing details:");
        for (Person person : list) {
			
        	if (person instanceof Student)
        	{
        		Student s = (Student) person;
        		System.out.println ("Student: " + s.getName() + " " + s.getSurname() + " - " + s.getMark().toString());
        	}
        	else if (person instanceof Teacher)
        	{
        		Teacher t = (Teacher) person;
        		System.out.println ("Teacher: " + t.getName() + " " + t.getSurname() + " - " + t.getSubject());
        	}
        	else
        		System.out.println("Type not recognized");
		}
    } 
    
}