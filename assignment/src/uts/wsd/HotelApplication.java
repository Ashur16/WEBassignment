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
	public Hotels getHotels() {
		return hotels;
	}
	public void setHotels(Hotels hotels) {
		this.hotels = hotels;
	}

	
	public List<Hotel> getHotelList() {
		return hotels.getList();
		
	}
	
	public Hotel getHotel(int id){
		for (Hotel hotel : getHotelList()) {
			if (hotel.getId() == id)
				return hotel;
		}
		return null;
	}
	
	
	
	
	
}
