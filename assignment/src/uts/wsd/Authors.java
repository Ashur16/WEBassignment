package uts.wsd; 
import java.util.*;
import java.io.Serializable;

import javax.xml.bind.annotation.*;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "authors")
public class Authors implements Serializable {
	// Constructor for authors that takes no parameters
	public Authors() {
		super();
		// TODO Auto-generated constructor stub
	}
	@XmlElement(name = "title")
    private String title;
	
	// Used to create a new array list of authors
	@XmlElement(name = "author")
    private ArrayList<Author> list = new ArrayList<Author>();
	
	// Used to return a list of authors for the website
    public ArrayList<Author> getList() {
        return list;
    }
    // Used to add a new author to the array list 
    public void addAuthor(Author author) {
        list.add(author);
    }
    // Used to remove an author from the array list
    public void removeAuthor(Author author) {
        list.remove(author);
    }
    // Used to verify authors login details from that in the list.
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
