package com.locadora.veiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locadora.veiculos.model.entities.VeiculoEntity;
import com.locadora.veiculos.service.VeiculoService;

/**
 * Controlador REST para gerenciar operações de veículos.
 * Mapeia as requisições HTTP para os métodos do serviço de veículo.
 */
@RestController
@RequestMapping("/api/veiculos")
public abstract class VeiculoController<T extends VeiculoEntity, S extends VeiculoService<T>> {

    @Autowired
    private S veiculoService;

    /**
     * Lista todos os veículos presentes no banco de dados.
     *
     * @return Uma lista de todas as entidades de veículos.
     */
    @GetMapping("/todos")
    public List<T> listarTodosOsVeiculos() {
        return veiculoService.listarTodosOsVeiculos();
    }

    /**
     * Busca um veículo pelo seu ID.
     *
     * @param id O ID do veículo.
     * @return A entidade do veículo correspondente ao ID, ou null se não for encontrado.
     */
    @GetMapping("/{id}")
    public T buscarVeiculoPorId(@PathVariable Long id) {
        return veiculoService.buscarVeiculoPorId(id);
    }

    /**
     * Salva um novo veículo no banco de dados.
     *
     * @param veiculo A entidade do veículo a ser salva.
     * @return A entidade do veículo salva.
     */
    @PostMapping("/salvar")
    public T salvarVeiculo(@RequestBody T veiculo) {
        return veiculoService.salvarVeiculo(veiculo);
    }

    /**
     * Deleta um veículo pelo seu ID.
     *
     * @param id O ID do veículo a ser deletado.
     */
    @DeleteMapping("/deletar/{id}")
    public void deletarVeiculo(@PathVariable Long id) {
        veiculoService.deletarVeiculo(id);
    }
}
