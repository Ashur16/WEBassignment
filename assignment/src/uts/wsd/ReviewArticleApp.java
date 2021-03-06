package uts.wsd;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import uts.wsd.Author;
import uts.wsd.Authors;

public class ReviewArticleApp implements Serializable{
	private String filePath;
	private ReviewArticles articles;
	
	
	public ReviewArticleApp(){
	}
	
	// Getting the file path
	public String getFilePath() {
		return filePath;
	}
	
	// Setting the file path
	public void setFilePath(String filePath) throws JAXBException, IOException {
		this.filePath = filePath;
		
		// Create the unmarshaller
		JAXBContext jc = JAXBContext.newInstance(ReviewArticles.class);
		Unmarshaller u = jc.createUnmarshaller();
		 
		// Now unmarshal the object from the file
		FileInputStream fin = new FileInputStream(filePath);
		articles = (ReviewArticles)u.unmarshal(fin); // This loads the "shop" object
		fin.close();	
	}
	
	// Get review articles
	public ReviewArticles getReviewArticles() {
		return articles;
	}
	// Get articles list by passing authorId
	public ArrayList<ReviewArticle> getArticles(int authorId) {
		return articles.getAuthorArticle(authorId);
	}
	
	// Get entire article list
	public ArrayList<ReviewArticle> getAllArticles() {
		return articles.getList();
	}
	
	// Return article by passing article id
	public ReviewArticle getArticleByArticleId(int id) {
		return articles.getArticleByArticleId(id);
	}
	
	// Returns a article using the hotel id
	public ReviewArticle getSingleArticle(int id){
		for (ReviewArticle article : getAllArticles()) {
			if (article.getHotelId() == id)
				return article;
		}
		return null;
	}
	
	//Remove article by passing articleId
	public void removeArticleById(int articleId) {
		Iterator<ReviewArticle> iterator = articles.getList().iterator();
		while(iterator.hasNext()) {
			ReviewArticle article = iterator.next();
			if(article.getId() == articleId) {
				iterator.remove();
				try {
					writingXMLFile();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (JAXBException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// Add new article into the list
	public void addArticle(ReviewArticle article) {
		articles.addArticle(article);
		try {
			writingXMLFile();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	// Re-write the existing XML file
	private void writingXMLFile() throws IOException, JAXBException {
		 // print filePath in console
		 System.out.println(filePath);
		 // Boilerplate code to convert objects to XML...
		 JAXBContext jc = JAXBContext.newInstance(ReviewArticles.class);
		 BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		 Marshaller m = jc.createMarshaller();
		 m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		 m.marshal(articles, writer);
		 
		 // print all detail in console
		 m.marshal(articles, System.out);
		 
		 writer.close();
	}

}
