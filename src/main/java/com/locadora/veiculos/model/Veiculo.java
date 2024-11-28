package com.locadora.veiculos.model;

public interface Veiculo {

	    Long getId();
	    String getModelo();
	    String getPlaca();
	    String getMontadora();
	    boolean isDisponivel();
	    void setDisponivel(boolean disponivel);
	}

