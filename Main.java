import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight (kg) : ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height (cm) : ");
        double height = sc.nextDouble();

        sc.close();

        height = height / 100;

        double bmi = weight / (height * height);
        
        System.out.printf("\nBMI : %.2f\n", bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi < 24.9) {
            System.out.println("Normal weight");
        }
        else if (bmi < 29.9) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obesity");
        }

    }

}
