package model;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmpretimo;
    private LocalDate dataDevolução;

    public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolução) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmpretimo = dataEmprestimo;
        this.dataDevolução = dataDevolução;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmpretimo() {
        return dataEmpretimo;
    }

    public LocalDate getDataDevolução() {
        return dataDevolução;
    }
}
