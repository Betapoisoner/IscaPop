package exceptions;

public class ExcepcionCantidad extends Exception {
	String msg;

	public ExcepcionCantidad(String msg) {
		this.msg=msg;
	}
	
	public String toString() {
		return this.msg;
	}

}

