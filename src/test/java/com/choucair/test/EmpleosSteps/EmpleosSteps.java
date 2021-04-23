package com.choucair.test.EmpleosSteps;

import java.awt.AWTException;

import com.choucair.test.EmpleosObjects.EmpleosObjects;

import net.thucydides.core.annotations.Step;

public class EmpleosSteps{
	
	
	EmpleosObjects 	empleosobjects;
	
	
@Step
	public void ingresarURL() {
		// TODO Auto-generated method stub
		empleosobjects.open();
		
		
	}

@Step
	public void ingresoempleos() throws InterruptedException {
		// TODO Auto-generated method stub
		empleosobjects.ingresoempleos();
	}

@Step
	public void validoingreso() throws InterruptedException {
		// TODO Auto-generated method stub
		empleosobjects.validoingreso();
	}
	
	


	
	
	
	
@Step
	public void navegarmodulo()  throws  InterruptedException {
		// TODO Auto-generated method stub
		empleosobjects.navegarmodulo();
		
	}

@Step
	public void botonregresar() throws InterruptedException {
		// TODO Auto-generated method stub
		empleosobjects.botonregresar();
	}

@Step
	public void iconochoucair() throws InterruptedException {
		// TODO Auto-generated method stub
		empleosobjects.iconochoucair();
	}

@Step
	public void retornomodulo() throws InterruptedException {
		// TODO Auto-generated method stub
		empleosobjects.retornomodulo();
	}








@Step
public void ingresarOcupacion(String ocupacion) throws InterruptedException {
	// TODO Auto-generated method stub
	empleosobjects.ingresarOcupacion(ocupacion);
}
@Step
public void ingresarLocalidad(String localidad) throws InterruptedException {
	// TODO Auto-generated method stub
	empleosobjects.ingresarLocalidad(localidad);
}
@Step
public void realizarBusqueda() throws InterruptedException {
	// TODO Auto-generated method stub
	empleosobjects.realizarBusqueda();
}
@Step
public void validarResultados() throws InterruptedException {
	// TODO Auto-generated method stub
	empleosobjects.validarResultados();
}



}
