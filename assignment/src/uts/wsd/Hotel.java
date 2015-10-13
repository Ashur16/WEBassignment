package uts.wsd;

import java.io.Serializable;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement

public class Hotel implements Serializable {

@XmlAttribute
	private int id;
@XmlElement
	private String name;
	private String city;
	private String country;	

	private String address;
	private String number;
	private String email;
	
	
	public Hotel(int id, String name, String city, String country,
			String address, String number, String email) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.address = address;
		this.number = number;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


}
