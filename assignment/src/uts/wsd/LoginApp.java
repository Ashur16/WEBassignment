package uts.wsd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.bind.*;


public class LoginApp {
	
	private String filePath;
	private Authors authors;	
	
	public LoginApp() {
		super();
		
	}
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) throws JAXBException, IOException {
		this.filePath = filePath;
		
		// Create the unmarshaller
		JAXBContext jc = JAXBContext.newInstance(Authors.class);
		Unmarshaller u = jc.createUnmarshaller();
		 
		// Now unmarshal the object from the file
		FileInputStream fin = new FileInputStream(filePath);
		authors = (Authors)u.unmarshal(fin); // This loads the "shop" object
		fin.close();
	}
	public Authors getAuthors() {
		return authors;
	}
	public void setAuthors(Authors authors) {
		this.authors = authors;
	}


}
