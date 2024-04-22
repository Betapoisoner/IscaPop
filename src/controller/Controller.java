package controller;

import java.util.ArrayList;

import java.util.List;

import exceptions.*;
import model.*;

public class Controller {

	private List<Donacion> donaciones = new ArrayList<>();
	private List<Articulo> articulos = new ArrayList<>();
	private List<Centro> centros = new ArrayList<>();
	private List<Solicitud> solicitudes = new ArrayList<>();

	public Controller() {

	}

	public Donacion buscar_don(String idDonacion) throws ExcepcionDonacion {
		for (Donacion donacion : donaciones)
			if (donacion.getId_Donacion().equals(idDonacion))
				return donacion;
		throw new ExcepcionDonacion("La doncion no se encuentra");
	}

	public Articulo buscar_arti(String idArticulo) throws ExcepcionArticulo {
		for (Articulo articulo : articulos)
			if (articulo.getId().equals(idArticulo))
				return articulo;
		throw new ExcepcionArticulo("No se ha encontrado el articulo");
	}

	public Centro buscar_centro(String idCentro) throws ExcepcionCentro {
		for (Centro centro : centros)
			if (centro.getId_Centro().equals(idCentro))
				return centro;
		throw new ExcepcionCentro("No se ha enconrtado el centro");
	}

	public Solicitud buscar_soli(String idSoli) throws ExcepcionSolicitud {
		for (Solicitud soli : solicitudes)
			if (soli.getIdSolicitud().equals(idSoli))
				return soli;
		throw new ExcepcionSolicitud("No se ha enconrtado la solicitud");
	}
}