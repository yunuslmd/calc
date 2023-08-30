package calculateJava;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operator, num1, num2;
        System.out.println("1 - Add \n2 - Subtract \n3 - Multiply \n4 - Divide \nEnter the operator: ");
        
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        
        System.out.print("Enter the First number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter the Second number: ");
        num2 = sc.nextInt();
        
        int result = 0;
        
        switch (operator) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator selection.");
        }
        
        System.out.println("Result: " + result);
        sc.close();
    }
}