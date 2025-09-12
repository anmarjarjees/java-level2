public class App {
    // main() method is the entry-point to run our application
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

        // patient1.firstName="Sam";
        // Error: firstName has private access in Patient
        // patient1.lastName="Simpson";

        patient1.setFirstName("Sam");
        patient1.setLastName("Simpson");

        // access the calculate age method:
        int age1 = patient1.calAge(1990);

        // Concatenation:
        // It outputs the value of the public instance variable
        System.out.println("First Patient: First name: " + patient1.getFirstName());
        System.out.println("First Patient: Last name: " + patient1.getLastName());
        System.out.println("First Patient Full Name: " + patient1.getFirstName() + " " + patient1.getLastName());

        patient1.testDefaultValues();

        /*
         * Compiler Warning:
         * The static method showInfo() from the type Patient
         * should be accessed in a static way
         */
        Patient.showInfo();

    } // main()
} // class
