package de.neuefische.library;

import java.util.Arrays;
import java.util.Objects;

public class Library {
	private Book[] books;

	public Library(Book[] books) {
		this.books = books;
	}

	public Library() {
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Library library = (Library) o;
		return Objects.deepEquals(books, library.books);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(books);
	}

	@Override
	public String toString() {
		return "Library{" +
				"books=" + Arrays.toString(books) +
				'}';
	}
}
