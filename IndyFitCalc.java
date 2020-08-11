import java.util.Scanner;
import java.lang.Math;

public class IndyFitCalc {
    public static void main() {
     
    }
    
    // method to check BMI of a user
    public void BMI() {
        Scanner sc = new Scanner(System.in);

        System.out.println("BMI (Body Mass Index )is a screening tool that can indicate whether a person is underweight or if they have a healthy weight, excess weight, or obesity.");
        System.out.println();
        
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in metres: ");
        double height = sc.nextDouble();

        double BMI = (weight)/(height*height);
        BMI = Math.floor(BMI * 100) / 100;

        String category = "";

        if (BMI <= 18.5) {
            category = "Underweight";
        }
        else if (BMI > 18.5 && BMI < 23.0) {
            category = "Normal Weight";
        }
        else if (BMI >= 23.0 && BMI < 25.0) {
            category = "Overweight";
        }
        else if (BMI >= 25.0 && BMI < 30.0) {
            category = "Obese I";
        }
        else if (BMI >= 30.0) {
            category = "Obese II";
        }

        System.out.println("With a BMI of "+BMI+", you are classified as "+category+".");
    }

    public void IBW() {
        Scanner sc = new Scanner(System.in);

        System.out.println("IBW tests help to the measurement the actual weight that the people need to maintain for maximal health.");
        System.out.println();

        System.out.print("Male or female (M/F): ");
        char gender = sc.nextLine().charAt(0);

        double idealWeight = 0.0;

        if (gender == 'm' || gender == 'M') {
            System.out.print("Enter your height in cm: ");
            double height = sc.nextDouble();

            idealWeight = (height-100) - ((height-100)-(height*0.1));
        }
        else if (gender == 'F' || gender == 'f') {
            System.out.print("Enter your height in cm: ");
            double height = sc.nextDouble();

            idealWeight = (height-100) + ((height-100)-(height*0.15));
        }

        System.out.println("Your ideal body weight (IBW) is "+idealWeight+".");
    }

    public void BMR() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Basal Metabolic Rate (BMR) test helps to estimate the amount of energy your body burns at rest daily.");
        System.out.println();

        System.out.print("Male or female (M/F): ");
        char gender = sc.nextLine().charAt(0);

        double BMR = 0.0;

        if (gender == 'm' || gender == 'M') {
            System.out.print("Enter height in cm: ");
            double height = sc.nextDouble();
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();
            System.out.print("Enter age in years: ");
            double age = sc.nextDouble();

            BMR = (88.362) + (13.397*weight) + (4.799*height) - (5.677*age);
        }
        else if (gender == 'F' || gender == 'f') {
            System.out.print("Enter height in cm: ");
            double height = sc.nextDouble();
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();
            System.out.print("Enter age in years: ");
            double age = sc.nextDouble();

            BMR = (447.593) + (9.247*weight) + (3.098*height) - (4.330*age);
        }

        System.out.println("Your Basal Metabolic Rate (BMR) is "+BMR+".");
    }


}
    
