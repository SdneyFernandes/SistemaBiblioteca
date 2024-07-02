package model;

import java.util.List;

public class Livro {

    /* Instanciar Autor : Isso ajuda a manter a integridade dos dados, quando você cria um Livroobjeto,
    você precisa fornecer um Autorobjeto porque um livro não pode existir sem um autor.
    Ao instanciar um Autorobjeto e passá-lo para o Livroconstrutor, você está estabelecendo
    o relacionamento entre o livro e seu autor
     */

    private String titulo;
    private Autor autor;
    private List<String> generos;
    private boolean emprestado;

    // boolean emprestado não aparece no contrutor porque por padrão ele é false, o livro por padrão não esta emprestado
    // por isso tera um metodo seter
    public Livro(String titulo, Autor autor, List<String> generos){
        this.titulo = titulo;
        this.autor = autor;
        this.generos = generos;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
