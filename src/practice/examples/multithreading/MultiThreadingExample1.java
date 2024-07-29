package practice.examples.multithreading;

class DoSomething extends Thread {
	
	String name;
	public DoSomething(String name) {
		this.name  = name;
	}
	
	public void run() {
		for(int i= 0; i< 1000; i++) {
			System.out.println("in function1() value of i="+i+ " Object Name="+ this.name);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingExample1{

	public static void main(String[] args) {
		
		DoSomething obj1 = new DoSomething("Alex");
		DoSomething obj2 = new DoSomething("Lisa");
		
		obj1.start();
		obj2.start();
	}
	
}
