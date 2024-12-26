package ishita;

public class LMS {
	public static void main(String[] args) {
		Library library = new Library();

		// Add books
		library.addBook(new Book("1", "The Alchemist", "Paulo Coelho"));
		library.addBook(new Book("2", "1984", "George Orwell"));

		// Register users
		library.registerUser(new User("U1", "Alice"));
		library.registerUser(new User("U2", "Bob"));

		// Issue and return books
		library.issueBook("1", "U1");
		library.listBooks();
		library.returnBook("1");
		library.listBooks();
	}

}