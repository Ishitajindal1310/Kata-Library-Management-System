package ishita;

import java.util.Scanner;

public class LMS {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\n--- Library Management System ---");
			System.out.println("1. Add a Book");
			System.out.println("2. Register a User");
			System.out.println("3. Borrow a Book");
			System.out.println("4. Return a Book");
			System.out.println("5. View All Books");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					System.out.print("Enter Book ID: ");
					String bookId = scanner.nextLine();
					System.out.print("Enter Book Title: ");
					String bookTitle = scanner.nextLine();
					System.out.print("Enter Book Author: ");
					String bookAuthor = scanner.nextLine();
					library.addBook(new Book(bookId, bookTitle, bookAuthor));
					break;

				case 2:
					System.out.print("Enter User ID: ");
					String userId = scanner.nextLine();
					System.out.print("Enter User Name: ");
					String userName = scanner.nextLine();
					library.registerUser(new User(userId, userName));
					break;

				case 3:
					System.out.print("Enter Book ID to Borrow: ");
					String borrowBookId = scanner.nextLine();
					System.out.print("Enter User ID: ");
					String borrowerId = scanner.nextLine();
					library.issueBook(borrowBookId, borrowerId);
					break;

				case 4:
					System.out.print("Enter Book ID to Return: ");
					String returnBookId = scanner.nextLine();
					library.returnBook(returnBookId);
					break;

				case 5:
					library.listBooks();
					break;

				case 6:
					System.out.println("Exiting! Thank you for using the system!");
					scanner.close();
					return;

				default:
					System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}
