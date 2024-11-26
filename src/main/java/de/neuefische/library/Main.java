package de.neuefische.library;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Book book1 = new Book("Herr der Ringe", "Tolkien", "123");
		Book book2 = new Book("Herr der Ringe2", "Tolkien", "123");
		Book book3 = new Book("Herr der Ringe3", "Tolkien", "123");
		Book[] books = {book1, book2, book3};
		Library library = new Library(books);
		//System.out.println(Arrays.toString(library.getBooks()));
		//System.out.println(library);
		for(Book book : library.getBooks()){
			System.out.println("---Book---");
			System.out.println(book.getAuthor());
			System.out.println(book.getTitle());
			System.out.println(book.getIsbn());
			System.out.println("---End Book---");
		}

		ListLibrary listLibrary = new ListLibrary();
		listLibrary.addBook(book1);
		listLibrary.addBook(book2);
		listLibrary.addBook(book3);
		System.out.println(listLibrary);
		listLibrary.removeBook(book2);
		System.out.println(listLibrary);
	}
}
