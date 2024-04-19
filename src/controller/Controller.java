package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Articulo;
import model.Donacion;

public class Controller {

    private List<Donacion> donaciones;
    private List<Articulo> articulos;

    public Controller() {
        this.donaciones = new ArrayList<>();
        this.articulos = new ArrayList<>();
    }

    public Donacion getIdDonacion(String idDonacion) {
        for (Donacion donacion : donaciones) {
            if (donacion.getIdDonacion().equals(idDonacion)) {
                return donacion;
            }
        }
        return null;
    }

    public void agregarDonacion(Donacion donacion) {
        donaciones.add(donacion);
    }

    public void eliminarDonacion(Donacion donacion) {
        Iterator<Donacion> iterator = donaciones.iterator();
        while (iterator.hasNext()) {
            Donacion d = iterator.next();
            if (d.getIdDonacion().equals(donacion.getIdDonacion())) {
                iterator.remove();
                return;
            }
        }
    }
    
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void eliminarArticulo(String idArticulo) {
        Iterator<Articulo> iterator = articulos.iterator();
        while (iterator.hasNext()) {
            Articulo articulo = iterator.next();
            if (articulo.getId().equals(idArticulo)) {
                iterator.remove();
                return;
            }
        }
    }

    public Articulo buscarArticuloPorId(String idArticulo) {
        for (Articulo articulo : articulos) {
            if (articulo.getId().equals(idArticulo)) {
                return articulo;
            }
        }
        return null;
    }
    
    
    
}
