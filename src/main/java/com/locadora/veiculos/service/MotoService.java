package com.locadora.veiculos.service;

import org.springframework.stereotype.Service;

import com.locadora.veiculos.model.entities.MotoEntity;

/**
 * Serviço específico para operações relacionadas a motos.
 * Extende o serviço genérico VeiculoService.
 */
@Service
public class MotoService extends VeiculoService<MotoEntity> {
    // Métodos específicos para MotoEntity podem ser adicionados aqui, se necessário
}
