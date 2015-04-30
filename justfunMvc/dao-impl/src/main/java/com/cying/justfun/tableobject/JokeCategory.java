package com.cying.justfun.tableobject;

import java.io.Serializable;

public class JokeCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int joke_category_id;
	private String title;
	private int parent_id;
	public int getJoke_category_id() {
		return joke_category_id;
	}
	public void setJoke_category_id(int joke_category_id) {
		this.joke_category_id = joke_category_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

}
