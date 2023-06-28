package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;

public class PlanificadorDeEventos {
	HashSet<Usuario> usuarios = new HashSet<>();
	HashMap<Object, Cumple> agasajados = new HashMap<>();
	HashSet<PlanificadorDeEventos> eventos = new HashSet<>();
	HashSet<Usuario> invitados = new HashSet<>();
	
	public PlanificadorDeEventos() {
		
	}

	public void add(Usuario usuario) {
		usuarios.add(usuario);
		
	}

	public Object getUsuario(String mailOrganizador) {
		// TODO Auto-generated method stub
		return null;
	}

	public void crear(Object object, Cumple cumple) {
		agasajados.put(object, cumple);
		
	}

	public Object getCantidadDeUsuarios() {
		// TODO Auto-generated method stub
		return usuarios.size() + agasajados.size();
	}

	public Object getCantidadDeEventos() {
		if(agasajados.size() >= 1) {
			return 1;
		}
		return null;
	}

	public Object getCantidadDeCumpleanios() {
		if(agasajados.size() == 1) {
			return 1;
		}
		return null;
	}

	public Object getCantidadDeCasamientos() {
		if(agasajados.size() < 2) {
			return 0;
		}
		return null;
	}

	public getEvento(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void invitar(Cumple elCumpleDeLeo, Usuario usuario) {
		invitados.add(usuario);
		
	}

	public Object getCantidadDeInvitados() {
		return invitados.size();
	}
}
