package service;

import model.Autor;
import repository.AutorRepository;
import util.CustomException;
import util.CustomException;

public class AutorService {
    private AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public void cadastrarAutor(Autor autor) throws CustomException {
        if (autorRepository.buscarPorNome(autor.getNome()) != null) {
            throw new CustomException("Autor já cadastrado!");
        }
        autorRepository.salvar(autor);
    }

    public Autor buscarPorNome(String nome) {
        return autorRepository.buscarPorNome(nome);
    }


}
