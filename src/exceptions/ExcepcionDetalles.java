package exceptions;

public class ExcepcionDetalles extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public ExcepcionDetalles(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return this.msg;
	}

}