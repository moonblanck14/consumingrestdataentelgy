package com.prueba.consumingrestdataentelgy.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment{


	private int postId;
	private int id;
	private String name;
	private String email;
	private String body;
	
	public int getPostId() {
		return postId;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getBody() {
		return body;
	}

	@Override
	public String toString() {
		return postId + "|" + id + "|" + email;
	}
	
	
	
	

}
