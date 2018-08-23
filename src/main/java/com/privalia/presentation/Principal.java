package com.privalia.presentation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		// Setter Injection Hello World
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		
		System.out.println(helloWorld.getHello());
		
		//Constructor Injection Hello World
		
		HelloWorld helloWorldConst = (HelloWorld) context.getBean("helloWorldConst");
		
		System.out.println(helloWorldConst.getHello());
		
		// Setter Injection Alumno
		Alumno alumno = (Alumno) context.getBean("alumno");
		
		System.out.println(alumno.getIdAlumno());
		System.out.println(alumno.getNombre());
		System.out.println(alumno.getApellidos());
		System.out.println(alumno.getDni());
		
		//Constructor Injection Alumno
		
		Alumno alumnoConst = (Alumno) context.getBean("alumnoConst");
		
		System.out.println(alumnoConst.getIdAlumno());
		System.out.println(alumnoConst.getNombre());
		System.out.println(alumnoConst.getApellidos());
		System.out.println(alumnoConst.getDni());
		
		context.close();

	}

}
