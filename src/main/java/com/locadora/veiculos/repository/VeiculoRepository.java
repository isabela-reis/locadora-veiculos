package com.locadora.veiculos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.locadora.veiculos.model.entities.VeiculoEntity;

	@NoRepositoryBean
	public interface VeiculoRepository<T extends VeiculoEntity> extends JpaRepository<T, Long> {

		/** 
		 * Busca um veículo pelo seu número de placa. 
		 * 
		 * @param placa O número da placa do veículo. 
		 * @return O veículo correspondente ao número da placa. 
		 */
	    T findByPlaca(String placa);

	    /** Encontra veículos pela disponibilidade. 
	     *  
	     *  @param disponivel Um booleano indicando se o veículo está disponível. 
	     *  True para veículos disponíveis, false para veículos indisponíveis. 
	     *  @return Uma lista de veículos que correspondem ao critério de disponibilidade. 
	     */
	    List<T> findByDisponivel(boolean disponivel);
	
}
