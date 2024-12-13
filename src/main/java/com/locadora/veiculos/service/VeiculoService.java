package com.locadora.veiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locadora.veiculos.model.entities.VeiculoEntity;
import com.locadora.veiculos.repository.VeiculoRepository;

/**
 * Serviço genérico para operações relacionadas a veículos.
 * Este serviço encapsula a lógica de negócios comum para a entidade Veiculo.
 */
@Service
public abstract class VeiculoService<T extends VeiculoEntity> {

    @Autowired
    private VeiculoRepository<T> veiculoRepository;

    /**
     * Salva ou atualiza um veículo no banco de dados.
     *
     * @param veiculo A entidade do veículo a ser salva.
     * @return A entidade do veículo salva.
     */
    public T salvarVeiculo(T veiculo) {
        return veiculoRepository.save(veiculo);
    }

    /**
     * Lista todos os veículos presentes no banco de dados.
     *
     * @return Uma lista de todas as entidades de veículos.
     */
    public List<T> listarTodosOsVeiculos() {
        return veiculoRepository.findAll();
    }

    /**
     * Busca um veículo pelo seu ID.
     *
     * @param id O ID do veículo.
     * @return A entidade do veículo correspondente ao ID, ou null se não for encontrado.
     */
    public T buscarVeiculoPorId(Long id) {
        return veiculoRepository.findById(id).orElse(null);
    }

    /**
     * Deleta um veículo pelo seu ID.
     *
     * @param id O ID do veículo a ser deletado.
     */
    public void deletarVeiculo(Long id) {
        veiculoRepository.deleteById(id);
    }

    /**
     * Lista todos os veículos disponíveis.
     *
     * @return Uma lista de veículos disponíveis.
     * @throws RuntimeException Se houver um erro ao acessar o banco de dados.
     */
    public List<T> listarVeiculosDisponiveis() {
        try {
            return veiculoRepository.findByDisponivel(true);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar veículos disponíveis", e);
        }
    }
}

