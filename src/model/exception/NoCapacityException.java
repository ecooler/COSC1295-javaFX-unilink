package model.exception;

public class NoCapacityException extends Exception {

	private static final long serialVersionUID = -6901227909986315566L;
	
	public NoCapacityException() {
		super("No Capacity");
	}
}
