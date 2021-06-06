import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("#.##");
//input
        System.out.println("Please state your weight (lb): ");
        int weight = sc.nextInt();
        System.out.println("Please state your height (in): ");
        int height = sc.nextInt();
//bmi = (weight / (height × height)) * 703
        double bmi = (weight/(Math.pow(height,2)))*703;

        if((bmi>=18.5) && (bmi<=25)){
            System.out.println("Your BMI is " + df2.format(bmi));
            System.out.println("You are within the ideal weight range.");
        }
        else if (bmi<18){
            System.out.println("Your BMI is " + df2.format(bmi));
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if (bmi>25){
            System.out.println("Your BMI is " + df2.format(bmi));
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}