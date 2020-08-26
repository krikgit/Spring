package com.krik.mypkg;

public class Book {
	
	private int bid;
	private String bookName;
	private String author;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void paint() {
		System.out.println(getBid()+" "+getBookName()+" "+getAuthor());
	}
}
