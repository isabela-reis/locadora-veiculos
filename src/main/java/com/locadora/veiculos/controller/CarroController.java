package com.locadora.veiculos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locadora.veiculos.model.entities.CarroEntity;
import com.locadora.veiculos.service.CarroService;

/**
 * Controlador específico para operações relacionadas a carros.
 */
@RestController
@RequestMapping("/api/carros")
public class CarroController extends VeiculoController<CarroEntity, CarroService> {
}
