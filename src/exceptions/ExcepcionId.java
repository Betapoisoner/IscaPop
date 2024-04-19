package exceptions;

public class ExcepcionId extends Exception {

	String msg;

	public ExcepcionId(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return this.msg;
	}
}
