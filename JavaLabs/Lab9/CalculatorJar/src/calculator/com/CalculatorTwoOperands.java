package calculator.com;

public interface CalculatorTwoOperands {
	
	/**
	 * Executes operation on two operands
	 * @param action action to do: ('+' '-' '*' '/')
	 * @param firstOperand 
	 * @param secondOperand
	 * @return result on actions
	 */
	public double doAction(char action, double firstOperand, double secondOperand);
	
}
