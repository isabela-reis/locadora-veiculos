package com.locadora.veiculos.model.entities;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class MotoEntity extends VeiculoEntity {
	public MotoEntity(String modelo, String placa, String montadora, boolean disponivel, Date date, String cilindradas) {
		super(modelo, placa, montadora, disponivel, date);
		 this.cilindradas = cilindradas;
	}

	private String cilindradas;

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "MotoEntity{" + "cilindradas='" + cilindradas + '\'' + 
				", " + super.toString() + 
				'}';
	}  
	@Override 
	public boolean equals(Object o) { 
		if (this == o) return true; 
		if (o == null || getClass() != o.getClass()) return false; 
		if (!super.equals(o)) return false; 
		MotoEntity that = (MotoEntity) o; 
		return Objects.equals(cilindradas, that.cilindradas); 
		} 
	
	@Override public int hashCode() { 
		return Objects.hash(super.hashCode(), cilindradas);

}
}