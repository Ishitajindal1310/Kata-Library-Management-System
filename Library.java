package ishita;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	private List<User> users;

	public Library() {
		this.books = new ArrayList<>();
		this.users = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added: " + book);
	}

	public void registerUser(User user) {
		users.add(user);
		System.out.println("User registered: " + user);
	}

	public void issueBook(String bookId, String userId) {
		Book book = findBookById(bookId);
		if (book == null) {
			System.out.println("Book not found!");
			return;
		}

		if (book.isIssued()) {
			System.out.println("Book is already issued!");
			return;
		}

		User user = findUserById(userId);
		if (user == null) {
			System.out.println("User not found!");
			return;
		}

		book.setIssued(true);
		System.out.println("Book issued to user: " + user.getName());
	}

	public void returnBook(String bookId) {
		Book book = findBookById(bookId);
		if (book == null) {
			System.out.println("Book not found!");
			return;
		}

		if (!book.isIssued()) {
			System.out.println("Book was not issued!");
			return;
		}

		book.setIssued(false);
		System.out.println("Book returned: " + book.getTitle());
	}

	private Book findBookById(String id) {
		for (Book book : books) {
			if (book.getId().equals(id)) {
				return book;
			}
		}
		return null;
	}

	private User findUserById(String id) {
		for (User user : users) {
			if (user.getUserId().equals(id)) {
				return user;
			}
		}
		return null;
	}

	public void listBooks() {
		System.out.println("Books in library:");
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
