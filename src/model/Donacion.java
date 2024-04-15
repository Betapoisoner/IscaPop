package model;

public class Donacion {
    private String idDonacion;
    private String centroDonante;
    private String centroReceptor;

    public Donacion(String idDonacion, String centroDonante, String centroReceptor) {
        this.idDonacion = idDonacion;
        this.centroDonante = centroDonante;
        this.centroReceptor = centroReceptor;
    }
}
