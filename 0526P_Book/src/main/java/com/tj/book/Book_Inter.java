package com.tj.book;

import java.util.ArrayList;

public interface Book_Inter {
	
	public void input_save(String book, String author, String booknum, int price);
	public ArrayList<BookDTO> list_out();
	public BookDTO modifyView_out(String booknum);
	public void modify(String book, String author, int price, String booknum);
	public void delete(String booknum);

}
