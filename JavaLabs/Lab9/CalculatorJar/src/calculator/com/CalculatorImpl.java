package calculator.com;

public class CalculatorImpl implements CalculatorTwoOperands, CalculatorOneOperand{
	
	public CalculatorImpl() {
		
	}
	
	// + - * / actions
	@Override
	public double doAction(char action, double firstOperand, double secondOperand) {
		
		switch (action) {
		case '+': 
			return firstOperand + secondOperand;
		case '-': 	
			return firstOperand - secondOperand;	
		case '*': 
			return firstOperand * secondOperand;	
		case '/': 
			if(secondOperand == 0) {
				throw new ArithmeticException("Division by zero!!!");
			}
			return firstOperand / secondOperand;
		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}
	}

	@Override
	public double doAction(double operand) throws CustomException {
		if (operand <= -90 || operand >= 90) {
			throw new CustomException(operand);
		}
		return Math.tan(Math.toRadians(operand));
	}
}
