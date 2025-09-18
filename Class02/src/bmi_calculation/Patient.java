package bmi_calculation;

// https://www.diabetes.ca/resources/tools-resources/body-mass-index-(bmi)-calculator
public class Patient {
    // task01:
    // create 3 private fields
    // full name (string), weight (double), hight (double:
    // let's create our getters and setters manually:
    private String fullName; // null "" by default => empty string
    private static double weight; // 0.0d by default
    private static double height; // 0.0d by default

    // task02:
    // one constructor to accept
    // fullname, weight, and hight (in centimeters)
    // assign the 3 parameters to the private class fields
    public Patient(String fullName, double weight, double hight) {
        this.fullName = fullName;
        // this.weight = weight;
        /*
         * Java Compiler warning :
         * The static field Patient.weight
         * should be accessed in a static way
         * Accessing static field weight
         */
        Patient.weight = weight;
        // this.height = hight;
        Patient.height = hight;
    }

    // task03:
    /*
     * Create a private method that calculate the BMI
     * and return the value,
     * The BMI is calculated by:
     * dividing weight in kilograms by height in metres,
     * The formula is BMI = kg/m x m
     * NOTE:
     * the height is CM but the formula needs Meter
     * so convert the hight in CM to Meter:
     * 1 M = 100 CM
     * 180 CM => 180/100 = 1.8 Meter
     */
    // "calculateBMI" method:
    private static double calculateBMI() {
        // Height in CM: convert it to Meter
        // use the class property "height"
        double meter = height / 100; // Convert the CM to Meter
        // BMI = kg/m x m
        // double bmi = weight / (meter * meter);
        /*
         * Math.pow(x,y):
         * Or using a "static" method named "pow()"
         * that belongs to Java class named "Math"
         */
        // the method pow() for the power:
        double bmi = weight / Math.pow(meter, 2);
        // OR:
        bmi = weight / (meter * meter);
        return bmi;
    }

    /*
     * Task04:
     * create a public method with any name, no parameters
     * no return => void
     * the method will:
     * 1) call the private method "calculateBMI"
     * 2) getting the returned value then just print:
     * Underweight OR Normal Weight OR Overweight
     * > If the BMI less than 18.5 => Underweight
     * > If the BMI between (18.5 - 24.9) => Normal Weight
     * > If the BMI more than 24.9 => Overweight
     * 
     * Final Change => make it "static"
     */
    public static void explainBMI() {
        // we need to call the BMI calculation method:
        double bmi = calculateBMI();
        System.out.println("Body Mass Index is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("Normal Weight");
        } else {
            System.out.println("Overweight");
        }
    }
}
