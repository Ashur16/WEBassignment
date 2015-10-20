package uts.wsd;
 
import java.util.*;
import java.io.Serializable;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "site")
public class Hotels implements Serializable {
	@XmlElement(name = "title")
    private String title;
    @XmlElementWrapper(name = "hotels")
    @XmlElement(name = "hotel")
    private ArrayList<Hotel> hotels = new ArrayList<Hotel>();
   
    public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	}
    public Hotels(String title) {
		super();
		this.title = title;
	}
    
    // Return the title of the hotels object
    public String getTitle() {
		return title;
	}
    
    // Sets the title of the hotels object
	public void setTitle(String title) {
		this.title = title;
	}

	// Sets the hotel array list
	public void setHotels(ArrayList<Hotel> list) {
		this.hotels = list;
	}
	
	// Returns the hotels array list
	public ArrayList<Hotel> getHotels() {
        return hotels;
    }
	
	// Adds a hotel to the hotel array list
    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }
    
    // Removes a hotel from the hotel array list
    public void removeHotel(Hotel hotel) {
        hotels.remove(hotel);
    }
	
}