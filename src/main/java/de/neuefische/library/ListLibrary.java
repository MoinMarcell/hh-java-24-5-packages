package de.neuefische.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListLibrary {
	private List<Book> books;

	public ListLibrary(List<Book> books) {
		this.books = books;
	}

	public ListLibrary() {
		this.books = new ArrayList<>();
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void addBook(Book book){
		this.books.add(book);
	}

	public void removeBook(Book book){
		this.books.remove(book);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		ListLibrary that = (ListLibrary) o;
		return Objects.equals(books, that.books);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(books);
	}

	@Override
	public String toString() {
		return "ListLibrary{" +
				"books=" + books +
				'}';
	}
}
