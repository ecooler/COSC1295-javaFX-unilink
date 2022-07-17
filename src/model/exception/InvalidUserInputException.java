package model.exception;

public class InvalidUserInputException extends Exception {
	
	private static final long serialVersionUID = 5413408079117563594L;

	public InvalidUserInputException() {
		super("Invalid User Input");
	}
}
