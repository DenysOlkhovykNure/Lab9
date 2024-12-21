package calculator.com;

public interface CalculatorOneOperand {
	
	/**
	 * Returns sqrt of a number
	 * @param firstOperand
	 * @return sqtr of the operand
	 * @throws CustomException 
	 */
	public double doAction(double operand) throws CustomException;
}
