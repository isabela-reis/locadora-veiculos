package com.locadora.veiculos.service;

import org.springframework.stereotype.Service;

import com.locadora.veiculos.model.entities.CarroEntity;

/**
 * Serviço específico para operações relacionadas a carros.
 * Extende o serviço genérico VeiculoService.
 */
@Service
public class CarroService extends VeiculoService<CarroEntity> {
    // Métodos específicos para CarroEntity podem ser adicionados aqui, se necessário
}
