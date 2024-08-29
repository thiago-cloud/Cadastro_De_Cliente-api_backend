package br.com.projeto.api_cliente.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api_cliente.model.Cliente;
import br.com.projeto.api_cliente.repositorio.Repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@CrossOrigin(origins = "*")//O crossOtigin permite que front-end possa fazer uma requisição sem que possa dar o error de cors, Esse erro acontece porque a porta do backend e do frontend são diferentes nisso e acionado a segurança do browser chamada de cors que no caso bloqueia essa conexão.
public class Controle {

    //Aqui instanciaremos um objeto do tipo repositorio para ser utilizado nas rotas para não ter muito trabalho em intanciar o objeto utilizaremos o AuthoWired
    @Autowired
    private Repositorio acao;

    //Cadastrar clientes
    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c) {
        return acao.save(c);
    }
    
    //Listar Clientes
    //Vai listar os clientes
    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return acao.findAll();
    }

    //Editar Clientes
    //O save tem tanto a função de editar como a de cadastrar
    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente c) {
        return acao.save(c);
    }

    //Deletar clientes
    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable long codigo){
        acao.deleteById(codigo);
    }
    
    
    
}
