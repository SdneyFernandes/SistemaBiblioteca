package util;

import model.Autor;
import model.Livro;
import model.Usuario;

import java.util.List;

public abstract class AbstractFactory {
    public abstract Livro createLivro(String titulo, Autor autor, List<String> generos);
    public abstract Autor createAutor(String nome, String nacionalidade);
    public abstract Usuario createUsuario(String nome, String email);
}
