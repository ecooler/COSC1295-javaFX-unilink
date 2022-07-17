package model.exception;

public class InvalidOfferPriceException extends Exception {

	private static final long serialVersionUID = 338212130975608738L;
	
	public InvalidOfferPriceException() {
		super("Invalid Offer Price");
	}

}
