package org.koushik.javabrains.messenger.model;

import java.util.Date;

public class Comment {
	private long id;
	private String message;
	private Date created;
	private String autor;
	
	public Comment(long id, String message, String autor) {
		super();
		this.id = id;
		this.message = message;
		this.autor = autor;
		this.created = new Date();
	}
	
	public Comment() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
	
}
