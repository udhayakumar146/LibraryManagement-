package LibraryMenu;



	import java.util.Scanner;

	// Book Class
	class Book {
	    private String title;
	    private String author;
	    private boolean isIssued;

	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.isIssued = false;
	    }

	    public void issueBook() {
	        if (!isIssued) {
	            isIssued = true;
	            System.out.println(title + " has been issued.");
	        } else {
	            System.out.println(title + " is already issued.");
	        }
	    }

	    public void returnBook() {
	        if (isIssued) {
	            isIssued = false;
	            System.out.println(title + " has been returned.");
	        } else {
	            System.out.println(title + " was not issued.");
	        }
	    }

	    public void displayInfo() {
	        System.out.println("Book: " + title + " | Author: " + author +
	                           " | Status: " + (isIssued ? "Issued" : "Available"));
	    }

	    public boolean isIssued() {
	        return isIssued;
	    }

	    public String getTitle() {
	        return title;
	    }
	}

	// User Class
	class User {
	    private String name;

	    public User(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}

	// Library Class
	class Library {
	    private Book[] books;
	    private int bookCount;

	    public Library(int size) {
	        books = new Book[size];
	        bookCount = 0;
	    }

	    public void addBook(Book book) {
	        if (bookCount < books.length) {
	            books[bookCount] = book;
	            bookCount++;
	            System.out.println("Book added: " + book.getTitle());
	        } else {
	            System.out.println("Library is full. Cannot add more books.");
	        }
	    }

	    public void showBooks() {
	        System.out.println("\n--- Library Books ---");
	        for (int i = 0; i < bookCount; i++) {
	            books[i].displayInfo();
	        }
	    }

	    public void issueBook(String title, User user) {
	        for (int i = 0; i < bookCount; i++) {
	            if (books[i].getTitle().equalsIgnoreCase(title)) {
	                books[i].issueBook();
	                return;
	            }
	        }
	        System.out.println("Book not found: " + title);
	    }

	    public void returnBook(String title, User user) {
	        for (int i = 0; i < bookCount; i++) {
	            if (books[i].getTitle().equalsIgnoreCase(title)) {
	                books[i].returnBook();
	                return;
	            }
	        }
	        System.out.println("Book not found: " + title);
	    }
	}

	// Main Class
	public class LibraryMenu { 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Library library = new Library(10); // Library with 10 books capacity

	        System.out.print("Enter your name: ");
	        User user = new User(sc.nextLine());

	        while (true) {
	            System.out.println("\n===== Library Menu =====");
	            System.out.println("1. Add Book");
	            System.out.println("2. Show Books");
	            System.out.println("3. Issue Book");
	            System.out.println("4. Return Book");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter book title: ");
	                    String title = sc.nextLine();
	                    System.out.print("Enter author name: ");
	                    String author = sc.nextLine();
	                    library.addBook(new Book(title, author));
	                    break;

	                case 2:
	                    library.showBooks();
	                    break;

	                case 3:
	                    System.out.print("Enter book title to issue: ");
	                    String issueTitle = sc.nextLine();
	                    library.issueBook(issueTitle, user);
	                    break;

	                case 4:
	                    System.out.print("Enter book title to return: ");
	                    String returnTitle = sc.nextLine();
	                    library.returnBook(returnTitle, user);
	                    break;

	                case 5:
	                    System.out.println("Exiting... Goodbye, " + user.getName() + "!");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
	}
