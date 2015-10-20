package uts.wsd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.*;

public class HotelApplication implements Serializable {
	private String filePath;
	private Hotels hotels;  
	
	public String getFilePath() {
		return filePath;
	}
	// // Sets the filepath and allows for unmarshalling from file
	public void setFilePath(String filePath) throws JAXBException, IOException {
		this.filePath = filePath;
		// Create the unmarshaller
		JAXBContext jc = JAXBContext.newInstance(Hotels.class);
		Unmarshaller u = jc.createUnmarshaller();
		 
		// Now unmarshal the object from the file
		FileInputStream fin = new FileInputStream(filePath);
		hotels = (Hotels)u.unmarshal(fin); // This loads the "shop" object
		fin.close();
	}
	
	// Returns the hotels object
	public Hotels getHotels() {
		return hotels;
	}
	
	// Sets the hotels object
	public void setHotels(Hotels hotels) {
		this.hotels = hotels;
	}

	// Returns the hotels array list	
	public List<Hotel> getHotelist() {
		return hotels.getHotels();
		
	}
	// Returns a hotel using the id
	public Hotel getSingleHotel(int id){
		for (Hotel hotel : getHotelist()) {
			if (hotel.getId() == id)
				return hotel;
		}
		return null;
	}
	
	
	
	
	
}
