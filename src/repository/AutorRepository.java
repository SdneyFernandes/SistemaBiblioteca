package repository;

import model.Autor;

import java.util.ArrayList;
import java.util.List;


public class AutorRepository {
    private List<Autor> autores = new ArrayList<>();

    public void salvar(Autor autor) {
        autores.add(autor);
    }

    public Autor buscarPorNome(String nome) {
        return autores.stream()
                .filter(autor -> autor.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
