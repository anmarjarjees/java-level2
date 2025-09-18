package bmi_calculation;

public class Main {
    // PSVM
    public static void main(String[] args) {
        // Task05:
        // run and test the logic:
        Patient patient1 = new Patient("Alex Chow", 90, 120);
        /*
         * since it's a static method,
         * we can access it through
         * because it belongs to class not the object
         */
        Patient.explainBMI();
    }
}
