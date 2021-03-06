package uts.wsd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.bind.*;


public class LoginApp {
	
	private String filePath;
	private Authors authors;	
	
	// Constructor that takes no parameters
	public LoginApp() {
		super();
		
	}
	
	public String getFilePath() {
		return filePath;
	}
	
	// Sets the filepath and allows for unmarshalling from file
	public void setFilePath(String filePath) throws JAXBException, IOException {
		this.filePath = filePath;
		
		// Create the unmarshaller
		JAXBContext jc = JAXBContext.newInstance(Authors.class);
		Unmarshaller u = jc.createUnmarshaller();
		 
		// Now unmarshal the object from the file
		FileInputStream fin = new FileInputStream(filePath);
		authors = (Authors)u.unmarshal(fin); 
		fin.close();
	}
	// Returns list of authors
	public Authors getAuthors() {
		return authors;
		
	}
	// Sets list of authors
	public void setAuthors(Authors authors) {
		this.authors = authors;
	}

}
