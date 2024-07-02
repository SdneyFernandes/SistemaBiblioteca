package repository;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List<Livro> livros = new ArrayList<>();

    public void salvar(Livro livro) {
        livros.add(livro);
    }

    public Livro buscarPorTitulo(String titulo) {
        return livros.stream()
                .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    public List<Livro> listarTodos() {
        return livros;
    }
}
