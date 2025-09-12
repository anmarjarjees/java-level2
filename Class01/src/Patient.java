public class Patient {
    // Properties and Methods:
    // OOP => Object-Oriented Programming => A PIE
    /*
     * To recap, any Class can have two members:
     * - Properties (Attributes/Class Fields) => variables inside a class
     * - Methods => functions inside a class
     * 
     * Data Types:
     * - "Primitive" Data Types:
     * > Have default values
     * > can NOT contain "null" values
     * > are built into the Java language and are not objects
     * 
     * - "Reference" data types:
     * > more complex data types that store references (memory addresses) to
     * objects.
     * > used with complex data structures
     * 
     * Link:
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     */

    /*
     * Access Modifiers (Visibility Modifiers):
     * - private
     * - public
     * - protected
     * - default (empty) => nothing is specified!
     * 
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */
    /*
     * OOP => 4 pillars => A PIE
     * For more details and explanations, please refer to my comprehensive PDF file
     * about OOP and Software Engineering Terminologies and Definitions
     * 
     * Encapsulation:
     * To keep all/some members hidden from outside the class.
     * Which means this member cannot be accessed outside the class itself
     * we can do it using the keyword "private"
     * 
     * "Encapsulation": example using "private"
     * 
     * NOTE:
     * Any class member (fields and method)
     * are defaulted to be "public"
     * if we don't specify the access modifier
     */
    // using camelCase by convention
    // we should avoid using "public" if possible for properties
    private String firstName; // "" by default => empty string
    private String lastName; // "" by default
    // ALT + SHIFT + F => Format

    // Encapsulation: using the access modifier "private"
    private double weight; // 0.0 by default for double
    private double height; // 0.0 by default
    private int age; // 0 by default for integers
    private boolean isObese; // false by default

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Patient() {
        // do your code here...
    }

    // Getters and Setters:
    public String getFirstName() {
        // notice below using the keyword "this" is optional
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Just for testing the default values of the class field:
    // Link:
    // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    public void testDefaultValues() {
        System.out.println(firstName); // null
        System.out.println(weight); // 0.0
        System.out.println(height); // 0.0
        System.out.println(age); // 0
        System.out.println(isObese); // false
    }

    // Add a method calculate user age (very basic and simple demo)
    public int calAge(int year) {
        return (2025 - year);
    }

    /*
     * Static Members: Fields Or Methods:
     * **********************************
     * The keyword "static" (Quick review to be explained later)
     * let's add the keyword "static":
     * 
     * "static" makes this class member (property or method)
     * belongs to the Class itself (not the object of the class)
     * can only be accessed through the class name:
     * - ClassName.PropertyName
     * - ClassName.MethodName()
     */

    // Static Method => belongs to the class not its object:
    public static void printMsg() {
        System.out.println("Have a good day and stay safe!");
    }

    public static void showInfo() {
        System.out.println("ABC Health Clinic");
    }
} // class
