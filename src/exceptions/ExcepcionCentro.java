package exceptions;

public class ExcepcionCentro extends Exception {
	String msg;

	public ExcepcionCentro(String msg) {
		this.msg=msg;
	}
	
	public String toString() {
		return this.msg;
	}

}
