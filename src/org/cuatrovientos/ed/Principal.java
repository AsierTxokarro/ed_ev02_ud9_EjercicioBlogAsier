package org.cuatrovientos.ed;


import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String option = "";	
		
		Scanner reader = new Scanner(System.in);
		System.out.println("CREATE NEW BLOG");
		System.out.println("What is the name of the blog ?");
		String blogName = reader.nextLine();		
		System.out.println("What is the name of the blog owner?");
		String blogOwner = reader.nextLine();	
		
		//Si ha creado el blog ya puede trabajar con posts
		Blog blog = new Blog(blogName, blogOwner);
		
			do {
				// Mostrar menu
				menu();
				option = reader.nextLine();
				stateMachine(option, blog);
				
			}while(!option.equals("5"));	
		

	}
	
	
	private static void menu() {
		System.out.println("[o===o]----Welcome to Blog owner----[o===o]");
		System.out.println("Select an option:");
		System.out.println("1. Add a new post");
		System.out.println("2. Delete a post");
		System.out.println("3. Show all posts");
		System.out.println("4. Show post by slot id");
		System.out.println("5. Exit");
	}
	
	private static void stateMachine(String option, Blog blog) {
		Scanner reader = new Scanner(System.in);
		String name = "";
		String body = "";
		LocalDate date = LocalDate.now();
		
		//String option = "";
		
		switch (option) {
		case "1":
			// Add a new post
			System.out.println("Please, enter post name: ");
			name = reader.nextLine(); 
			System.out.println("Please, enter the body: ");
			body = reader.nextLine();
			
			Post post = new Post(name, date, body);
			
			if(blog.add(post)) {
				System.out.println("Blog "+name+" added");
			} else {
				System.out.println("Post can not be added");
			}
			break;	
		case "2":
			// Delete a post
			System.out.println("Please, enter post name to remove");
			name = reader.nextLine();
			
			if(blog.remove(name)) {
				System.out.println("Post "+name+" removed");
			} else {
				System.out.println("Post can not be removed");
			}						
			break;				
		
		case "3":
			// Show all posts
			System.out.println(blog.showAll());
			break;
		default:
			break;
			
		case "4":
			// show post by id
			  System.out.println("Enter slot id (0-" + (blog.gerMaxSize()- 1) + "): ");
			    int id = Integer.parseInt(reader.nextLine());
			    Post p = blog.showPostBySlotId(id);
			    if (p != null) {
			        System.out.println(p);
			    } else {
			        System.out.println("No post found in that slot (or invalid id).");
			    }
			    break;
		}
	}

}
