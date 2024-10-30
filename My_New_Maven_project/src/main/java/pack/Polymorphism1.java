package pack;

public class Polymorphism1 extends Polymorphism
{
	@Override
	public  void run(int a)
	{
	
		System.out.println("print letter"+a);
		System.out.println("running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism1 s=new Polymorphism1();
		s.run(10);
	}

}

/*What’s Happening Here?
Polymorphism:
The Polymorphism1 class extends the Polymorphism class (presumably another class, although its content isn’t shown here).

Method Overriding:
The run() method in Polymorphism1 overrides a method from the parent class Polymorphism. This is an example of runtime polymorphism.

Enhanced Code with Parent Class Example
Here’s a more complete example with both the parent class (Polymorphism) and the child class (Polymorphism1).

Parent Class: Polymorphism
java
Copy code
package pack;

public class Polymorphism {

    // Method to be overridden
    public void run(int a) {
        System.out.println("Parent class: run method with value " + a);
    }
}
Child Class: Polymorphism1 (Overriding Method)
java
Copy code
package pack;

public class Polymorphism1 extends Polymorphism {

    // Overriding the run method
    @Override
    public void run(int a) {
        System.out.println("Child class: print letter " + a);
        System.out.println("Child class: running");
    }

    public static void main(String[] args) {
        // Create an object of Polymorphism1 and call the run method
        Polymorphism obj = new Polymorphism1();  // Runtime polymorphism
        obj.run(10);
    }
}
Key Points to Note:
Overriding Method with @Override:
Adding the @Override annotation helps to ensure the method correctly overrides a method from the parent class. If the method signature doesn’t match, the compiler will throw an error.

Polymorphism in Action:
In the main() method, notice that the object is created as:

java
Copy code
Polymorphism obj = new Polymorphism1();
This is an example of runtime polymorphism—although the reference is of type Polymorphism (the parent class), the method in Polymorphism1 (the child class) is executed.

Sample Output:
arduino
Copy code
Child class: print letter 10
Child class: running
Why Use Polymorphism?
Flexibility: You can write code that works with parent class references while still using child class implementations.
Extensibility: New child classes can be introduced without modifying existing code.
Dynamic Behavior: At runtime, the method from the child class is called if the object is an instance of the child class.
This version provides a more complete and accurate illustration of method overriding and polymorphism in Java.*/






