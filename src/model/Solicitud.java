package model;

public class Solicitud {
	private String idSolicitud;
	private String fecha;
	private EstadosSoli estado;

	public Solicitud(String idSolicitud,String fecha) {
		this.idSolicitud = idSolicitud;
		this.fecha = fecha;
		this.estado = estado.PENDIENTE;
	}

	public String getIdSolicitud() {
		return idSolicitud;
	}

	public String getFecha() {
		return fecha;
	}

	public String getEstado() {
		return estado.toString();
	}
	
}
