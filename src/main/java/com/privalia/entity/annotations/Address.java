package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	
	private int idAddress;
	private String street;
	
	
	public Address() {
		
	}
	
	public Address(@Value("1")int idAddress,@Value("Barcelona") String street) {
		super();
		this.idAddress = idAddress;
		this.street = street;
	}
	/**
	 * @return the idAddress
	 */
	public int getIdAddress() {
		return idAddress;
	}
	/**
	 * @param idAddress the idAddress to set
	 */
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	

}
