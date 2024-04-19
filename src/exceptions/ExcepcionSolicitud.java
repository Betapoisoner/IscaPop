package exceptions;

public class ExcepcionSolicitud extends Exception {
	String msg;

	public ExcepcionSolicitud(String msg) {
		this.msg=msg;
	}
	
	public String toString() {
		return this.msg;
	}

}