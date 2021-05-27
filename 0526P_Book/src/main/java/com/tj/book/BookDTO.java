package com.tj.book;

public class BookDTO {
	private String book;
	private String author;
	private String booknum;
	private int price;

	public BookDTO() {
		super();
	}

	public BookDTO(String book, String author, String booknum, int price) {
		super();
		this.book = book;
		this.author = author;
		this.booknum = booknum;
		this.price = price;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBooknum() {
		return booknum;
	}

	public void setBooknum(String booknum) {
		this.booknum = booknum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
