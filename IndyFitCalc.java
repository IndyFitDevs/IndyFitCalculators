import java.util.Scanner;
import java.lang.Math;

public class IndyFitCalc {
    // main method
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

    // method to check ideal body weight
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

            idealWeight = (height-100) - ((height-100)*0.1);
        }
        else if (gender == 'F' || gender == 'f') {
            System.out.print("Enter your height in cm: ");
            double height = sc.nextDouble();

            idealWeight = (height-100) + ((height-100)*0.15);
        }

        System.out.println("Your ideal body weight (IBW) is "+idealWeight+".");
    }

    // method to check basal metabolic rate
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

    // method to calculate calories
    public void calorieCalculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("The Calorie Calculator can be used to estimate the number of calories a person needs to consume each day.");
        System.out.println();

        System.out.print("Male or female (M/F): ");
        char gender = sc.nextLine().charAt(0);

        double BMR = 0.0;
        double cc = 0.0;

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

        System.out.println("Select an activity type:");
        System.out.println("1. Sedentary (little or no exercise) \n2. Lightly Active (light exercise/sports 1-3 days/week) \n3. Moderately Active (moderate exercise/sports 3-5 days/week) \n4. Very Active (hard exercise/sports 6-7 days a week) \n5. Extra Active (very hard exercise/sports & physical job or 2x training)");
        int activitySelector = sc.nextInt();

        switch(activitySelector) {
            case 1: cc = BMR*1.2;
                    break;
            case 2: cc = BMR*1.375;
                    break;
            case 3: cc = BMR*1.55;
                    break;
            case 4: cc = BMR*1.725;
                    break;
            case 5: cc = BMR*1.9;
                    break;
            default: cc = BMR*1.5;
                    break;
        }

        System.out.println("You should consume approximately "+cc+" calories per day.");
    }

    // method to calculate body fat percentage
    public void BFP(){
        Scanner sc = new Scanner(System.in);

        System.out.println("The Body Fat percentage measure used to estimate total body fat percentage based on a specific formula.");
        System.out.println();

        System.out.print("Male or female (M/F): ");
        char gender = sc.nextLine().charAt(0);

        double BFP = 0.0;

        if (gender == 'm' || gender == 'M') {
            System.out.print("Enter your age in years: ");
            double age = sc.nextDouble();

            System.out.print("Enter your weight in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter your height in metres: ");
            double height = sc.nextDouble();

            double BMI = (weight)/(height*height);
            BMI = Math.floor(BMI * 100) / 100;

            BFP = (1.20*BMI)+(0.23)*(age-16.2);
        }
        else if (gender == 'F' || gender == 'f') {
            System.out.print("Enter your age in years: ");
            double age = sc.nextDouble();

            System.out.print("Enter your weight in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter your height in metres: ");
            double height = sc.nextDouble();

            double BMI = (weight)/(height*height);
            BMI = Math.floor(BMI * 100) / 100;

            BFP = (1.20*BMI)+(0.23)*(age-5.4);
        }

        System.out.println("Your Body Fat Percentage (BFP) is "+BFP+"%.");
    }

    // method to calculate body surface area
    public void BSA() {
        Scanner sc = new Scanner(System.in);

        System.out.println("The body surface area (BSA) measure or calculator helps to estimate the surface area of a human body.");
        System.out.println();

        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in metres: ");
        double height = sc.nextDouble();

        double BSA =  (0.007184)*(Math.pow(weight, 0.425) )*(Math.pow(height, 0.725));

        System.out.println("Your Body Surface Area (BSA) is "+BSA+".");
    }

    // method to check carb req
    public void carbReq(){
        Scanner sc = new Scanner(System.in);

        System.out.println("The Carbohydrates calculator helps to estimates the required amounts of carbohydrates that a person needs each day.");
        System.out.println();
        
        System.out.print("Male or female (M/F): ");
        char gender = sc.nextLine().charAt(0);

        double BMR = 0.0;
        double cc = 0.0;

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

        System.out.println("Select an activity type:");
        System.out.println("1. Sedentary (little or no exercise) \n2. Lightly Active (light exercise/sports 1-3 days/week) \n3. Moderately Active (moderate exercise/sports 3-5 days/week) \n4. Very Active (hard exercise/sports 6-7 days a week) \n5. Extra Active (very hard exercise/sports & physical job or 2x training)");
        int activitySelector = sc.nextInt();

        switch(activitySelector) {
            case 1: cc = BMR*1.2;
                    break;
            case 2: cc = BMR*1.375;
                    break;
            case 3: cc = BMR*1.55;
                    break;
            case 4: cc = BMR*1.725;
                    break;
            case 5: cc = BMR*1.9;
                    break;
            default: cc = BMR*1.5;
                    break;
        }

        cc = Math.ceil(cc);

        double carbs = 0.0;
        carbs = (cc*0.6)/4;
        System.out.println("You should consume approximately "+carbs+" grams of carbohydrates per day.");
    }

    // method to check protein req
    public void proteinReq() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" The Protein Calculator estimates the daily amount of dietary protein adults require to remain healthy.");
        System.out.println();
        
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();


    }
}
    
