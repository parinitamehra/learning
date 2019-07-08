package com.pdw.beans;

public class BookBean {
private  int bookId;
private String title;
private  float price;
private String grade;


@Override
public String toString() {
	return "BookBean [bookId=" + bookId + ", title=" + title + ", price=" + price + "]";
}

public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}
public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}
}
