package com.privalia.presentation.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//Este se esta haciendo por atributo

@Component(value = "helloWorld")
public class HelloWorld {
	@Autowired
	@Value("Hello World From Annotatons!")
	private String hello;

	/**
	 * @return the hello
	 */
	public String getHello() {
		return hello;
	}

	/**
	 * @param hello the hello to set
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}

	
}
