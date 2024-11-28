package com.locadora.veiculos.model.entities;
import java.util.Date;
import java.util.Objects;

import com.locadora.veiculos.model.Veiculo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class VeiculoEntity implements Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String modelo;
	private String placa;
	private String montadora;
	private boolean disponivel;
	private Date date;
	
	public VeiculoEntity(String modelo, String placa, String montadora, boolean disponivel, Date date) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.montadora = montadora;
		this.disponivel = disponivel;
		this.date = date;
	}

	public Long getId() {
		return id;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "VeiculoEntity [modelo=" + modelo +
				", placa=" + placa + 
				", montadora=" + montadora + 
				", disponivel=" + disponivel + 
				", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, disponivel, id, modelo, montadora, placa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VeiculoEntity other = (VeiculoEntity) obj;
		return Objects.equals(date, other.date) && disponivel == other.disponivel && Objects.equals(id, other.id)
				&& Objects.equals(modelo, other.modelo) && Objects.equals(montadora, other.montadora)
				&& Objects.equals(placa, other.placa);
	}
	
	}

