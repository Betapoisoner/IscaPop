package exceptions;

public class ExcepcionCantidad extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public ExcepcionCantidad(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return this.msg;
	}

}
