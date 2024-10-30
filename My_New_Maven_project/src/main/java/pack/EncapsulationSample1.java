package pack;

public class EncapsulationSample1 {
	private int a;
    private int b;

    // Public variables (if needed for flexibility, but ideally should be private too)
    int c;
    int d;

 // Getter method to calculate the sum
    public int getDetails() {
        // Calculate the sum of 'a' and 'b'
        int sum = a + b;
        return sum;
    }
    // Setter method to set values of 'a' and 'b'
    public void setDetails(int c, int d) {
        this.a = c;  // Assign value of 'c' to 'a'
        this.b = d;  // Assign value of 'd' to 'b'
    }

private void setdetail() {
	// TODO Auto-generated method stub
a=c;
b=d;
}
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	}

}


/*What is Encapsulation in Java?
Encapsulation is one of the key principles of object-oriented programming (OOP). It refers to hiding the internal details of an object and only exposing what is necessary. This helps in data hiding and ensures that the object's internal state cannot be directly accessed or modified from outside the class.

In Java, encapsulation is achieved by:

Declaring variables as private (restricting direct access).
Providing public getter and setter methods to access and modify the private data.
Benefits of Encapsulation:
Data Hiding: The internal state of an object is hidden from the outside world.
Increased Security: Restricts unauthorized access to sensitive data.
Controlled Access: Provides flexibility by allowing controlled access through methods.
Code Reusability: Changes to internal implementation do not affect external code.
Example of Encapsulation
Here is a simple encapsulation example using private variables and public getter and setter methods:

java
Copy code
package pack;

public class Student {

    // Private fields (data hiding)
    private String name;
    private int age;

    // Public getter for 'name'
    public String getName() {
        return name;
    }

    // Public setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for 'age'
    public int getAge() {
        return age;
    }

    // Public setter for 'age'
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student();

        // Set values using setter methods
        student.setName("Alice");
        student.setAge(20);

        // Get values using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
Explanation of the Code
Private Variables (name and age):

These variables are not directly accessible outside the class due to the private modifier.
Public Getter Methods:

These methods (getName() and getAge()) return the value of private variables.
Public Setter Methods:

These methods (setName() and setAge()) allow controlled modification of the private variables.
In the setAge() method, a condition ensures valid input.
Output:
yaml
Copy code
Student Name: Alice
Student Age: 20
Advantages of Encapsulation in Practice
Improved Maintainability: Internal changes to the class won’t affect external code if the interface remains the same.
Readability: Encapsulation makes the code cleaner and easier to read by limiting access to what’s necessary.
Security: Sensitive data can be protected by making variables private and controlling their access.
This is how encapsulation works in Java. It ensures that objects manage their own state and provide controlled access through methods.*/
