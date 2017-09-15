package com.cqut.edn.cookies;

/**
 * 这是一本书的ＪａｖａＢｅａｎ
 * @author Administrator
 *
 */
public class Book {

	private String name;
	private String author;
	private float price;
	private String publish;
	private String ID;
	
	public String getID() {
		return ID;
	}


	public void setID(String id) {
		ID = id;
	}


	public Book(){
		
	}
	


	public Book(String name, String author, float price, String publish,
			String id) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.publish = publish;
		ID = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	
	
	
	
}
