package com.cying.justfun.tableobject;

import java.io.Serializable;

public class Joke implements Serializable {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int  joke_id;
   private int joke_category_id;
   private String content;
   private String title;
public int getJoke_id() {
	return joke_id;
}
public void setJoke_id(int joke_id) {
	this.joke_id = joke_id;
}
public int getJoke_category_id() {
	return joke_category_id;
}
public void setJoke_category_id(int joke_category_id) {
	this.joke_category_id = joke_category_id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
}
