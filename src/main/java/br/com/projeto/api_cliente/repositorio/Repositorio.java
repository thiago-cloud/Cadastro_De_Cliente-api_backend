package br.com.projeto.api_cliente.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api_cliente.model.Cliente;

//O arquivo repositorio permitira ações no banco de dados como um crud por exemplo
//Como nosso id que é a chave primaria e do tipo long colocamos a classe wrapper do tipo Long em tipo de Cliente
@Repository
public interface Repositorio extends CrudRepository<Cliente, Long>{
    
}
