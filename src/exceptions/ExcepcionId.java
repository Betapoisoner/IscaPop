package exceptions;

public class ExcepcionId extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public ExcepcionId(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return this.msg;
	}
}
