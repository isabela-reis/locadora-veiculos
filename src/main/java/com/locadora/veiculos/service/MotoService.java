package com.locadora.veiculos.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locadora.veiculos.model.entities.MotoEntity;
import com.locadora.veiculos.repository.MotoRepository;

@Service
public class MotoService {


	    @Autowired
	    private MotoRepository motoRepository;

	    /**
	     * Salva ou atualiza uma moto no banco de dados.
	     *
	     * @param moto A entidade da moto a ser salva.
	     * @return A entidade da moto salva.
	     */
	    public MotoEntity salvarMoto(MotoEntity moto) {
	        return motoRepository.save(moto);
	    }

	    /**
	     * Lista todas as motos presentes no banco de dados.
	     *
	     * @return Uma lista de todas as entidades de motos.
	     */
	    public List<MotoEntity> listarTodasAsMotos() {
	        return motoRepository.findAll();
	    }

	    /**
	     * Busca uma moto pelo seu ID.
	     *
	     * @param id O ID da moto.
	     * @return A entidade da moto correspondente ao ID, ou null se não for encontrada.
	     */
	    public MotoEntity buscarMotoPorId(Long id) {
	        return motoRepository.findById(id).orElse(null);
	    }

	    /**
	     * Busca uma moto pelo número da placa.
	     *
	     * @param placa O número da placa da moto.
	     * @return A entidade da moto correspondente ao número da placa, ou null se não for encontrada.
	     */
	    public MotoEntity buscarMotoPorPlaca(String placa) {
	        return motoRepository.findByPlaca(placa);
	    }

	    /**
	     * Deleta uma moto pelo seu ID.
	     *
	     * @param id O ID da moto a ser deletada.
	     */
	    public void deletarMoto(Long id) {
	        motoRepository.deleteById(id);
	    }

	    /**
	     * Lista todas as motos disponíveis.
	     * Esse método é usado para encontrar todas as motos que estão atualmente disponíveis para aluguel.
	     *
	     * @return Uma lista de motos disponíveis.
	     * @throws RuntimeException Se houver um erro ao acessar o banco de dados.
	     */
	    public List<MotoEntity> listarMotosDisponiveis() {
	        try {
	            return motoRepository.findByDisponivel(true);
	        } catch (Exception e) {
	            throw new RuntimeException("Erro ao buscar motos disponíveis", e);
	        }
	    }
}


