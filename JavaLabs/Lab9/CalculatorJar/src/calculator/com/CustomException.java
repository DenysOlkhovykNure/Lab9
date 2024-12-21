package calculator.com;

public class CustomException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public CustomException(double param) {
		super("Parameter out of range for tangent calculation.\nMust be: -90 <= param <= 90, even though param = " + param);
	}

}
