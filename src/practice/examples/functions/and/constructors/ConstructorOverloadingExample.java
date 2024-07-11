package practice.examples.functions.and.constructors;
public class ConstructorOverloadingExample {
    int number;
    String text;

    // Default constructor
    public ConstructorOverloadingExample() {
        number = 0;
        text = "Default";
    }

    // Parameterized constructor with one parameter
    public ConstructorOverloadingExample(int number) {
        this.number = number;
        this.text = "Default";
    }

    // Parameterized constructor with two parameters
    public ConstructorOverloadingExample(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void display() {
        System.out.println("Number: " + number + ", Text: " + text);
    }

    public static void main(String[] args) {
        ConstructorOverloadingExample example1 = 
        		new ConstructorOverloadingExample();
        example1.display();

        ConstructorOverloadingExample example2 = 
        		new ConstructorOverloadingExample(100);
        example2.display();

        ConstructorOverloadingExample example3 = 
        		new ConstructorOverloadingExample(200, "Overloaded");
        example3.display();
    }
}



