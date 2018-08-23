package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.entity.annotations");
		annotationContext.refresh();
		
		Student student = (Student) annotationContext.getBean("student");
		Address address = (Address) annotationContext.getBean("address");
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(student.getIdStudent());
		stringBuilder.append(" ");
		stringBuilder.append(student.getName());
		stringBuilder.append(" ");
		stringBuilder.append(student.getSurname());
		stringBuilder.append(" ");
		stringBuilder.append(student.getAge());
		stringBuilder.append(" ");
		stringBuilder.append(address.getIdAddress());
		stringBuilder.append(" ");
		stringBuilder.append(address.getStreet());
		System.out.println(stringBuilder.toString());
		
		annotationContext.close();

	}

}
