package model.exception;

public class RepeatReplyException extends Exception {

	private static final long serialVersionUID = -1044099923819568912L;
	
	public RepeatReplyException() {
		super("Repeat reply to the same post");
	}
}
