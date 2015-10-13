package uts.wsd;
 
import java.util.*;
import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "site")
public class Hotels implements Serializable {
    @XmlElement(name = "title")
    private String title;
    @XmlElementWrapper(name = "hotel")
    private ArrayList<Hotel> list = new ArrayList<Hotel>();
 
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setList(ArrayList<Hotel> list) {
		this.list = list;
	}
	public ArrayList<Hotel> getList() {
        return list;
    }
    public void addUser(Hotel user) {
        list.add(user);
    }
    public void removeUser(Hotel user) {
        list.remove(user);
    }
}