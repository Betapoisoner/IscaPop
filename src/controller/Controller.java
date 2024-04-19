package controller;

import java.util.ArrayList;

import java.util.List;

import exceptions.*;
import model.*;

public class Controller {

	private List<Donacion> donaciones = new ArrayList<>();
	private List<Detalles> detalles_don = new ArrayList<>();
	private List<Articulo> articulos = new ArrayList<>();
	private List<Centro> centros = new ArrayList<>();
	private List<Solicitud> solicitudes = new ArrayList<>();

	public Controller() {

	}

	public Donacion buscar_don(String idDonacion) throws ExcepcionDonacion {
		for (Donacion donacion : donaciones) {
			if (!donacion.getId_Donacion().equals(idDonacion)) return donacion;
		}
		throw new ExcepcionDonacion("La doncion no se encuentra"); 
	}


}
