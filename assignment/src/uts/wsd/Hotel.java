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

	// Constructor for creating the hotel object with multiple parameters
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

	// Constructor that takes no parameters
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Returns the hotel objects id
	public int getId() {
		return id;
	}

	// Sets the hotel objects id
	public void setId(int id) {
		this.id = id;
	}

	// Returns the hotel objects name
	public String getName() {
		return name;
	}

	// Sets the hotel objects name
	public void setName(String name) {
		this.name = name;
	}

	// Returns the hotel objects city
	public String getCity() {
		return city;
	}

	// Sets the hotel objects city
	public void setCity(String city) {
		this.city = city;
	}

	// Returns the hotel objects country
	public String getCountry() {
		return country;
	}

	// Sets the hotel objects country
	public void setCountry(String country) {
		this.country = country;
	}

	// Returns the hotel objects address
	public String getAddress() {
		return address;
	}

	// Sets the hotel objects address
	public void setAddress(String address) {
		this.address = address;
	}

	// Returns the hotel objects number
	public String getNumber() {
		return number;
	}

	// Sets the hotel objects number
	public void setNumber(String number) {
		this.number = number;
	}

	// Returns the hotel objects email
	public String getEmail() {
		return email;
	}

	// Sets the hotel objects email
	public void setEmail(String email) {
		this.email = email;
	}

}
