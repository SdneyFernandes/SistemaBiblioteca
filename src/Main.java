
import model.Autor;
import model.Livro;
import model.Usuario;
import repository.AutorRepository;
import repository.LivroRepository;
import repository.UsuarioRepository;
import service.AutorService;
import service.LivroService;
import service.UsuarioService;
import util.CustomException;
import util.ReflectionsUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AutorRepository autorRepository = new AutorRepository();
        LivroRepository livroRepository = new LivroRepository();
        UsuarioRepository usuarioRepository = new UsuarioRepository();

        AutorService autorService = new AutorService(autorRepository);
        LivroService livroService = new LivroService(livroRepository);
        UsuarioService usuarioService = new UsuarioService(usuarioRepository);

        try {
            // Cadastro de Autor
            Autor autor = new Autor("J.K. Rowling", "Britânica");
            autorService.cadastrarAutor(autor);
            System.out.println("Autor cadastrado com sucesso.");

            // Cadastro de Livro
            Livro livro = new Livro("Harry Potter", autor, Arrays.asList("Fantasia", "Aventura"));
            livroService.cadastrarLivro(livro);
            System.out.println("Livro cadastrado com sucesso.");

            // Cadastro de Usuário
            Usuario usuario = new Usuario("João Silva", "joao.silva@email.com");
            usuarioService.cadastrarUsuario(usuario);
            System.out.println("Usuário cadastrado com sucesso.");

            // Reflection para imprimir métodos e campos da classe Livro
            System.out.println("\nMétodos da classe Livro:");
            ReflectionsUtil.printClassMethods(Livro.class);

            System.out.println("\nCampos da classe Livro:");
            ReflectionsUtil.printClassFields(Livro.class);

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
