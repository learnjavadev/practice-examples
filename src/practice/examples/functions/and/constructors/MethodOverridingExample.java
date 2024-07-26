package practice.examples.functions.and.constructors;
class ITProfessional{
	
	public void work() {
		System.out.println("I am working in IT");
	}
}

class Developer extends ITProfessional{
	
	@Override
	public void work() {
		System.out.println("I am developing java application");
	}
}

class Tester extends ITProfessional{
	
	@Override
	public void work() {
		System.out.println("I am doing QA/Testing of Applications");
	}
}
public class MethodOverridingExample {

	public static void main(String[] args) {
		ITProfessional itProfessional0 = new ITProfessional();
		itProfessional0.work();
		
		itProfessional0 = new Developer();
		itProfessional0.work();
		
		itProfessional0 = new Tester();
		itProfessional0.work();
	}

}
