package model.exception;

public class PostClosedException extends Exception {

	private static final long serialVersionUID = 5666675915495610332L;

	public PostClosedException() {
		super("Post Already Closed");
	}
}
