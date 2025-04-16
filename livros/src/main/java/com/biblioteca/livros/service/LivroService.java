package com.biblioteca.livros.service;

import com.biblioteca.livros.entity.Livro;
import com.biblioteca.livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired // Instância da classe
    private LivroRepository livroRepository;


    public String save(Livro livro) {
        this.livroRepository.save(livro);
        return "Livro salvo com sucesso!";
    }

    public String update(Livro livro, Long id) {
        livro.setId(id);
        this.livroRepository.save(livro);
        return "Livro foi atualizado com sucesso!";

    }


    public String delete(long id) {
        this.livroRepository.deleteById(id);
        return "Carro deletado com sucesso!";
    }

    public List<Livro> findAll() {
        List<Livro> lista = this.livroRepository.findAll();
        return lista;
    }


    public Livro findById(Long id) {

        Livro livro = this.livroRepository.findById(id).get();
        return livro;
    }

}
