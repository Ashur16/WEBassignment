package uts.wsd;

import java.io.Serializable;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement

public class User implements Serializable {

@XmlAttribute
	private int id;
@XmlRootElement
	private String name;
	private String city;
	private String country;
	private String address;	
	private String number;
	private String email;
	

}
