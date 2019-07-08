package com.pdw.services;

import com.pdw.beans.BookBean;
import com.pdw.dao.BookDAO;

public class BookService  implements BookServiceI{
	public int addBookService(int bookId,String title,float price)
	{
		String grade="";
		if(price<=300)
		{
			grade ="C";
		}
		if(price<=600)
		{
			grade ="B";
		}
		else
		{
			grade ="A";
		}
		BookDAO bookDAO=new BookDAO();
		BookBean bookBean= new BookBean();
		//wrap data into bean
		bookBean.setBookId(bookId);
		bookBean.setTitle(title);
		bookBean.setPrice(price);
		bookBean.setGrade(grade);
		int updateResult=0;
		try 
		{
			updateResult=bookDAO.addBook(bookBean);//method of BookDAO class sending the changes to Dao
			return updateResult;
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		return updateResult;
	}

	
}
