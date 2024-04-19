package exceptions;

public class ExcepcionDonacion extends Exception {
	String msg;

	public ExcepcionDonacion(String msg) {
		this.msg=msg;
	}

	public String toString() {
		return this.msg;
	}
}
