package model;

public class Donacion {

    private String id_Donacion;
    private String centroDonante;
    private String centroReceptor;

    public Donacion(String idDonacion, String centroDonante, String centroReceptor) {
        this.id_Donacion = idDonacion;
        this.centroDonante = centroDonante;
        this.centroReceptor = centroReceptor;
    }

    public String getIdDonacion() {
        return id_Donacion;
    }

    public void setIdDonacion(String idDonacion) {
        this.id_Donacion = idDonacion;
    }

   

}
