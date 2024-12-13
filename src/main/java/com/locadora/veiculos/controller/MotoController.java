package com.locadora.veiculos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locadora.veiculos.model.entities.MotoEntity;
import com.locadora.veiculos.service.MotoService;

/**
 * Controlador específico para operações relacionadas a motos.
 */
@RestController
@RequestMapping("/api/motos")
public class MotoController extends VeiculoController<MotoEntity, MotoService> {
}

