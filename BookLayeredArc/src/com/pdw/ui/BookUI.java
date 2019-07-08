package com.pdw.ui;

import java.util.Scanner;

import com.pdw.services.BookService;

public class BookUI {
public static void main(String[] args) {
	int bookId=0;
	String title="";
	float price=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter book ID");
	bookId=sc.nextInt();
	System.out.println("Enter the Book Title");
	title=sc.next();
	System.out.println("Enter the Book price");
	price=sc.nextFloat();
	
	BookUI u=new BookUI();
	BookService bs=new BookService();
	int updated=bs.addBookService(bookId,title,price);
	System.out.println("inserted"+updated+"record");
}
}
