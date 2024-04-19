package exceptions;

public class ExcepcionArticulo extends Exception {
	String msg;

	public ExcepcionArticulo(String msg) {
		this.msg=msg;
	}
	
	public String toString() {
		return this.msg;
	}

}