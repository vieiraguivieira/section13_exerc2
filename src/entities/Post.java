package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
// private static é para ter só uma cópia para a aplicação inteira
	
	private Date date;
	private String title;
	private String content;
	private Integer likes;
	
	List<Comment> comments = new ArrayList<>();
	
	public Post(){
		}
	
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
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append("Likes - ");
		sb.append(likes);
		sb.append(sdf.format(date) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: " + "\n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
	
	
	
}
