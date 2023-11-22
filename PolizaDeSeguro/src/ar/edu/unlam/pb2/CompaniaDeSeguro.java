package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class CompaniaDeSeguro {
	
	private String nombre;
	private List<Seguro> polizas;

	public CompaniaDeSeguro(String nombre) {
		this.nombre=nombre;
		this.polizas= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Seguro> getPolizas() {
		return polizas;
	}

	public void setPolizas(List<Seguro> polizas) {
		this.polizas = polizas;
	}

	public Boolean agregarPoliza(Seguro poliza) {
		if(poliza != null) {
			for(Seguro s: polizas) {
				if(s.getNumeroDePoliza().equals(poliza.getNumeroDePoliza())) {
					return false;
				}
			}
			polizas.add(poliza);
			return true;
		}
		return false;
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		Integer contadorP = 0;
		for(Seguro s: polizas) {
			contadorP++;
		}
		return contadorP;
	}

	public void denunciarSiniestro(Integer numeroPoliza) throws PolizaInexistente{
		if(getPoliza(numeroPoliza) == null) {
			PolizaInexistente e = new PolizaInexistente();
			throw e;
		}else {
			Seguro poliza = getPoliza(numeroPoliza);
			poliza.setTuvoAlgunAccidente(true);
		}
		
	}

	public Seguro getPoliza(Integer numeroPoliza) {
		for(Seguro a: polizas) {
			if(a.getNumeroDePoliza().equals(numeroPoliza)) {
				return a;
			}
		}
		return null;
	}

	public void denunciarRobo(Integer numeroPoliza) {
		Seguro poliza = getPoliza(numeroPoliza);
		poliza.setFueRobado(true);	
	}
	
	
}
