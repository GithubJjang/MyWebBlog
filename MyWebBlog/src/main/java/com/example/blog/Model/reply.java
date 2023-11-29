package com.example.blog.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class reply {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String title;
	
	private String content;
	
	// board : reply = N : 1
	@ManyToOne
	private board board;
	
	// user : reply = N : 1
	@ManyToOne
	private user user;

	//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public board getBoard() {
		return board;
	}

	public void setBoard(board board) {
		this.board = board;
	}

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}
	
	
	
	
}
