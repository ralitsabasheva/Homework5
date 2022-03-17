package homework;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x:");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter y:");
        double y = Double.parseDouble(scanner.nextLine());
        double result = Math.pow(x, 2) + Math.pow(y, 2);
        System.out.println(Math.sqrt(result));
    }
}
