package com.choucair.test.definitions;

import com.choucair.test.EmpleosSteps.EmpleosSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EmpleosDefinitions {
	
	@Steps
	
	EmpleosSteps empleossteps;
	

@Given("^que requiero ingresar al sitio web$")
public void que_requiero_ingresar_al_sitio_web() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	empleossteps.ingresarURL();
}


@When("^estando en el sitio web ingreso a el modulo empleos$")
public void estando_en_el_sitio_web_ingreso_a_el_modulo_empleos() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	empleossteps.ingresoempleos();
}

@Then("^valido el ingreso al modulo empleos$")
public void valido_el_ingreso_al_modulo_empleos() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	empleossteps.validoingreso();
}






@And("^se requiere ver el panel superior al navegar en el modulo$")
public void que_se_requiere_ver_el_panel_superior_al_navegar_en_el_modulo() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	empleossteps.navegarmodulo();
}

@And("^este en la parte inferior del modulo debo poder usar el boton para regresar a la parte superior$")
public void este_en_la_parte_inferior_del_modulo_debo_poder_usar_el_boton_para_regresar_a_la_parte_superior() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	empleossteps.botonregresar();
}

@And("^el icono de Choucair debe permitir redireccionar a la pagina principal$")
public void el_icono_de_Choucair_debe_permitir_redireccionar_a_la_pagina_principal() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	empleossteps.iconochoucair();
}

@Then("^valido que luego del flujo ingrese nuevamene a empleos$")
public void valido_que_luego_del_flujo_ingrese_nuevamene_a_empleos() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    empleossteps.retornomodulo();
}






@And("^ingresar mi ocupacion  \"([^\"]*)\"$")
public void ingresar_mi_ocupacion(String ocupacion) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	empleossteps.ingresarOcupacion(ocupacion);
	
}




@And("^ingresar la localidad \"([^\"]*)\"$")
public void ingresar_la_localidad(String localidad) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	empleossteps.ingresarLocalidad(localidad);
}



@And("^realizar busqueda$")
public void realizar_busqueda() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    empleossteps.realizarBusqueda();
}


@Then("^valido resultados de empleos  \"([^\"]*)\" en la  busqueda$")
public void valido_resultados_de_empleos_en_la_busqueda(String cargo) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	empleossteps.validarResultados(cargo);
}









}
