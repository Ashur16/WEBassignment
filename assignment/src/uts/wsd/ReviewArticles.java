package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import uts.wsd.Author;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "blog_article")
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
	public ReviewArticle getArticleByArticleId(String articleId) {
		for(ReviewArticle article : articleList) {
			if(article.getArticleId().equals(articleId))
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
	public int getAuthorArticleLength(String authorId) {
		int count = 0;
		
		for(ReviewArticle article : articleList) {
			if(article.getAuthorId().equals(authorId))
				count++;
		}
		return count;
	}
	
	// Return article list that is particular author 
	public ArrayList<ReviewArticle> getAuthorArticle(String authorId) {
		ArrayList<ReviewArticle> list = new ArrayList<ReviewArticle>();
		
		for(ReviewArticle articles : articleList) {
			if(articles.getAuthorId().equals(authorId))
				list.add(articles);
		}
		return list;
	}
	
	// Check is match between authorId and articleId
	public boolean isMatchAuthor(String authorId, String articleId) {
		for(ReviewArticle articles : articleList) {
			if(articles.getAuthorId().equals(authorId) && articles.getArticleId().equals(articleId))
				return true;
		}
		return false;
	}
}
