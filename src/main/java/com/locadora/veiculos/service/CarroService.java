package com.locadora.veiculos.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locadora.veiculos.model.entities.CarroEntity;
import com.locadora.veiculos.repository.CarroRepository;

@Service
public class CarroService {

	    @Autowired
	    private CarroRepository carroRepository;

	    /**
	     * Salva ou atualiza um carro no banco de dados.
	     *
	     * @param carro A entidade do carro a ser salva.
	     * @return A entidade do carro salva.
	     **/
	    public CarroEntity salvarCarro(CarroEntity carro) {
	        return carroRepository.save(carro);
	    }

	    /**
	     * Lista todos os carros presentes no banco de dados.
	     *
	     * @return Uma lista de todas as entidades de carros.
	     **/
	    public List<CarroEntity> listarTodosOsCarros() {
	        return carroRepository.findAll();
	    }

	    /**
	     * Busca um carro pelo seu ID.
	     *
	     * @param id O ID do carro.
	     * @return A entidade do carro correspondente ao ID, ou null se não for encontrado.
	     **/
	    public CarroEntity buscarCarroPorId(Long id) {
	        return carroRepository.findById(id).orElse(null);
	    }

	    /**
	     * Busca um carro pelo número da placa.
	     *
	     * @param placa O número da placa do carro.
	     * @return A entidade do carro correspondente ao número da placa, ou null se não for encontrado.
	     **/
	    public CarroEntity buscarCarroPorPlaca(String placa) {
	        return carroRepository.findByPlaca(placa);
	    }

	    /**
	     * Deleta um carro pelo seu ID.
	     *
	     * @param id O ID do carro a ser deletado.
	     **/
	    public void deletarCarro(Long id) {
	        carroRepository.deleteById(id);
	    }
	    
	    /**
	     * Lista todos os carros disponíveis.
	     * Esse método é usado para encontrar todos os carros que estão atualmente disponíveis para aluguel.
	     *
	     * @return Uma lista de carros disponíveis.
	     * @throws RuntimeException Se houver um erro ao acessar o banco de dados.
	     */
	    public List<CarroEntity> listarCarrosDisponiveis() {
	        try {
	            return carroRepository.findByDisponivel(true);
	        } catch (Exception e) {
	            throw new RuntimeException("Erro ao buscar carros disponíveis", e);
	        }
	    }

}


    

    
    
   
    
  

