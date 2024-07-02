package service;

import model.Livro;
import repository.LivroRepository;
import util.CustomException;

import java.util.List;

public class LivroService {
    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public void cadastrarLivro(Livro livro) throws CustomException {
        if (livroRepository.buscarPorTitulo(livro.getTitulo()) != null) {
            throw new CustomException("Livro já cadastrado!");
        }
        livroRepository.salvar(livro);
    }

    public Livro buscarPorTitulo(String titulo) {
        return livroRepository.buscarPorTitulo(titulo);
    }

    public List<Livro> listarLivros() {
        return livroRepository.listarTodos();
    }
}
