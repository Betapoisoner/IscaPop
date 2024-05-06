package exceptions;

public class ExcepcionArticulo extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public ExcepcionArticulo(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return this.msg;
	}

}