package com.choucair.test.EmpleosObjects;

import org.apache.tools.ant.types.resources.selectors.Exists;
import org.apache.xerces.impl.xpath.XPath;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

import com.choucair.test.EmpleosSteps.EmpleosSteps;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.thucydides.core.annotations.DefaultUrl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;



@DefaultUrl("https://www.choucairtesting.com/")

public class EmpleosObjects extends PageObject {

	
	
	static By btncookies = By.xpath("//*[@id=\"cookie_action_close_header\"]");
	static By moduloempleos = By.xpath("//*[@id=\"menu-item-550\"]/a");
	static By Convocatorias = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/div/h3/a");
	static By iconochoucair = By.xpath("//*[@id=\"masthead\"]/div/div/div/div[1]/a/img");
	static By btnregreso = By.xpath("//*[@id=\"page\"]/a[2]");
	static By esloganpagprincipal = By.xpath("//*[@id=\"slideshow\"]/div[2]/div/h2");
	static By bannerempleos = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[1]/div/div/div/div/div/div/div/div/img");
	static By btnprepararse = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/div/figure/a/img");
	static By keyword = By.xpath("//*[@id=\"search_keywords\"]");
	static By location = By.xpath("//*[@id=\"search_location\"]");
	static By btnbuscar  = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input");
	static By listafiltrada  = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul");
	static By primeraeleccion  = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li[1]/a");
	
	
	
	
	
	public void ingresoempleos() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		element(moduloempleos).click();
		Thread.sleep(3000);
		System.out.println("se dio el ingreso a empleos");
	}

	public void validoingreso() throws InterruptedException {
		// TODO Auto-generated method stub
		
			if (find(Convocatorias).isVisible()) {
				System.out.println("Se encontro el modulo empleos");
				Thread.sleep(3000);
			}else{
				
				System.out.println("no se encontro el modulo empleos");
			}
		}
		
	
	
	
	
	public void navegarmodulo() throws  InterruptedException {
		// TODO Auto-generated method stub
		
	
		if (find(btncookies).isVisible()) {
			System.out.println("Se encontro el boton cookies");
			find(btncookies).click();
			
		}else{
			
			System.out.println("no se encontro el boton cookie");
		}
		Thread.sleep(2000);
		if (find(btnprepararse).isVisible()) {
			find(btnprepararse).click();
			System.out.println("Di click en boton prepararse");
			
		}
		
	
		if (find(iconochoucair).isVisible()) {
			System.out.println("Se encontro el icono de choucair navegando");
			Thread.sleep(2000);
		}else{
			
			System.out.println("no se encontro el icono de choucair navegando");
		}

	}





	public void botonregresar() throws InterruptedException {
		// TODO Auto-generated method stub
		
if (find(btnregreso).isVisible()) {
			
			System.out.println("Se encontro el boton de regreso");
			Thread.sleep(2000);
			find(btnregreso).click();
			System.out.println("Se retorno al inicio de la pagina con el boton");
			
		}else{
			
			System.out.println("no se encontro el boton de regreso");
		}
	}

	
	
	
	public void iconochoucair() throws InterruptedException {
		// TODO Auto-generated method stub
		
		if (find(iconochoucair).isVisible()) {
			System.out.println("Se encontro el icono de choucair navegando");
			find(iconochoucair).click();
			Thread.sleep(3000);
			
		}else{
			
			System.out.println("no se encontro el icono de choucair navegando");
		}
	}

	
	
	
	public void retornomodulo() throws InterruptedException {
		// TODO Auto-generated method stub
		
		if (find(esloganpagprincipal).isVisible()) {
			System.out.println("Se encontro el eslogan de la pagina principal");
			Thread.sleep(3000);
			find(moduloempleos).click();
			System.out.println("Se retorna al modulo de empleos");
			Thread.sleep(5000);
		}else{
			
			System.out.println("no se encontro el eslogan de la pagina principal");
			find(moduloempleos).click();
			System.out.println("Se retorna al modulo de empleos");
			Thread.sleep(3000);
		}
		
		
	}
	
	
	
	
	
	

	public void ingresarOcupacion(String ocupacion) throws InterruptedException {
		// TODO Auto-generated method stub
		
		if (find(keyword).isVisible()) {
			System.out.println("Se encontro el campo de cargo");
			find(keyword).clear();
			Thread.sleep(3000);
			find(keyword).type(ocupacion);
			Thread.sleep(3000);
			System.out.println("Se ingreso la informacion en el campo del cargo");
			
		}else{
			
			System.out.println("no se pudo ingresar la informacion en el campo del cargo");
		
		
		}
		
		
		
	}

	public void ingresarLocalidad(String localidad) throws InterruptedException {
		// TODO Auto-generated method stub
		
		if (find(location).isVisible()) {
			System.out.println("Se encontro el campo de cargo");
			find(location).clear();
			Thread.sleep(5000);
			find(location).type(localidad);
			Thread.sleep(5000);
			System.out.println("Se ingreso la informacion en el campo del cargo");
			
		}else{
			
			System.out.println("no se pudo ingresar la informacion en el campo del cargo");
		
		
		}
		
		
		
	}

	public void realizarBusqueda() throws InterruptedException {
		// TODO Auto-generated method stub
		
		if (find(btnbuscar).isVisible()) {
			System.out.println("Se encontro el campo de cargo");
			Thread.sleep(2000);
			find(btnbuscar).click();
			System.out.println("Se dio click en el boton buscar");

		}else{
			
			System.out.println("no se pudo dar click en el boton buscar");

		}
	}

	
	
	public void validarResultados() throws InterruptedException {
		// TODO Auto-generated method stub
		if (find(listafiltrada).isVisible()) {
			  String opcListEmpleo = find(listafiltrada).getText();
			     if (opcListEmpleo !="") {
			    	 System.out.println(opcListEmpleo);
			    	 find(primeraeleccion).click();
			    	 Thread.sleep(8000);
			    	 find(moduloempleos).click();
			    		Thread.sleep(5000); 
				 }else {
			 		 System.out.println("no se encuentraron resultados en la busqueda");
				 }       

		}else{
			
			System.out.println("no se pudo enmcontrar la lista");

		}

	}

}


