package uts.wsd; 
import java.util.*;
import java.io.Serializable;

import javax.xml.bind.annotation.*;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "authors")
public class Authors implements Serializable {
	
	public Authors() {
		super();
		// TODO Auto-generated constructor stub
	}
	@XmlElement(name = "title")
    private String title;

	@XmlElement(name = "author")
    private ArrayList<Author> list = new ArrayList<Author>();
 
    public ArrayList<Author> getList() {
        return list;
    }
    public void addAuthor(Author author) {
        list.add(author);
    }
    public void removeAuthor(Author author) {
        list.remove(author);
    }
    public Author login(String email, String password) {
        // For each user in the list...
        for (Author author : list) {
            if (author.getEmail().equals(email) && author.getPassword().equals(password))
                return author; // Login correct. Return this user.
        }
        return null; // Login incorrect. Return null.
    }
    public Author login(String email) {
        // For each user in the list...
        for (Author author : list) {
            if (author.getEmail().equals(email))
                return author; // Login correct. Return this user.
        }
        return null; // Login incorrect. Return null.
    }
    
}
