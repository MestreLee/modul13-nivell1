package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Iterator;

import com.example.demo.beans.Empleat;
import com.example.demo.beans.Feina;

public class BaseDades {
	
	ArrayList<Empleat> empleats = new ArrayList<Empleat>();
	
	public BaseDades() {
		empleats.add(new Empleat(1,"Joan CTO", Feina.CTO));
		empleats.add(new Empleat(2,"Josep BECARI", Feina.BECARI));
		empleats.add(new Empleat(3,"Joana CEO", Feina.CEO));
		empleats.add(new Empleat(4,"Juli TECNIC", Feina.TECNIC));
		empleats.add(new Empleat(5,"Julia CMO", Feina.CMO));
		empleats.add(new Empleat(6,"Josefina ADMINISTRACIO", Feina.ADMINISTRACIO));
		empleats.add(new Empleat(7,"Carles BECARI", Feina.BECARI));
		empleats.add(new Empleat(8,"Clara TECNIC", Feina.TECNIC));
		empleats.add(new Empleat(9,"Carme ADMINISTRACIO", Feina.ADMINISTRACIO));
	}

	public ArrayList<Empleat> getEmpleats() {
		return empleats;
	}
	
	public Empleat getEmpleat(int id) {
		for(Empleat emp: empleats) {
			if(emp.getId() == id) {
				return emp;
			}				
		}
		return null;
	}

	public void setEmpleats(ArrayList<Empleat> empleats) {
		this.empleats = empleats;
	}
	
	public void insertar(Empleat empleat) {
		empleats.add(new Empleat(empleat.getId(), empleat.getNom(), empleat.getFeina()));
	}
	
	public void borrar(int id) {
		Iterator<Empleat> it = empleats.iterator();
		while(it.hasNext()) {
			Empleat emp = it.next();
			if(emp.getId() == id) {
				it.remove();
				break;
			}
		}
	}
	
	public void modificar(Empleat empleat) {
		Iterator<Empleat> it = empleats.iterator();
		while(it.hasNext()) {
			Empleat emp = it.next();
			if(emp.getId() == empleat.getId()) {
				emp.setNom(empleat.getNom());
				emp.setFeina(empleat.getFeina());
				emp.setSou(empleat.getFeina());
				break;
			}
		}
	}
	
	public ArrayList<Empleat> buscar(Feina feina) {
		ArrayList<Empleat> empleatsFeina = new ArrayList<Empleat>();
		for (Empleat empl:empleats) {
			if(empl.getFeina().equals(feina)) {
				empleatsFeina.add(empl);
			}
		}
		return empleatsFeina;
	}

}
