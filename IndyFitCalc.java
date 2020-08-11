import java.util.Scanner;
import java.lang.Math;

public class IndyFitCalc {
    // main method
    public void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Indy Fit Calculator!");
        System.out.println();

        System.out.println("Please pick from one of the following options: ");
        System.out.println("1. Body Mass Index (BMI) Calculator \n2. Ideal Body Weight (IBW) Calculator \n3. Basal Metabolic Rate (BMR) Calculator \n4. Calorie Calculator \n5. Body Fat Percentage (BFP) Calculator \n6. Body Surface Area (BSA) Caclulator \n7. Carbohydrates Requirements Calcuator \n8. Protein Requirements Calcuator \n9. Fat Requirements Calcuator \n10. Total Daily Energy Expenditure (TDEE) Calculator \n11. Waist-to-Hip Ratio Calculator \n12. Body Adiposity Index (BAI) Calculator \n13. Blood Alcohol Concentration (BAC) Calculator \n14. Lean Body Mass (LBM) Calculator \n15. Fat Free Mass Index (FFMI) Calculator \n16. Maximum Heart Rate (MHR) Calculator");

        int menu = sc.nextInt();

        switch(menu) {
            case 1: BMI();
                    break;
            case 2: IBW();
                    break;
            case 3: BMR();
                    break;
            case 4: calorieCalculator();
                    break;
            case 5: BFP();
                    break;
            case 6: BSA();
                    break;
            case 7: carbReq();
                    break;
            case 8: proteinReq();
                    break;
            case 9: fatReq();
                    break;
            case 10: TDEE();
                     break;
            case 11: waistHip();
                     break;
            case 12: BAI();
                     break;
            case 13: BAC();
                     break;
            case 14: LBM();
                     break;
            case 15: FFMI();
                     break;
            case 16: MHR();
                     break;
            default: System.out.println("Error. Try again.");
                     break;
        }
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

        double BMI = (weight)/(Math.pow(height, 2));
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
        char gender = sc.next().charAt(0);

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
        char gender = sc.next().charAt(0);

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
        char gender = sc.next().charAt(0);

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
        char gender = sc.next().charAt(0);

        double BFP = 0.0;

        if (gender == 'm' || gender == 'M') {
            System.out.print("Enter your age in years: ");
            double age = sc.nextDouble();

            System.out.print("Enter your weight in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter your height in cm: ");
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

            System.out.print("Enter your height in cm: ");
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

        System.out.print("Enter your height in cm: ");
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
        char gender = sc.next().charAt(0);

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

        double proteinReq = 0.8*weight;

        System.out.println("You should consume approximately "+proteinReq+" grams of protein per day.");
    }

    // method to check fat req
    public void fatReq() {
        Scanner sc = new Scanner(System.in);

        System.out.println("The Fat calculator helps to estimates the required amounts of fat that a person needs each day.");
        System.out.println();
        
        System.out.print("Male or female (M/F): ");
        char gender = sc.next().charAt(0);

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

        double fat = 0.0;
        fat = (cc*0.3)/9;
        System.out.println("You should consume approximately "+fat+" grams of fat per day.");
    }
    
    public void TDEE() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Total Daily Energy Expenditure (TDEE) is an estimation of how many calories a person burns per day when exercise is taken into account.");
        System.out.println();

        System.out.print("Male or female (M/F): ");
        char gender = sc.next().charAt(0);

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

        System.out.println("You will burn approximately "+cc+" calories per day.");
    }

    // method to calculate Waist to Hip ratio
    public void waistHip(){
        Scanner sc = new Scanner(System.in);

        System.out.println("The waist-to-hip ratio (WHR) is a quick measure of fat distribution (especially on waist, hips, and buttocks) that may help indicate a person's overall health. It also helps to measure abdominal obesity.");
        System.out.println();

        System.out.print("Enter waist circumference in cm: ");
        double waistCirc = sc.nextDouble();

        System.out.print("Enter hip circumference in cm: ");
        double hipCirc = sc.nextDouble();

        double whr = 0.0;
        whr = waistCirc/hipCirc;

        System.out.print("Male or female (M/F): ");
        char gender = sc.next().charAt(0);
        
        String category = "Normal";

        if (gender == 'm' || gender == 'M') {
            if (whr>0.90) {
                category = "Obese";
            }
        }
        else if (gender == 'F' || gender == 'f') {
            if (whr>0.85) {
                category = "Obese";
            }
        }

        System.out.println("Your Waist-to-Hip ratio is "+whr+" and falls under the "+category+" category.");
    }

    public void BAI() {
        Scanner sc = new Scanner(System.in);

        System.out.println("The Body Adiposity Index (BAI) is a practical anthropometric method used to measure body fat percentage. ");
        System.out.println();

        System.out.print("Enter hip circumference in cm: ");
        double hipCirc = sc.nextDouble();

        System.out.print("Enter height in metres: ");
        double height = sc.nextDouble();

        double BAI = 0.0;

        BAI = (hipCirc/(Math.pow(height, 1.5))) - 18;

        System.out.println("Your Body Adiposity Index is approximately "+BAI+".");
    }

    public void BAC() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Blood alcohol concentration (BAC) refers to the amount of alcohol present in the bloodstream.");
        System.out.println();

        System.out.print("Enter your weight in grams: ");
        double weight = sc.nextDouble();

        System.out.print("Enter alcohol consumed in grams: ");
        double alc = sc.nextDouble();

        System.out.print("Male or female (M/F): ");
        char gender = sc.next().charAt(0);

        double BAC = 0.0;
        double r = 0.0;

        if (gender == 'm' || gender == 'M') {
            r = 0.68;
        }
        else if (gender == 'F' || gender == 'f') {
            r = 0.55;
        }

        BAC = ((alc)/(weight*r))*100;

        String category = "";

        if (BAC == 0) {
            category = "Sober";
        }
        else if (BAC > 0.0 && BAC < 0.08) {
            category = "Legally Intoxicated";
        }
        else if (BAC >= 0.08 && BAC < 0.40) {
            category = "Very Impaired";
        }
        else if (BAC >= 0.40) {
            category = "At risk for serious complications";
        }

        System.out.println("With a Blood Alcohol Concentraion of "+BAC+"%, you are classified as "+category+".");


    }

    public void LBM(){
        Scanner sc = new Scanner(System.in);

        System.out.println("The Lean Body Mass assessment determines a person's estimated lean body mass (LBM) based on body weight, height, gender, and age.");
        System.out.println();

        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in cm: ");
        double height = sc.nextDouble();

        System.out.print("Male or female (M/F): ");
        char gender = sc.next().charAt(0);

        double ELBM = 0.0;

        if (gender == 'm' || gender == 'M') {
            ELBM = 0.407*weight + 0.267*height - 19.2;
        }
        else if (gender == 'F' || gender == 'f') {
            ELBM = 0.252*weight + 0.4737*height - 48.3;
        }

        System.out.println("Your Estimated Lean Body Mass is "+ELBM+".");

    }

    public void FFMI(){
        Scanner sc = new Scanner(System.in);

        System.out.println("FFMI is an alternative to body mass index, which helps in estimates a person's muscle mass.");
        System.out.println();

        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in metres: ");
        double height = sc.nextDouble();

        System.out.print("Enter your body fat in percentage: ");
        double bfp = sc.nextDouble();

        double FFMI = 0.0;

        FFMI = (weight*(1-(bfp/100))) / Math.pow((height), 2);

        System.out.println("Your Fat Free Mass Index is "+FFMI+".");
    }

    public void MHR(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Maximum heart rate (MHR) is most accurately measured using a cardiac stress test, which involves measuring a person's heart function (including heart rate) at periodically increasing levels of exercise.");
        System.out.println();

        System.out.print("Enter your age in years: ");
        int age = sc.nextInt();

        int MHR = 220 - age;

        System.out.println("Your Estimated Maximum Heart Rate formula is "+MHR+".");
    }
}
