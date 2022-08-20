package com.cg.client;

import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService B=new BookServiceImpl();
		System.out.println("Total No.Of Books");
		System.out.println("Total Books: "+B.getBookCount());
		
		System.out.println("Listing Book with Id:102 ");
		System.out.println("Total Books: "+B.getBookById(102));
		
		System.out.println("Listing All Books: ");
		System.out.println("Total Books: "+B.getAllBooks());
		
		System.out.println("Book Written By Piyaa: ");
		System.out.println("Total Books: "+B.getAuthorBooks("Piyaa"));
		
		System.out.println("Book by title: ");
		System.out.println("Total Books: "+B.getBookByTitle("Java"));
		
		System.out.println("Listing book between 300 to 700");
		System.out.println("Total Books: "+B.getBookInPricerange(300,400));
		
	}

}
