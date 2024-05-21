package exceptions;

public class ExcepcionSolicitud extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public ExcepcionSolicitud(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return this.msg;
	}

}