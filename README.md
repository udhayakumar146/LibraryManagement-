---

# 📚 Library Management System (Java)

## 🚀 Overview

The **Library Management System** is a simple Java console-based application that allows users to **add books, issue books, return books, and view available books**.
It demonstrates **Object-Oriented Programming (OOP)** concepts such as **classes, objects, encapsulation, and arrays**.

---

## ✨ Features

* ➕ **Add Books** – Add new books to the library.
* 📖 **View Books** – Display all books with their availability status.
* 📕 **Issue Books** – Borrow books (if available).
* 📗 **Return Books** – Return previously issued books.
* 👤 **User Management** – Each user is identified by their name.
* 🛑 **Exit** – Quit the application safely.

---

## 🛠️ Technologies Used

* **Java** (Core OOP concepts)
* **Scanner** (for user input)
* **Arrays** (to store books in the library)

---

## 📂 Project Structure

```
LibraryManagementSystem.java
│
├── Book.java        # Handles book details and operations
├── User.java        # Represents a user
├── Library.java     # Manages book collection and operations
└── LibraryManagementSystem.java # Main program with menu-driven interface
```

---

## ▶️ How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/library-management-system.git
   ```

2. Navigate to the project folder:

   ```bash
   cd library-management-system
   ```

3. Compile the Java files:

   ```bash
   javac LibraryManagementSystem.java
   ```

4. Run the program:

   ```bash
   java LibraryManagementSystem
   ```

---

## 🎯 Concepts Demonstrated

* ✅ **Encapsulation** – Private fields with public methods.
* ✅ **Objects and Classes** – Separate `Book`, `User`, and `Library` classes.
* ✅ **Arrays** – Store multiple book objects.
* ✅ **Menu-driven Program** – Switch-case for user choices.

---

## 📌 Future Enhancements

* ✅ Store data in a **file or database** for persistence.
* ✅ Add **search functionality** (search by author/title).
* ✅ Support for multiple users and book issue history.
* ✅ Replace arrays with **ArrayList** for dynamic storage.

---

## 👨‍💻 Output
Enter your name: Alice

===== Library Menu =====
1. Add Book
2. Show Books
3. Issue Book
4. Return Book
5. Exit
Enter choice: 1
Enter book title: Java Basics
Enter author name: John Smith
Book added: Java Basics

===== Library Menu =====
2
--- Library Books ---
Book: Java Basics | Author: John Smith | Status: Available

===== Library Menu =====
3
Enter book title to issue: Java Basics
Java Basics has been issued.

===== Library Menu =====
4
Enter book title to return: Java Basics
Java Basics has been returned.

===== Library Menu =====
5
Exiting... Goodbye, Alice!
