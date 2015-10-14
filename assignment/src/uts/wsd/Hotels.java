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
    
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setHotels(ArrayList<Hotel> list) {
		this.hotels = list;
	}
	public ArrayList<Hotel> getHotels() {
        return hotels;
    }
    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }
    public void removeHotel(Hotel hotel) {
        hotels.remove(hotel);
    }
	
}