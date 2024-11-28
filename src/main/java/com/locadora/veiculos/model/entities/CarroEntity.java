package com.locadora.veiculos.model.entities;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;


@Entity
public class CarroEntity extends VeiculoEntity {
	private String motor;
	
    public CarroEntity(String modelo, String placa, String montadora, boolean disponivel, Date date, String motor) {
		super(modelo, placa, montadora, disponivel, date);
	    this.motor = motor;
	    }

	    public String getMotor() {
	        return motor;
	    }

	    public void setMotor(String motor) {
	        this.motor = motor;
	    }

	    @Override
	    public String toString() {
	        return "CarroEntity{" +
	                "motor='" + motor + '\'' +
	                ", " + super.toString() +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        if (!super.equals(o)) return false;
	        CarroEntity that = (CarroEntity) o;
	        return Objects.equals(motor, that.motor);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(super.hashCode(), motor);
	    }
	}