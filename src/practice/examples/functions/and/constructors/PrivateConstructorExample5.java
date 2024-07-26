package practice.examples.functions.and.constructors;

public class PrivateConstructorExample5 {

	public static void main(String[] args) {
		Book b4 = Book.createObjectOfBook();
		b4.setBookName("abc");
		
		System.out.println(b4.getBookName());
		
		Book b5 =  Book.createObjectOfBook();
		System.out.println(b5.getBookName());
	}
}
