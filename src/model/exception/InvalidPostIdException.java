package model.exception;

public class InvalidPostIdException extends Exception {
	
	private static final long serialVersionUID = -3833267996165744444L;

	public InvalidPostIdException() {
		super("Invalid Post Id");
	}
}
