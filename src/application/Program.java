package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date1 = sdf.parse("25/06/2018 13:05:44");
		String title1 = "Traveling to New Zeland";
		String content1 = "I'm going to visit this wonderful country";
		int likes1 = 12;
		
		Comment c1 = new Comment ("Have a nice trip");
		Comment c2 = new Comment ("Wow that's awesome!");

		Post post1 = new Post(date1, title1, content1, likes1);
			
		post1.addComment(c1);
		post1.addComment(c2);

		Date date2 = sdf.parse("28/07/2018 23:14:19");
		String title2 = "Good night guys";
		String content2 = "See you tomorrow";
		int likes2 = 5;
		
		Comment c3 = new Comment ("Good night");
		Comment c4 = new Comment ("May the force be with you");
		
		Post post2 = new Post(date2, title2, content2, likes2);
		
		post2.addComment(c3);
		post2.addComment(c4);

		System.out.println(post1 + "\n" + c1.getText() + "\n" + c2.getText());
		System.out.println();
		System.out.println(post2 + "\n" + c3.getText() + "\n" + c4.getText());

	}

}
