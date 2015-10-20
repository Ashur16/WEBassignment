package uts.wsd;

import java.io.Serializable;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "author")
public class Author implements Serializable {
	@XmlElement
	String email;
	@XmlElement
	String name;
	@XmlElement
	String password;
	  
	// Constructor for initialising object
	public Author(String email, String name, String password) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		
	}
	// Used to return the email address of an author		
	public String getEmail() {
		return email;
	}
	// Used to set the email address of an author
	public void setEmail(String email) {
		this.email = email;
	}
	// Used to return the name of an author
	public String getName() {
		return name;
	}
	// Used to set the name of an author
	public void setName(String name) {
		this.name = name;
	}
	// Used to return the password of an author
	public String getPassword() {
		return password;
	}
	// Used to set the name of an author
	public void setPassword(String password) {
		this.password = password;
	}

	

	/**
	 * 
	 */
	// A constructor used that takes no parameters
	public Author() {
		// TODO Auto-generated constructor stub
	}

}
