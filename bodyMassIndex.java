package homework;

import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight:");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter your height");
        double height = Double.parseDouble(scanner.nextLine());

        double bmi = weight / Math.pow(height/100, 2);
        System.out.println(bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(18.5 < bmi && bmi < 24.9){
            System.out.println("Normal range");
        }else{
            System.out.println("Overweight");
        }
    }
}
