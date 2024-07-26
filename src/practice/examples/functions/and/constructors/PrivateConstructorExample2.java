package practice.examples.functions.and.constructors;


public class PrivateConstructorExample {

	public static void main(String[] args) {
		
		// enforcing object instance variable intialization
//		Book b1 = new Book("abc");
		
//		Book b2 = new Book();
//		Book b3 = new Book();
		Book b4 = Book.createObjectOfBook();
		b4.setBookName("abc");
		
		System.out.println(b4.getBookName());
	}
}
