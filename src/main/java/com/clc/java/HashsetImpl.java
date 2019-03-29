package com.clc.java;

import java.util.HashSet;

public class HashsetImpl {
	
	public static void main(String[] args) {
		
		Book b1 = new Book(1, "A", 12333);
		Book b2 = new Book(1, "A", 12333);
		Book b3 = null;
		Book b4= b1;
		
		HashSet<Book> books = new HashSet();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b1);
		books.add(b2);
		
		System.out.println(books);
		System.out.println(books.size());
		
		if(true)
			return;
		
		HashSet<Integer> setOfNums = new HashSet<>();
		setOfNums.add(new Integer(10));
		setOfNums.add(new Integer(10));
		setOfNums.add(111);
		setOfNums.add(12);
		setOfNums.add(null);
		setOfNums.add(null);
		
		System.out.println(setOfNums.size());//1
		System.out.println(setOfNums);//10
	}

}


class Book{
	private int bookId;
	private String bookName;
	private double bookPrice;
	public Book(int bookId, String bookName, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "\n Book [bookId=" + bookId + ", bookName=" + bookName
				+ ", bookPrice=" + bookPrice + "]";
	}
	
	
	
	 
}


/**
		
		
		
		Hashset set = new Hashset() -- map = new Hashmap()
		set.add(b1) --
				
				
						boolean add(book)
							map.put(book,present)
							
							
						(value type)
						Object put(book,present)
							
							if book == null
								putfornullkey(); table[0] = book
							
							int hascode= book.hashcode(); address location -- hex number -- index
							int hash= hash(hascode) -- integer representation
							int index = indexFor(hash) 
								
								index -- which bucket..
								
								https://howtodoinjava.com/java/collections/hashmap/how-hashmap-works-in-java/
								
**/