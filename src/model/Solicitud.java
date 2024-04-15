package model;

public class Solicitud {
    private String idSolicitud;
    private String estado;
    private String fecha;

    public Solicitud(String idSolicitud, String estado, String fecha) {
        this.idSolicitud = idSolicitud;
        this.estado = estado;
        this.fecha = fecha;
    }
}
