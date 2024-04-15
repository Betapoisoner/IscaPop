package model;

public class Articulo {
    private String idCentro;
    private String id;
    private String estado;
    private String nombre;
    private String descripcion;
    private int cantidad;

    public Articulo(String idCentro, String id, String estado, String nombre, String descripcion, int cantidad) {
        this.idCentro = idCentro;
        this.id = id;
        this.estado = estado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }
}