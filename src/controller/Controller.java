package controller;

import java.util.ArrayList;

import java.util.List;

import exceptions.*;
import model.*;

public class Controller {

	private List<Donacion> donaciones = new ArrayList<>();
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