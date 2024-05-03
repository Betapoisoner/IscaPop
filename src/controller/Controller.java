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
		throw new ExcepcionCentro("No se ha encontrado el centro");
	}
	
	public Centro buscar_centro_no_ex(String idCentro) {
		for (Centro centro : centros)
			if (centro.getId_Centro().equals(idCentro))
				return centro;
		return null;
	}

	public Solicitud buscar_soli(String idSoli) throws ExcepcionSolicitud {
		for (Solicitud soli : solicitudes)
			if (soli.getIdSolicitud().equals(idSoli))
				return soli;
		throw new ExcepcionSolicitud("No se ha enconrtado la solicitud");
	}

	public Centro iniciar_sesion(String usuario, String contrasena) throws ExcepcionCentro {
		Centro c = buscar_centro(usuario);
		if (!c.getContrasena().equals(contrasena))
			throw new ExcepcionCentro("La contraseña es incorrecta");
		else {
			return c;
		}
	}
	
	public Centro registro(String usuario, String contrasena,String nombre) throws ExcepcionCentro {
		Centro c = buscar_centro_no_ex(usuario);
		if (c!=null) throw new ExcepcionCentro("El centro ya esta registrado");
		else {
			c = new Centro(usuario, nombre, contrasena);
			centros.add(c);
			return c;
		}
	}
	
	

}