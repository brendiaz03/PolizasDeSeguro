package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seguro {
	
	private Integer numeroDePoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Map<TipoDeBeneficiario, Persona> beneficiarios;
	private Double premio;
	private List<Asegurable> asegurables;
	private Boolean fueRobado;
	private Boolean tuvoAlgunAccidente;
	
	public Seguro(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		this.numeroDePoliza=numeroDePoliza;
		this.asegurado=asegurado;
		this.sumaAsegurada=sumaAsegurada;
		this.prima=prima;
		this.beneficiarios= new HashMap<>();
		this.asegurables= new ArrayList<>();
	}

	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}

	public void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	public Double getPrima() {
		return prima;
	}

	public void setPrima(Double prima) {
		this.prima = prima;
	}
	
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		beneficiarios.put(hijo2, hijo);
	}

	public Integer obtenerCantidadDeBeneficiarios() {
		Integer contador = 0;
		for(Map.Entry<TipoDeBeneficiario, Persona> entry: beneficiarios.entrySet()) {
			contador++;
		}
		return contador;
	}

	public Double getPremio() {
		return this.premio;
	}

	public void agregarPremio(Double premio) {
		this.premio=premio;	
	}
	
	
	public void agregarBienAsegurado(Asegurable nuevo) {
		if(nuevo != null) {
			asegurables.add(nuevo);
		}
	}	
	
	public Auto getAuto(String marca) {
		for(Asegurable a: asegurables) {
			if(a instanceof Auto) {
				if(((Auto) a).getMarca().equals(marca)) {
					return (Auto)a;
				}
			}
		}
		return null;
	}
	
	public Integer obtenerCantidadDeBeneficiario() {
		Integer contadorB = 0;
		for(Map.Entry<TipoDeBeneficiario, Persona> entry: beneficiarios.entrySet()) {
			contadorB++;
		}
		return contadorB;
	}

	public Boolean getFueRobado() {
		return fueRobado;
	}

	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}

	public Boolean getTuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}

	public void setTuvoAlgunAccidente(Boolean tuvoAlgunAccidente) {
		this.tuvoAlgunAccidente = tuvoAlgunAccidente;
	}

	
}
