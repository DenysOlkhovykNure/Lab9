package lab9.com;

import java.util.Scanner;
import calculator.com.*;

public class Main {
	
	private static double firstOperand = 0, secondOperand = 0, result = 0;
	private static char action = ' ';
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
				
		for (;;) {
			
			try {	
				String userActionInput = getUserActionInput();
				
				if(isExit(userActionInput)) {
					break;
				}
				
				/*
				 *  First letter is considered to be 
				 *  an operation type
				 */
				action = userActionInput.charAt(0); 
				
				if(action == 's') {
					getUserInputForFirstOperand();
					CalculatorOneOperand calculator = CalculatorProxy.getInstance();
					result = calculator.doAction(firstOperand);	
				} else {
					getUserInputForFirstOperand();
					getUserInputForSecondOperand();
					CalculatorTwoOperands calculator = CalculatorProxy.getInstance();
					result = calculator.doAction(action, firstOperand, secondOperand);	
				}
				
				System.out.println("Result: " + result);
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("Try again");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				System.out.println("Try again");
			} catch (CustomException e) {
				System.out.println(e.getMessage());
				System.out.println("Try again");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Try again");
			} 
			
		}
	}
	
	private static boolean isExit(String actionString) {	
		if(actionString.toLowerCase().contains("exit")) {
			return true;
		}
		return false;
	}
	
	private static String getUserActionInput() {
		System.out.print("Enter the action (+ - * / s): ");
		String actionString = scanner.next();
		return actionString.toLowerCase();
	}
	
	private static void getUserInputForFirstOperand() {
		System.out.print("Enter the first operand: ");
		firstOperand = scanner.nextDouble();
	}
	
	private static void getUserInputForSecondOperand() {
		System.out.print("Enter the second operand: ");
		secondOperand = scanner.nextDouble();
	}
}
