package model;

public class Articulo {
    private String id;
    private String estado;
    private String nombre;
    private String descripcion;
    private int cantidad;

    public Articulo( String id, String estado, String nombre, String descripcion, int cantidad) {

        this.id = id;
        this.estado = estado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }
}