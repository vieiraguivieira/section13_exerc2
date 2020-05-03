package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date date;
	private String title;
	private String content;
	private Integer likes;
	
	List<Comment> comments = new ArrayList<>();
	
	public Post(Date date, String title, String content, Integer likes) {
		this.date = date;
		this.title = title;
		this.content = content;
		this.likes = likes;
		}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Integer getLikes() {
		return likes;
	}
	
	public List<Comment> getComment() {
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	public void reomveComment(Comment comment) {
		comments.remove(comment);
	}

	public String toString() {
		return title + "\n" + likes + " likes " + "- " + sdf.format(date) + "\n" + content + "\n" + "Comments: ";
	}
	
	
	
}
