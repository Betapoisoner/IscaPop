package exceptions;

public class ExcepcionCentro extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public ExcepcionCentro(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return this.msg;
	}

}
