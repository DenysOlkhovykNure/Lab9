package calculator.com;

public class CalculatorProxy implements CalculatorTwoOperands, CalculatorOneOperand {

	private static CalculatorImpl calculatorImp;
	private static CalculatorProxy calculatorProxy;
	
	private CalculatorProxy() {
		calculatorImp = new CalculatorImpl();
	}
	
	@Override
	public double doAction(char action, double firstOperand, double secondOperand) {
		return calculatorImp.doAction(action, firstOperand, secondOperand);
	}

	@Override
	public double doAction(double operand) throws CustomException {
		return calculatorImp.doAction(operand);
	}
	
	public static CalculatorProxy getInstance() {
		if(calculatorProxy == null) {
			calculatorProxy = new CalculatorProxy();
		}
		
		return calculatorProxy;
	}
	
}
