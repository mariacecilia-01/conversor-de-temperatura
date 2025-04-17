package br.senai.sp.conversor_de_temperatura.model;

public class Temperatura {
	
private double celsius;
	
	
	//getters and setters
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	//conversão para kelvin
	public double converterParaKelvin() {
		double conversaoKelvin = celsius + 273.15;
		return conversaoKelvin;
	
	}
	
	//conversão para fahreinheit
	public double converterParaFahreinheit() {
		double conversaoFahreinheit = (celsius * 1.8) + 32;
		return conversaoFahreinheit;
	}
	






}
