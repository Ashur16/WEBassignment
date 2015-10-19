package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import uts.wsd.Author;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "reviewList")
public class ReviewArticles implements Serializable {
	@XmlElement(name = "article")
	private ArrayList<ReviewArticle> articleList = new ArrayList<ReviewArticle>();
	
	// Constructor
	public ReviewArticles() {
		super();
	}

	// Return the entire article list
	public ArrayList<ReviewArticle> getList() {
		return articleList;
	}
	
	// Return article by passing article id
	public ReviewArticle getArticleByArticleId(int id) {
		for(ReviewArticle article : articleList) {
			if(article.getId() == (id))
				return article;
		}
		
		return null;
	}
	
	// Add new article into the list
	public void addArticle(ReviewArticle article) {
		articleList.add(article);
	}
	
	// Add new article list into the existing list
	public void addArticleList(ArrayList<ReviewArticle> list) {
		articleList.addAll(list);
	}
	
	// Remove the particular article
	public void removeArticle(ReviewArticle article) {
		articleList.remove(article);
	}
	
	// Return total number of author's article
	public int getAuthorArticleLength(int authorId) {
		int count = 0;
		
		for(ReviewArticle article : articleList) {
			if(article.getAuthorId() == (authorId))
				count++;
		}
		return count;
	}
	
	// Return article list that is particular author 
	public ArrayList<ReviewArticle> getAuthorArticle(int authorId) {
		ArrayList<ReviewArticle> list = new ArrayList<ReviewArticle>();
		
		for(ReviewArticle articles : articleList) {
			if(articles.getAuthorId() == authorId)
				list.add(articles);
		}
		return list;
	}
	
	// Check is match between authorId and articleId
	public boolean isMatchAuthor(int authorId, int id) {
		for(ReviewArticle articles : articleList) {
			if(articles.getAuthorId() == authorId && articles.getId() == id)
				return true;
		}
		return false;
	}
}
