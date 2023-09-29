
public class Book {
	// Method to display book information
	void displayBook() {
		// Demo Book information
		int bookId = 1212;
		String bTitle = "My Story";
		String bAuthor = "Bibhuti";
		double bPrice = 299.00;
		
		// Printing book details
		System.out.println("Book ID: "+bookId);
		System.out.println("Book Title: "+bTitle);
		System.out.println("Book Author: "+bAuthor);
		System.out.println("Book Price: "+bPrice);
	}
	public static void main(String[] args) {
		// Creating object for Book class
		Book bookObj =new Book();
		// calling method
		bookObj.displayBook();
	}

}
