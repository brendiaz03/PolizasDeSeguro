package ar.edu.unlam.pb2;

public class Auto implements Asegurable{
	
	private String marca;
	private String modelo;
	private Integer anio;
	private Double sumaAsegurada;
	
	public Auto(String marca, String modelo, Integer anio, Double sUMA_ASEGURADA) {
		this.marca=marca;
		this.modelo=modelo;
		this.anio=anio;
		this.sumaAsegurada=sUMA_ASEGURADA;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	
	

}
