package exceptions;

public class ExcepcionDetalles extends Exception {
	String msg;

	public ExcepcionDetalles(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return this.msg;
	}

}