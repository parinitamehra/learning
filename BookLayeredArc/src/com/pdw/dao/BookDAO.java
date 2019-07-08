package com.pdw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pdw.beans.BookBean;

public class BookDAO implements BookDaoI{
	public int addBook(BookBean bookBean)
	{
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			con=BookDB.getConnection1();
	String ins_str="insert into book values(?,?,?,?)";
			ps=con.prepareStatement(ins_str);
			ps.setInt(1, bookBean.getBookId());
			ps.setString(2, bookBean.getTitle());
			ps.setFloat(3, bookBean.getPrice());
			ps.setString(4,bookBean.getGrade());
			
			int updateCount =ps.executeUpdate();
			con.close();
			return updateCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
}
