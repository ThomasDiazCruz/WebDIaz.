package co.edu.udistrital.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named ("beanP")
@RequestScoped

public class BeanPrueba {
	
	public String getPrueba() {
		
		return "JSF y Bean OK";
	}

}
