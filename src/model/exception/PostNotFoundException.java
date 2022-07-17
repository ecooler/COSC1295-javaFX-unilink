package model.exception;

public class PostNotFoundException extends Exception {

	private static final long serialVersionUID = 4460541144208529197L;

	public PostNotFoundException() {
		super("Post Not Found");
	}

}
