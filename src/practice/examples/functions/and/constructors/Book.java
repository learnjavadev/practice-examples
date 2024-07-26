package practice.examples.functions.and.constructors;

public class Book{
	
	static Book bookObject = null;
	
	// constructor 
	private Book() {
		
	}
	
	// singleton object creation 
	public static Book createObjectOfBook() {
		
		if(null != bookObject) {
			return bookObject;
		}
		
		bookObject = new Book();
		
		return bookObject;
	}
	
//	// paraemtrized constructor
//	public Book(String name) {
//		this.bookName = name;
//	}
	
	private String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
