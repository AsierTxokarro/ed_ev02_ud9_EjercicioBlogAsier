package org.cuatrovientos.ed;

public class Slot {
	private int id;
	private Post post;

	public Slot(int id, Post post) {
		super();
		this.id = id;
		this.post = post;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Space [id=" + id + ", post=" + post + "]";
	
	}

	

	
}
