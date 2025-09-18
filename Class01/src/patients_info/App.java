package patients_info;

public class App {
    // main() method is the entry-point to run our application
    /*
     * "main" is a java method
     * to start our application
     * to run the current class file
     * 
     * it has the keyword "static"
     * 
     * "static" => this class member (property/method) belongs the class itself
     * (not the object)
     * In other words, we can access/call/use this method by the class name
     * not by the object of that class.
     * 
     * For more clarification look at the method example of getAreaCircle()
     */
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        // create a new Patient Object:
        // create an instance of Patient "patient1"

        /*
         * We are instantiating a Patient object named "patient1"
         * using the default "Constructor" => new ClassName()
         * 
         * Constructor:
         * A special method that are being called and triggered automatically
         * when creating a new instance of a class
         */
        Patient patient1 = new Patient();
        Patient patient2 = new Patient("Alex", "Chow");

        // patient1.firstName="Jam";
        // Error: firstName has private access in Patient
        // patient1.lastName="Simpson";

        patient1.setFirstName("Jam");
        patient1.setLastName("Simpson");

        // access the calculate age method:
        int age1 = patient1.calAge(1990);

        // Concatenation:
        // It outputs the value of the public instance variable
        // p1FirstName => Patient1 First Name
        String p1FirstName = patient1.getFirstName();
        System.out.println("First Patient: First name: " + p1FirstName);
        String p1LastName = patient1.getLastName();
        System.out.println("First Patient: Last name: " + p1LastName);
        System.out.println("First Patient Full Name: " + p1FirstName + " " + p1LastName);

        /*
         * Strings with 0 index starting point (0 based index)
         * 
         * .charAt() => string method to access a character index
         * returns the character in that index
         */
        // Notice that VS code will show us the "index:" is 0
        char p1FirstInit = p1FirstName.charAt(0);
        char p2SecondInit = p1LastName.charAt(0);

        System.out.println(p1FirstInit); // J
        System.out.println(p2SecondInit); // S

        patient1.testDefaultValues();

        /*
         * Compiler Warning:
         * The static method showInfo() from the type Patient
         * should be accessed in a static way
         */
        Patient.showInfo();

    } // main()
} // class
